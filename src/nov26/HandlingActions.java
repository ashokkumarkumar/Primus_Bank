package nov26;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class HandlingActions {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		driver.findElement(By.name("q")).sendKeys("Selenium openings ");
		Thread.sleep(3000);
	//press arrow down for three times
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		ac.pause(4000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(4000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(4000);
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(8000);
		driver.close();

	}

}