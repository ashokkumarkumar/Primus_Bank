//Write a script to count no rows in a table and print each row column size:
//1.store webtable in to webelement
//2.get collection of rows in table
//2a.store collection rows in webtable by tagname
//2b.store rows size into noofrow
//2c.print no of rows
//3.get each row collection ( for loop )
//3a.for loop
//3b.store collection of columns in rows by tagname 
//3c.print row no, column size
package dec1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(3000);
		
//1.store webtable in to webelement
		WebElement webtable=driver.findElement(By.className("dataTable"));
		
//2.get collection of rows in table
		
		//2a.store collection rows in webtable by tagname
		List<WebElement>rows=webtable.findElements(By.tagName("tr"));
		
		//2b.store rows size into noofrow
		int noofrow=rows.size();
		
		//2c.print no of rows
		System.out.println("no of rows::"+noofrow);
				
//3.get each row collection ( for loop )
		
		//3a.for loop
		for (int i = 0; i < rows.size(); i++) {
			
		//3b.store collection of columns in rows by tagname 
		List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
		Thread.sleep(3000);
			
		//3c.print row no, column size
		System.out.println("Row No."+i+"      "+"column size::"+cols.size());
		
		}
			driver.close();
		}}
			


