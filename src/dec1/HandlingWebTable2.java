package dec1;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingWebTable2 {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		
		WebElement webtable = driver.findElement(By.className("dataTable"));
		
		List<WebElement> rows =webtable.findElements(By.tagName("tr"));
		
		System.out.println("no of row are::"+rows.size());
		
		Thread.sleep(5000);
		
		for (WebElement eachrow : rows) {
			List<WebElement> cols = eachrow.findElements(By.tagName("td"));
			for (WebElement eachcell : cols) {
				
				Thread.sleep(500);
		
				String celldata = eachcell.getText();
				
				System.out.print("\n"+celldata);
			}
			System.out.println();
			
			System.out.println("==============================================================");
		}
		driver.close();
	}
}