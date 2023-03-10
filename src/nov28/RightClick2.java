//write a script to right click on gmail link in google page and click down arrow two times, 
//and press enter.create an gmail account enter firstname,close childwindow
//open parent window, left click on gmail, close parent window




//create actions class
//1. right click on gmail link in google page
//2. create robot class ( for right click for window related )
//3. press down arrow for two times
//4. press down arrow for two times
//5. press enter for one time
//6. create array list class ( for multiple windows handling )		
//7. switch to child window ( index 1 window )
//8. click on create an account in gmail page
//9. click first name and enter Akhilesh
//10. close child window ( index 1 window )	
//11. open parent window ( index 0 window )
//12. left click on gmail link in google page
//13. close parent window ( index 0 window )
package nov28;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class RightClick2 {

	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.get("https://google.com");
	Thread.sleep(2000);
	
	//create actions class
	Actions ac=new Actions(driver);
	
	//1.right click on gmail link in google page
	ac.moveToElement(driver.findElement(By.linkText("Gmail"))).contextClick().perform();
	
	//2.create robot class
	Robot r= new Robot();
	Thread.sleep(2000);
	
	//3.press down arrow two times
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	
	//4.press down arrow two times
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	
	//5.press enter for one time
	r.keyPress(KeyEvent.VK_ENTER);
	
	//6.create arraylist class for multiple windows
	ArrayList<String>brw=new ArrayList<String>(driver.getWindowHandles());
	
	//7.switch to child window
	driver.switchTo().window(brw.get(1));
	Thread.sleep(2000);
	
	//8.click on create an account in gmail page
	ac.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/a[3]/span[2]"))).click().perform();
	
	//9.click first name and enter Akhilesh
	driver.findElement(By.name("firstName")).sendKeys("Akhilesh");
	Thread.sleep(2000);
	
	//10.close child window
	driver.close();
	
	//11.open parent window(index 1 window)
	driver.switchTo().window(brw.get(0));
	Thread.sleep(2000);
	
	//12.left click on gmail link in google page
	ac.moveToElement(driver.findElement(By.linkText("Gmail"))).click().perform();
	Thread.sleep(4000);
	
	//13.close parent window(index 0 window)
	driver.close();

	}
}
























