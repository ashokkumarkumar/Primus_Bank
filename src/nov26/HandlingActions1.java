//write a script to perform esc,arrow down,arrow up,enter,page down,page up in google web page:
//create actions class	
//press escape key for one time
//press arrow down for three times
//press arrow up for one time
//press enter for one time
//press page down for one time
//press page up for one time
package nov26;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Thread.sleep(5000);
//create actions class	
		Actions ac=new Actions(driver);
		driver.findElement(By.name("q")).sendKeys("Selenum openings");
		Thread.sleep(3000);
//press escape key for one time	
		ac.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(3000);

//press arrow down for three times
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(4000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(4000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(8000);
		
//press arrow up for one time
		
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(4000);
		
//press enter for one time
		
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(4000);
		
//press page down for one time
		ac.sendKeys (Keys.PAGE_DOWN). perform();
		Thread.sleep(4000);
		
//press page up for one time
		ac.sendKeys (Keys.PAGE_UP). perform();
		Thread.sleep(4000);
		
		driver.close();
}
}


