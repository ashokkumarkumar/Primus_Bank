//write a script to login orangeHRM via java scriptecutor( when ever selenium doesnot 
//						interact webpage then we will go to java script):
//1.create javascriptexcutor class
//2.launch url via javascriptexcutor
//3.enter admin in user name via javascriptexcutor
//4.enter password in password via javascriptexcutor
//5.enter click via javascriptexcutor
package nov30;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		
//1.create javascriptexcutor class		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
//2.launch url via javascriptexcutor
		js.executeScript("window.location='http://orangehrm.qedgetech.com/'");
		
//3.enter admin in user name via javascriptexcutor
		js.executeScript("document.querySelector(\"#txtUsername\").value='Admin'");
		Thread.sleep(5000);
		
//4.enter password in password via javascriptexcutor			
		js.executeScript("document.querySelector(\"#txtPassword\").value='Qedge123!@#'");
		Thread.sleep(5000);
		
//5.enter click via javascriptexcutor			
		js.executeScript("document.querySelector(\"#btnLogin\").click()");
		}
}
