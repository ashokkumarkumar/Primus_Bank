package nov30;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.location='http://orangehrm.qedgetech.com/'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#txtUsername\").value='Admin'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#txtPassword\").value='Qedge123!@#'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#btnLogin\").click()");
		}
}