package qedge.Nov16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static void main(String[] args) {
	//create instance object
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//create instance object
		System.setProperty("webdriver.gecko.driver,", "d:/geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		

	}

}
