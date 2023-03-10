package qedge.Nov16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser3 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.id("register_Layer")).click();
		driver.findElement(By.id("name")).sendKeys("ashok");
		driver.findElement(By.id("password")).sendKeys("sjhdhsdhsdhskdshds");
		driver.findElement(By.xpath("//button[normalize-space()='Upload Resume']")).click();
		
		Thread.sleep(5000);
		driver.close();
		}
}
