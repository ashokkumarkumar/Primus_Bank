package nov18;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWebdriverCommands {

	public static void main(String[] args) throws Throwable {
//====================================================================================
								//16-11-22			Browser
		
		//create instance object
				System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
			//create instance object
				System.setProperty("webdriver.gecko.driver,", "d:/geckodriver.exe");
				WebDriver dr=new FirefoxDriver();
//=================================================================================
								//16-11-22		Browser1
				
				//creating instance object
				
				System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				
				driver.get("http://primusbank.qedgetech.com/");
				
				driver.findElement(By.name("txtuId")).sendKeys("Admin");
				driver.findElement(By.name("txtPword")).sendKeys("Admin");
				driver.findElement(By.name("login")).click();
//==================================================================================
								//16-11-22		Browser2
				System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
				
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				
				driver.get("http://primusbank.qedgetech.com/");
				
				driver.findElement(By.xpath("//input[@id='txtuId']")).sendKeys("Admin");
				driver.findElement(By.xpath("//input[@id='txtPword']")).sendKeys("Admin");
				driver.findElement(By.xpath("//input[@id='login']")).click();
//==================================================================================
								//16-11-22		Browser3
				
				System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get("https://www.naukri.com/");
				
				driver.findElement(By.id("register_Layer")).click();
				driver.findElement(By.id("name")).sendKeys("ashok");
				driver.findElement(By.id("password")).sendKeys("sjhdhsdhsdhskdshds");
				driver.findElement(By.xpath("//button[normalize-space()='Upload Resume']")).click();
//===================================================================================
								//18-11-22		CaptureText
				
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		
	
//capture gmail text
		String variable = driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(variable);
		
//capture gmail link url
		String element =driver.findElement(By.linkText("Gmail")).getAttribute("href");
		System.out.println(element);
//=================================================================================
								//18-11-22		GetCommands
		
//print title and length of title
				String pagetitle =driver.getTitle();
				System.out.println(pagetitle);
				System.out.println(pagetitle.length());
				
//print url and length of url
				String strurl =driver.getCurrentUrl();
				System.out.println(strurl);
				System.out.println(strurl.length());
//=======================================================================================				
								//18-11-22		TitleValidation
				driver.get("https://google.com");
				
//driver.get("https://gmail.com");
				Thread.sleep(5000);
				
//title validation
				String expectedtitle="google";
				String actualtitle=driver.getTitle();
				
				if(expectedtitle.equalsIgnoreCase(actualtitle))
				{
					System.out.println("Title is matching"+expectedtitle+"    "+actualtitle);

				}else
				{
					System.out.println("Title is not matching"+expectedtitle+"    "+actualtitle);	
				}
//=======================================================================================				
								//21-11-22		CountingLinks1
				
//get collection of links which are stored in html tag a
				List<WebElement> alllinks =driver.findElements(By.tagName("a"));
				System.out.println("No of links are::"+alllinks.size());
				
				for (WebElement each : alllinks) {
					Thread.sleep(5000);
						System.out.println(each.getText());
					}
//==================================================================================
								//21-11-22		ValidateLogin1
				
				driver.get("http://orangehrm.qedgetech.com/");
				Thread.sleep(5000);				
//store username into webelement
				WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
				username.clear();
				username.sendKeys("Admin2");
//store password textbox into webelement
				WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
				password.clear();
				password.sendKeys("Qedge123!@#");
				driver.findElement(By.xpath("//input[@id='btnLogin']")).submit();
				Thread.sleep(5000);
				
				String expected="dashboard";
				String actual=driver.getCurrentUrl();
				
			if(actual.contains(expected))
				{
				System.out.println("Login success::"+expected+"         "+actual);
				}
			else 
				{
//capture error message
				String errormessage=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
				
				System.out.println(errormessage+"   "+expected+"   "+actual);
				}
//=======================================================================================
								//22-11-22		HandlingListbo1
			
			driver.navigate().to("https://amazon.in");
			Thread.sleep(5000);
//store listbox into select class
			
			Select element=new Select(driver.findElement(By.id("searchDropdownBox")));
			
//verify listbox is single or multi selection
			
			boolean value=element.isMultiple();

//print value
			
				System.out.println(value);
				
//select by visible text
				
			element.selectByVisibleText("Baby");
			Thread.sleep(5000);
			
//select by index
			
			element.selectByIndex(30);
			
//print 30 item name
			
			System.out.println(element.getFirstSelectedOption().getText());	
//=================================================================================
								//22-11-22		NavigationCommands1
			
			driver.get("https://google.com");
			Thread.sleep(5000);
			System.out.println("pagetilte[1]"+driver.getTitle());
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
			
//refresh
			driver.navigate().refresh();
			
			Thread.sleep(5000);
			
//=====================================================================================
								//24-11-22			CountingLinks1
			
			driver.get("https://amazon.in");
			Thread.sleep(2000);
			
Select listbox=new Select(driver.findElement(By.id("searchDropdownBox")));
			
//get collection no of items
				List<WebElement> all_items  =  listbox.getOptions();
				System.out.println("no of items are::"+all_items.size());
				
//get collection of items

 (WebElement each : all_items) {
					Thread.sleep(500);
					System.out.println(each.getText());
//================================================================================
									//24-11-22		DropDownCollection
					
					driver.get("file:///D:/MultiListboxHtmlpage.html");
					Thread.sleep(5000);
					Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
//verify dropdown is singlew or multi selection
					boolean value = dropdown.isMultiple();
					System.out.println(value);
					for(int i=0;i<7;i++)
					{
						Thread.sleep(500);
						dropdown.selectByIndex(i);
					}
//print no of items selected
					List<WebElement> selectd_Items = dropdown.getAllSelectedOptions();
					System.out.println(selectd_Items.size());
					for (WebElement each : selectd_Items) {
						Thread.sleep(500);
						System.out.println(each.getText());
					}
//===================================================================================
								//24-11-22			MultiSelection1
					
					driver.get("file:///D:/MultiListboxHtmlpage.html");
					Thread.sleep(5000);
					
					Select dropdown=new Select(driver.findElement(By.name("multiSelection")));
					
//verify dropdown is single or multi selection
					
					//list box is multiple or not
						boolean value=dropdown.isMultiple();
						System.out.println(value);
						
					//list box no of all items quantity 
						List<WebElement>all_items=dropdown.getOptions();
						System.out.println(all_items.size());

					//select seven items in listbox
					
					for (int i = 0; i < 7; i++) {
						Thread.sleep(2000);
						dropdown.selectByIndex(i);
					}
					
					//dropdown deselect by visible text
						dropdown.deselectByVisibleText("Yellow");
						Thread.sleep(4000);
						
					//dropdown deselect by index 1st position
						dropdown.deselectByIndex(0);
						Thread.sleep(4000);
						
					//dropdown deselect by index 3rd position
						dropdown.deselectByIndex(2);
						Thread.sleep(4000);
						
					//dropdown deselect all
						dropdown.deselectAll();
//=================================================================================
								//24-11-22			VerfyItems1
						
						String item_present="baby";
						boolean item_exist=false;
						
						driver.get("https://amazon.in");
						Thread.sleep(1000);
						
				//get no of items count	( size )
						
						Select listbox=new Select(driver.findElement(By.id("searchDropdownBox")));
						List<WebElement> all_items=listbox.getOptions();
						System.out.println(all_items.size());
						
						for (WebElement each : all_items) {
							
				//get one by one item
							
							String actual_items=each.getText();
							if (actual_items.equalsIgnoreCase(item_present)) {
								item_exist = true;
								break;
							}
								}
						
				//it checks true or false
						if (item_exist) {
							System.out.println("Item Present In Listbox::"+item_present);
							
						}
						else {
							System.out.println("Item Not Present IN Listbox::"+item_present);
							}
//=================================================================================
								//25-11-22		CheckBox1
						
						driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
						Thread.sleep(5000);
						
						//storing webelement
						
						WebElement element=driver.findElement(By.id("remember"));
						
						//checking selected or not
						
						boolean value=element.isSelected();
						System.out.println(value);
						
						//click element
						
						element.click();
//==============================================================================
								//25-11-22		ConditionalMethod1
						
						driver.get("https://facebook.com");
						Thread.sleep(5000);
						driver.findElement(By.linkText("Create New Account")).click();
						Thread.sleep(1000);
						
						//storing webelement ( facebook firstname )
						
						WebElement element=driver.findElement(By.name("firstname"));
						
					//verify firsname text box is enabled or not
						
						boolean value=element.isEnabled();
						System.out.println(value);
						
						
						//storing webelement ( re enter email address confirmation )
						
						WebElement element1=driver.findElement(By.name("reg_email_confirmation__"));
						
					//verify reenter email text box is displayed or hidden
						
						boolean value1=element1.isDisplayed();
						System.out.println(value1);
						
						//storing webelement ( check box )( storing webelement why becoz we can access anywhere) 
						
						WebElement element2=driver.findElement(By.xpath("//input[@value='2']"));
						
					//verify radio button is selected or not
						
						boolean value3=element2.isSelected();
						System.out.println(value3);
						element2.click();
						driver.quit();
//===============================================================================
								//25-11-22		CountingCheckbox
						
						driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_custom_checkbox");
						Thread.sleep(5000);
						
						//get collection of checkboxes
						
						List<WebElement>All_Checkboxes=driver.findElements(By.tagName("label"));
						System.out.println("no of checkboxes are::"+All_Checkboxes.size());
					for (WebElement each : All_Checkboxes) {
						
						//verify which check box is true or false
						
						boolean value=each.isSelected();
						
						//printname of each checkbox
						
						String Checkbox_Name=each.getAttribute("")
//=================================================================================
								//26-11-22		HandlingActions1
								
								driver.get("https://google.com");
						Thread.sleep(5000);
				
				//create actions class	
						Actions ac=new Actions(driver);
						driver.findElement(By.name("q")).sendKeys("Selenum openings");
						Thread.sleep(3000);
				
				//press escape key for one time	
						ac.sendKeys(Keys.ESCAPE).perform();
						Thread.sleep(3000);

				//press arrow down for three times
						ac.sendKeys(Keys.ARROW_DOWN).perform();
						Thread.sleep(4000);
						ac.sendKeys(Keys.ARROW_DOWN).perform();
						Thread.sleep(4000);
						ac.sendKeys(Keys.ARROW_DOWN).perform();
						Thread.sleep(8000);
						
				//press arrow up for one time
						
						ac.sendKeys(Keys.ARROW_UP).perform();
						Thread.sleep(4000);
						
				//press enter for one time
						
						ac.sendKeys(Keys.ENTER).perform();
						Thread.sleep(4000);
						
				//press page down for one time
						ac.sendKeys (Keys.PAGE_DOWN). perform();
						Thread.sleep(4000);
						
				//press page up for one time
						ac.sendKeys (Keys.PAGE_UP). perform();
//===================================================================================
							//26-11-22			MultiWindows1
						
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
//=====================================================================================
						 		//28-11-22		HandlingMouse1
						 
						 driver.get("https://www.flipkart.com/search?q=hp+laptop&sid=6bo%2Cb5g&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_2_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_2_na_na_na&as-pos=1&as-type=HISTORY&suggestionId=hp+laptop%7CLaptops&requestId=30584507-275f-443a-afe9-35f6160b4765&as-backfill=on");
							Thread.sleep(1000);

					//create asctions class		
							Actions ac=new Actions(driver);
							
					//press escape button( cancel window )
							ac.sendKeys(Keys.ESCAPE).perform();
							Thread.sleep(1000);
							
					//mouse over to home and furniture in flipcart
							ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Home & Furniture']"))).perform();
							Thread.sleep(2000);
							
					//mouse over to beds and click in flipcart		
							ac.moveToElement(driver.findElement(By.linkText("Beds"))).click().perform();
							Thread.sleep(2000);
							
					//mouse over to electronics in flipcart
							ac.moveToElement(driver.findElement(By.xpath("(//span[normalize-space()='Electronics'])[1]"))).perform();
							Thread.sleep(2000);
							
					//mouse over to samsung and click in flipcart	
							ac.moveToElement(driver.findElement(By.linkText("Samsung"))).click().perform();
							Thread.sleep(2000);

							driver.close();
						}

					}
//================================================================================
								//28-11-22		RightClick2
				
				driver.get("https://google.com");
				Thread.sleep(2000);
				
//create actions class
				Actions ac=new Actions(driver);
				
//1.right click on gmail link in google page
				ac.moveToElement(driver.findElement(By.linkText("Gmail"))).contextClick().perform();
				
//2.create robot class
				Robot r= new Robot();
				Thread.sleep(2000);
				
//3.press down arrow two times
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				Thread.sleep(2000);
				
//4.press down arrow two times
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				Thread.sleep(2000);
				
//5.press enter for one time
				r.keyPress(KeyEvent.VK_ENTER);
				
//6.create arraylist class for multiple windows
				ArrayList<String>brw=new ArrayList<String>(driver.getWindowHandles());
				
//7.switch to child window
				driver.switchTo().window(brw.get(1));
				Thread.sleep(2000);
				
//8.click on create an account in gmail page
				ac.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/a[3]/span[2]"))).click().perform();
				
//9.click first name and enter Akhilesh
				driver.findElement(By.name("firstName")).sendKeys("Akhilesh");
				Thread.sleep(2000);
				
//10.close child window
				driver.close();
				
//11.open parent window(index 1 window)
				driver.switchTo().window(brw.get(0));
				Thread.sleep(2000);
				
//12.left click on gmail link in google page
				ac.moveToElement(driver.findElement(By.linkText("Gmail"))).click().perform();
				Thread.sleep(4000);
				
//13.close parent window(index 0 window)
				driver.close();

				}
			

//======================================================================================
								//29-11-22		drag and drop by1
	
				driver.get("https://jqueryui.com/droppable/");
				Thread.sleep(3000);
				
//1.create actons class
				Actions ac=new Actions(driver);
				
//2.switch to frame
				driver.switchTo().frame(0);
				
//3.storing source item in html page
				WebElement source=driver.findElement(By.id("draggable"));
				
//4.storing target item in html page		
				WebElement target=driver.findElement(By.id("droppable"));
				
//5.assigning x coordinates		
				int x=target.getLocation().getX();
				
//6.assigning y coordinates
				int y=target.getLocation().getY();
				
//7.print x, y
				System.out.println(x+"   "+y);
				
//8.drag and dropby source to target		
				ac.dragAndDropBy(source, x, y).perform();
//====================================================================================
									//29-11-22		HandlingFrames1
				driver.get("https://jqueryui.com/droppable/");
				Thread.sleep(2000);
				
			//1.create actions class
				Actions ac=new Actions(driver);
				
			//2.get collection of frame
				List<WebElement>All_items=driver.findElements(By.tagName("iframe"));
				
			//3.print no of frames
				System.out.println("no of frames::"+All_items.size());
				
			//4.switch to frame
				driver.switchTo().frame(0);
				
			//5.storing source item in html page
				WebElement source=driver.findElement(By.id("draggable"));
				
			//6.storing target item in html page
				WebElement target=driver.findElement(By.id("droppable"));
				
			//7.moving (draganddrop) item to source to target
				ac.dragAndDrop(source, target).perform();
				
			//8.switch to main html page
				driver.switchTo().defaultContent();
				
				Thread.sleep(2000);
				
			//9.click on button in jqueryui.com page
				ac.moveToElement(driver.findElement(By.linkText("Button"))).click().perform();
//============================================================================================
								//29-11-22		JavaScript1
				//1.create javascriptExecutor interface
				JavascriptExecutor js=(JavascriptExecutor)driver;
				
		//2.launch url via javascript
				js.executeScript("window.location='https://amazon.in'");
				
				Thread.sleep(3000);
				
		//3.print title and length of title
				String pagetitle=js.executeScript("return document.title").toString();
				
				System.out.println(pagetitle);
				System.out.println(pagetitle.length());
				
		//print url and length of url
				String url=js.executeScript("return document.URL").toString();
				
				System.out.println(url);
				System.out.println(url.length());
				
		//print domain and length of domain
				String strDomain=js.executeScript("return document.domain").toString();
				
				System.out.println(strDomain);
				System.out.println(strDomain.length());
//===================================================================================
							//29-11-22		Scroll 1
				//1.create javascriptExecutor interface
				JavascriptExecutor js=(JavascriptExecutor)driver;
				
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
//===================================================================================
								//29-11-22		ScrollElement2
				//1.create javascriptExecutor interface
				JavascriptExecutor js=(JavascriptExecutor)driver;
				Thread.sleep(3000);
				
		//2.launch url via javascriptexecutor
				js.executeScript("window.location='https://amazon.in'");
				Thread.sleep(3000);
				
		//3.click on about us link
			WebElement element=driver.findElement(By.linkText("About Us"));
				
		//4.scroll to About Us link and click it
				js.executeScript("document.scrollIntoView");
				Thread.sleep(3000);
				element.click();
				driver.close();
//===============================================================================
							//30-11-22		Login1
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
//=====================================================================================
							//30-11-22		Register1
				//1.create javascriptexcutor class		
				JavascriptExecutor js=(JavascriptExecutor)driver;
				//driver.manage().deleteAllCookies();
				
		//2.launch url
				driver.get("https://demo.opencart.com/");
				Thread.sleep(5000);
				
		//3.click my account  
				driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
				
		//4.click register 
				driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
				
		//5.fill firstname
				driver.findElement(By.name("firstname")).sendKeys("Selenium");
				
		//6.fill lastname
				driver.findElement(By.name("lastname")).sendKeys("Testing");
				
		//7.fill email id
				driver.findElement(By.name("email")).sendKeys("Selenium@gmail.com");
				
		//8.fill password
				driver.findElement(By.name("password")).sendKeys("Selenium12345");
				
		//9.scroll page down by 400 pixel
				js.executeScript("window.scrollBy(0,400)");
				
				Thread.sleep(3000);
		//10.click radio button via javascript
				js.executeScript("document.querySelector(\"#input-newsletter-yes\").click()");
				
				Thread.sleep(3000);
		//11.click checkbox via javascript
				js.executeScript("document.querySelector(\"input[value='1'][name='agree']\").click()");
				
				Thread.sleep(3000);
		//12.click submit button
				js.executeScript("document.querySelector(\"button[type='submit']\").click()");
//==================================================================================================				

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
