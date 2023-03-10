//1.click three links
//2.store all windows into array list
//3.give control to air ticket window
//4.click checkbox
//5.give control to parent window
//6.check check box n 0 (parent ) window
//7.capture alert message
//8.give control to index no 2 window
//9.verify title
//10.store title in string
//11.comparing expected title and actual title
package nov26;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(1000);	
		
//1.click three links
		driver.findElement(By.xpath("(//label[contains(text(),'FLIGHTS')])[2]")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'HOTELS')])[2]")).click();
		driver.findElement(By.xpath("(//label[normalize-space()='RAIL DRISHTI'])[1]")).click();
		
//2.store all windows into array list	
		ArrayList<String> brw=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(brw);
	
//3.give control to air ticket window
		driver.switchTo().window(brw.get(3));
		Thread.sleep(5000);
	
//4.click check box
		driver.findElement(By.xpath("(//label[normalize-space()='Defence Fare'])[1]")).click();
		Thread.sleep(1000);
		driver.close();
	
//5.give control to parent window
		driver.switchTo().window(brw.get(0));
		Thread.sleep(1000);
	
//6.check check box index 0 (parent ) window	
		driver.findElement(By.xpath("//label[normalize-space()='Person With Disability Concession']")).click();
		
//7.capture alert message
		String message=driver.findElement(By.xpath("//span[contains(text(),'Specially abled availing the concession need to ca')]")).getText();
		System.out.println(message);	
		Thread.sleep(1000);
		driver.close();
	
//8.give control to index no 2 window
		driver.switchTo().window(brw.get(2));

//9.verify title
	
	//10.store title in string
		String	 expected="IRCTC Hotels";
		String actual=driver.getTitle();
	
	//11.comparing expected title and actual title
		 if (expected.equalsIgnoreCase(actual)) {
			 System.out.println("Ttile is Matchng::"+expected+"   "+actual);
		 }
		 else
		 {
		System.out.println("Ttile is Not Matchng::"+expected+"   "+actual);
	}
	Thread.sleep(1000);
	driver.close();
	}
}
