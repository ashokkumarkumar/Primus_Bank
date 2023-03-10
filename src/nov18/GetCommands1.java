package nov18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands1 {

	public static void main(String[] args) throws Throwable  {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://amazon.in");
		Thread.sleep(5000);
		
		//print current page title and length of the title
		String pagetitle= driver.getTitle();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		//print url and length of the url
		String url= driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(url.length());
		driver.close();
	
	}
}
