//1.create asctions class	
//2.press escape button( cancel window )
//3.mouse over to home and furniture in flipcart
//4.mouse over to beds and click in flipcart	
//5.mouse over to electronics in flipcart
//6.mouse over to samsung and click in flipcart
package nov28;
import java.sql.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouse1 {
	
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=hp+laptop&sid=6bo%2Cb5g&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_2_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_2_na_na_na&as-pos=1&as-type=HISTORY&suggestionId=hp+laptop%7CLaptops&requestId=30584507-275f-443a-afe9-35f6160b4765&as-backfill=on");
		Thread.sleep(1000);

//create asctions class		
		Actions ac=new Actions(driver);
		
//press escape button( cancel window )
		ac.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(1000);
		
//mouse over to home and furniture in flipcart
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Home & Furniture']"))).perform();
		Thread.sleep(2000);
		
//mouse over to beds and click in flipcart		
		ac.moveToElement(driver.findElement(By.linkText("Beds"))).click().perform();
		Thread.sleep(2000);
		
//mouse over to electronics in flipcart
		ac.moveToElement(driver.findElement(By.xpath("(//span[normalize-space()='Electronics'])[1]"))).perform();
		Thread.sleep(2000);
		
//mouse over to samsung and click in flipcart	
		ac.moveToElement(driver.findElement(By.linkText("Samsung"))).click().perform();
		Thread.sleep(2000);

		driver.close();
	}

}
