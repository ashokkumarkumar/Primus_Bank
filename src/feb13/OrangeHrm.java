package feb13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHrm {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Qedge123!@#");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
		driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']")).click();
		
		driver.findElement(By.name("empsearch[employee_name][empName]")).sendKeys("Ashok kumar");
		driver.findElement(By.id("empsearch_id")).sendKeys("23");
		
		driver.findElement(By.id("empsearch_employee_status")).click();

		
		Select element=new Select(driver.findElement(By.id("empsearch_employee_status")));
		element.selectByVisibleText("Fresher");
		
		Select element1=new Select(driver.findElement(By.id("empsearch_termination")));
		element1.selectByVisibleText("Current and Past Employees");
		
		driver.findElement(By.id("empsearch_supervisor_name")).sendKeys("pavan kumar");
		
		Select element2=new Select(driver.findElement(By.id("empsearch_job_title")));
		element2.selectByVisibleText("Testlead");
		
		
		
		driver.findElement(By.id("btnAdd")).click();
		
		
		
		
		driver.findElement(By.id("firstName")).sendKeys("satyanarayana");
		driver.findElement(By.id("middleName")).sendKeys("flipcart");
		driver.findElement(By.id("lastName")).sendKeys("amazon");
		
		
		
		driver.findElement(By.id("chkLogin")).click();
		
		
		driver.close();
	}

}
