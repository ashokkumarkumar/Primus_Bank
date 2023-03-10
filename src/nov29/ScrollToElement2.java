package nov29;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToElement2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//1.create javascriptExecutor interface
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		
//2.launch url via javascriptexecutor
		js.executeScript("window.location='https://amazon.in'");
		Thread.sleep(3000);
		
//3.click on about us link
	WebElement element=driver.findElement(By.linkText("About Us"));
		
//4.scroll to About Us link and click it
		js.executeScript("document.scrollIntoView");
		Thread.sleep(3000);
		element.click();
		driver.close();
		}
}
