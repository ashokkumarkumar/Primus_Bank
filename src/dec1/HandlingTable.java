package dec1;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingTable {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		WebElement webtable =driver.findElement(By.className("dataTable"));
		//get collection of rows in table
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		int Noofrow =rows.size()-1;
		System.out.println("No of rows are::"+Noofrow);
		
		for(int i=1;i<rows.size();i++)
		{
			//get each row collection
			List<WebElement> cols =rows.get(i).findElements(By.tagName("td"));
			Thread.sleep(1000);
			System.out.println("Row No."+i+"        "+"column size::"+cols.size());
		}
		driver.close();
}
}