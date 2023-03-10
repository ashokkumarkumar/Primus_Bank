package nov28;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Thread.sleep(4000);
		Actions ac = new Actions(driver);
		//right click on gmail link
		ac.moveToElement(driver.findElement(By.linkText("Gmail"))).contextClick().perform();
		Robot r = new Robot();
		Thread.sleep(4000);
		//press down arrow for two times
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
		//switch to child windw
		driver.switchTo().window(brw.get(1));
		Thread.sleep(4000);
		ac.moveToElement(driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/a[3]/span[2]"))).click().perform();
		driver.findElement(By.name("firstName")).sendKeys("Akhilesh");
		Thread.sleep(4000);
		driver.close();
		driver.switchTo().window(brw.get(0));
		Thread.sleep(4000);
		ac.moveToElement(driver.findElement(By.linkText("Gmail"))).click().perform();
		Thread.sleep(4000);
		driver.close();

	}

}