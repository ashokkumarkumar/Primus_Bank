package dec1;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingWebTable3a {
	public static void main(String[] args) throws Throwable {
		
		String Country_present ="canada";
		//String Country_present ="India";
		
		boolean item_Exist = false;
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		
		WebElement webtable  = driver.findElement(By.id("customers"));
		
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		
		System.out.println("No of rows are::"+rows.size());
		Thread.sleep(5000);
		
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> cols =rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++)
			{
				String celldata = cols.get(j).getText();
				Thread.sleep(1000);
				System.out.print("\n"+celldata);
				
				if(celldata.equalsIgnoreCase(Country_present))
				{
					item_Exist=true;
					System.out.println("Found in row No."+i+"     "+"Colum No."+(j+1));
				}
						
			}
			System.out.println();
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		}
		
		if(item_Exist)
		{
			System.out.println("Country Found in table::"+Country_present);
		}
		else
		{
			System.out.println("Country Not Found in table::"+Country_present);
		}
	}

}