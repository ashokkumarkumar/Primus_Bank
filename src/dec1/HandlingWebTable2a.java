package dec1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable2a {

	public static void main(String[] args, WebElement eachcell) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		
//1.store webtable in to webelement
		WebElement webtable=driver.findElement(By.className("dataTable"));
		
//2.get collection of rows in table
		
		//2a.store collection rows in webtable by tagname
		List<WebElement>rows=webtable.findElements(By.tagName("tr"));
		
		//2b.print no of rows
		System.out.println("no of rows are::"+rows.size());
		
		Thread.sleep(3000);
//3.		
		for (WebElement eachrow: rows) {
		//3a.store each columns row collection
			List<WebElement>cols=eachrow.findElements(By.tagName("td"));
		
		for (WebElement eachcell1 : cols) {
		
		Thread.sleep(3000);
		}
		
		String celldata=eachcell.getText();
		System.out.println("\n"+eachcell);
		
		}
		
		System.out.println();
		System.out.println("============================================");
		
		
		driver.close();
	}

}
