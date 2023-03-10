package nov18;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleValidation {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		
//driver.get("https://gmail.com");
		Thread.sleep(5000);
//title validation
		String expectedtitle ="google";
		String actualtitle =driver.getTitle();
		
		if(expectedtitle.equalsIgnoreCase(actualtitle))
		{
			System.out.println("Title is Matching::"+expectedtitle+"     "+actualtitle);
		}
		else
		{
			System.out.println("Title is Not Matching::"+expectedtitle+"     "+actualtitle);
		}
		driver.quit();
		}
        }