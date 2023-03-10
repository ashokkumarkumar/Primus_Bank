package nov22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigationCommands {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://google.com");
		Thread.sleep(5000);
		System.out.println("pagetitle[1]"+driver.getTitle());
	//click gmail link
		driver.findElement(By.partialLinkText("Gm")).click();
		Thread.sleep(5000);
		System.out.println("pagetitle[2]"+driver.getTitle());
	//click back button
		driver.navigate().back();
		Thread.sleep(5000);
		System.out.println("pagetitle[3]"+driver.getTitle());
	//click forward button
		driver.navigate().forward();
		Thread.sleep(5000);
		System.out.println("pagetitle[4]"+driver.getTitle());
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();

	}

}
