package nov18;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureText1 {

	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://google.com");
	Thread.sleep(5000);
	//capture gmail text
	String variable=driver.findElement(By.linkText("Gmail")).getText();
	System.out.println(variable);
	//capture gmail link url
	String element=driver.findElement(By.linkText("Gmail")).getAttribute("href");
	System.out.println(element);
	driver.quit();
	
	}
	}
