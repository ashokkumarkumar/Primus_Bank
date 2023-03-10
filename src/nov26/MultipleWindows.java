package nov26;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MultipleWindows {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
	//click three linkss
		driver.findElement(By.xpath("(//label[contains(text(),'FLIGHTS')])[2]")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'HOTELS')])[2]")).click();
		driver.findElement(By.xpath("(//label[normalize-space()='RAIL DRISHTI'])[1]")).click();
	//store all windows into array list
		ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(brw);
	//give control to air ticket window
		driver.switchTo().window(brw.get(3));
		Thread.sleep(5000);
	//click check box
		driver.findElement(By.name("ltc")).click();
		Thread.sleep(4000);
		driver.close();
	//give control to parent window
		driver.switchTo().window(brw.get(0));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[normalize-space()='Person With Disability Concession']")).click();
String message = driver.findElement(By.xpath("//span[contains(text(),'Specially')]")).getText();
		System.out.println(message);
		Thread.sleep(4000);
		driver.close();
		driver.switchTo().window(brw.get(2));
		String expected ="IRCTC Hotels";
		String actual = driver.getTitle();
		if(expected.equalsIgnoreCase(actual))
		{
			System.out.println("Title is Matching::"+expected+"    "+actual);
		}
		else
		{
			System.out.println("Title is Not Matching::"+expected+"    "+actual);
		}
		Thread.sleep(4000);
		driver.close();
		}
   }