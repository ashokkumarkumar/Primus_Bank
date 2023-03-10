package nov29;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//1.create javascriptExecutor interface
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		
//2.launch url via javascriptexecutor
		js.executeScript("window.location='https://amazon.in'");
		Thread.sleep(3000);
		
//3.scroll top to bottom vertically
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		
//4.scroll  bottom  to top vertically
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(3000);
		
//5.scroll verticall to certain pixel
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		
		driver.close();
		}
}
