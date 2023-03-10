package dec2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookxpath1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//form[@id='reg']//following::input[2]")).sendKeys("testing");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[3]")).sendKeys("selenium");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[4]")).sendKeys("testing@gmal.com");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[5]")).sendKeys("testing@gmail.com");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[6]")).sendKeys("testing435345");
		
		new Select(driver.findElement(By.xpath("//form[@id='reg']//following::select[1]"))).selectByIndex(25);
		new Select(driver.findElement(By.xpath("//form[@id='reg']//following::select[2]"))).selectByIndex(11);
		new Select(driver.findElement(By.xpath("//form[@id='reg']//following::select[3]"))).selectByIndex(50);
		
		driver.findElement(By.xpath("//form[@id='reg']//following::input[10]")).click();
		driver.findElement(By.xpath("//form[@id='reg']//following::button[1]")).click();

	}

}