package nov28;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouse {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=hp+laptop&sid=6bo%2Cb5g&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_2_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_2_na_na_na&as-pos=1&as-type=HISTORY&suggestionId=hp+laptop%7CLaptops&requestId=30584507-275f-443a-afe9-35f6160b4765&as-backfill=on");
		Thread.sleep(2000);
		
		Actions ac=new Actions(driver);
		
		ac.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(3000);
		//mouse over to and click
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Home & Furniture']"))).perform();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.linkText("Beds"))).click().perform();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.xpath("(//span[normalize-space()='Electronics'])[1]"))).perform();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.linkText("Samsung"))).click().perform();
		Thread.sleep(5000);

		driver.close();
	}

}
