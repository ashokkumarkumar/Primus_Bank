package july;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class PriimusBank {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
	 
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("ashokkumarb225@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.className("err-border")).sendKeys("budharapu7890");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		//driver.findElement(By.xpath("//a[@title='Recommended Jobs']//div[contains(text(),'Jobs')]")).click();
		
		
		
		
		driver.close();
	}

}
