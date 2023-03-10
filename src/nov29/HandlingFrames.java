package nov29;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class HandlingFrames {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
//get collection of frame 
		List<WebElement> all_Frames = driver.findElements(By.tagName("iframe"));
		System.out.println("No of frames::"+all_Frames.size());
//switch to frame
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		ac.dragAndDrop(source, target).perform();
//switch to main html page
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.linkText("Button"))).click().perform();
		Thread.sleep(5000);
		driver.close();
			}
            }