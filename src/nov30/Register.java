package nov30;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Register {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//driver.manage().deleteAllCookies();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.name("lastname")).sendKeys("Testing");
		driver.findElement(By.name("email")).sendKeys("Selenium@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Selenium2345");
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector(\"#input-newsletter-yes\").click()");
		Thread.sleep(3000);
		js.executeScript("document.querySelector(\"input[value='1'][name='agree']\").click()");
		Thread.sleep(3000);
		js.executeScript("document.querySelector(\"button[type='submit']\").click()");
		}
}