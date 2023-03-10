package nov29;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScrollToElement {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.location='https://amazon.in'");
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.linkText("About Us"));

//scroll to About Us link and click it
		js.executeScript("document.scrollIntoView", element);
		Thread.sleep(5000);
		element.click();
		Thread.sleep(5000);
		//driver.quit();

	}

}