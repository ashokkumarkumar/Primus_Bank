package nov29;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//1.create javascriptExecutor interface
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		
//2.launch url
		js.executeScript("window.location='https://amazon.in'");
		
		Thread.sleep(3000);
		
//3.print title and length of title
		String pagetitle=js.executeScript("return document.title").toString();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		
//print url and length of url
		String URL=js.executeScript("return document.URL").toString();
		System.out.println(URL);
		System.out.println(URL.length());
		
//print domain and length of domain
		String Domain=js.executeScript("return document.Domain").toString();
		System.out.println(Domain);
		System.out.println(Domain.length());
		
		driver.close();
		}
	}
