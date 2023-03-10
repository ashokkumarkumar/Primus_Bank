package nov18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleValidation1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		String expectedtitle="google";
		String actualtitle=driver.getTitle();
		if(expectedtitle.equalsIgnoreCase(actualtitle))
		{
			System.out.println("Title is matching"+expectedtitle+"    "+actualtitle);

		}else
		{
			System.out.println("Title is not matching"+expectedtitle+"    "+actualtitle);	
		}
		driver.quit();
	}

	}


