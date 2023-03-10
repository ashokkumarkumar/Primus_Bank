//write a script to register opencart.com page, and fill the form:
//1.create javascriptexcutor class	
//2.launch url
//3.click my account  
//4.click register 
//5.fill firstname
//6.fill lastname
//7.fill email id
//8.fill password
//9.scroll page down by 400 pixel
//10.click radio button via javascript
//11.click checkbox via javascript
//12.click submit button
package nov30;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//1.create javascriptexcutor class		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//driver.manage().deleteAllCookies();
		
//2.launch url
		driver.get("https://demo.opencart.com/");
		Thread.sleep(5000);
		
//3.click my account  
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		
//4.click register 
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		
//5.fill firstname
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		
//6.fill lastname
		driver.findElement(By.name("lastname")).sendKeys("Testing");
		
//7.fill email id
		driver.findElement(By.name("email")).sendKeys("Selenium@gmail.com");
		
//8.fill password
		driver.findElement(By.name("password")).sendKeys("Selenium12345");
		
//9.scroll page down by 400 pixel
		js.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(3000);
//10.click radio button via javascript
		js.executeScript("document.querySelector(\"#input-newsletter-yes\").click()");
		
		Thread.sleep(3000);
//11.click checkbox via javascript
		js.executeScript("document.querySelector(\"input[value='1'][name='agree']\").click()");
		
		Thread.sleep(3000);
//12.click submit button
		js.executeScript("document.querySelector(\"button[type='submit']\").click()");
		

	}

}
