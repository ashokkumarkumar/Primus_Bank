package qedge.Nov16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser1 {

	public static void main(String[] args) throws Throwable{
		//creating instance object
		
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://primusbank.qedgetech.com/");
		
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		driver.close();

	}

}
