package dec6;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WaitStatements1 {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		WebDriverWait mywait = new WebDriverWait(driver, 100);
		
		//wait until link is clickable
		
		mywait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create New Account")));
		driver.findElement(By.linkText("Create New Account")).click();
		
		//wait until element is visible
		
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
		driver.findElement(By.name("firstname")).sendKeys("Testing");

	}

}