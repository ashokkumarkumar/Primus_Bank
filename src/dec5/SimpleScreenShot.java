package dec5;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleScreenShot {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(5000);
		//1.take screen shot and store
		File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
		//2.copy that screen shot into local system
		FileUtils.copyFile(screen, new File("D://ScreenShot/homepage.png"));
		driver.close();
		 
	}

}
