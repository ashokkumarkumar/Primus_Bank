package dec5;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Spotify {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.spotify.com/en/login?continue=https");
		
		driver.findElement(By.xpath("//p[normalize-space()='Sign up for Spotify']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//form[@method='POST']//following::input[1]")).sendKeys("tandav@gmai.com");
		driver.findElement(By.xpath("//form[@method='POST']//following::input[2]")).sendKeys("tandav@gmai.com");
		driver.findElement(By.xpath("//form[@method='POST']//following::input[3]")).sendKeys("tandavaijjj");
		driver.findElement(By.xpath("//form[@method='POST']//following::input[4]")).sendKeys("2000");
		driver.findElement(By.xpath("//form[@method='POST']//following::input[5]")).sendKeys("1992");
		
		new Select(driver.findElement(By.xpath("//form[@method='POST']//following::select[1]"))).selectByIndex(5);
		
		driver.findElement(By.xpath("//form[@method='POST']//following::input[6]")).sendKeys("16");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//form[@method='POST']//following::span[3]")).click();
		Thread.sleep(1000);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("recaptcha-anchor")).click();
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//form[@method='POST']//following::button[1]")).sendKeys(Keys.ENTER);

	}

}