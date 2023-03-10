//write a script to drag and dropby from source to target
//1.create actons class
//2.switch to frame
//3.storing source item in html page
//4.storing target item in html page
//5.assigning x coordinates	
//6.assigning y coordinates
//7.print x, y
//8.drag and dropby source to target
package nov29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropBy1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		
//1.create actons class
		Actions ac=new Actions(driver);
		
//2.switch to frame
		driver.switchTo().frame(0);
		
//3.storing source item in html page
		WebElement source=driver.findElement(By.id("draggable"));
		
//4.storing target item in html page		
		WebElement target=driver.findElement(By.id("droppable"));
		
//5.assigning x coordinates		
		int x=target.getLocation().getX();
		
//6.assigning y coordinates
		int y=target.getLocation().getY();
		
//7.print x, y
		System.out.println(x+"   "+y);
		
//8.drag and dropby source to target		
		ac.dragAndDropBy(source, x, y).perform();
		}
}
