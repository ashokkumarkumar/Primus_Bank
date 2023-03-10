//write a script to handling frames using dragAndDrop:

//1.create actions class
//2.get collection of frame 
//3.print no of frames
//4.switch to frame
//5.storing source item in html page
//6.storing target item in html page
//7.moving (draganddrop) item from source to target
//8.switch to main html page
//9.click on button in jqueryui.com page
package nov29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames1 {

	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.get("https://jqueryui.com/droppable/");
	Thread.sleep(2000);
	
//1.create actions class
	Actions ac=new Actions(driver);
	
//2.get collection of frame
	List<WebElement>All_items=driver.findElements(By.tagName("iframe"));
	
//3.print no of frames
	System.out.println("no of frames::"+All_items.size());
	
//4.switch to frame
	driver.switchTo().frame(0);
	
//5.storing source item in html page
	WebElement source=driver.findElement(By.id("draggable"));
	
//6.storing target item in html page
	WebElement target=driver.findElement(By.id("droppable"));
	
//7.moving (draganddrop) item to source to target
	ac.dragAndDrop(source, target).perform();
	
//8.switch to main html page
	driver.switchTo().defaultContent();
	
	Thread.sleep(2000);
	
//9.click on button in jqueryui.com page
	ac.moveToElement(driver.findElement(By.linkText("Button"))).click().perform();
	
	Thread.sleep(2000);
	
	driver.close();
	
	
	
	}

}
