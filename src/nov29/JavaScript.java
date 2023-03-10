package nov29;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavaScript {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
//launch url
		js.executeScript("window.location='https://amazon.in'");
		Thread.sleep(5000);
//print title and length of title
		String pagetitle = js.executeScript("return document.title").toString();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
//print url and length of url
		String strUrl = js.executeScript("return document.URL").toString();
		System.out.println(strUrl);
		System.out.println(strUrl.length());
//print domain and length of domain
		String strDomain =js.executeScript("return document.domain").toString();
		System.out.println(strDomain);
		System.out.println(strDomain.length());
		driver.close();

	}

}