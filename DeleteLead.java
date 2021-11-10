package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		System.out.println("Page loaded successfully");
		driver.manage().window().maximize();
		System.out.println("maximized successfully");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();	
		System.out.println("logged in successfully");
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println("clicked on CRM/SFA successfully");
		
		driver.findElement(By.linkText("Leads")).click();
		System.out.println("Leads clicked Successfully");
		/*Created Lead
		driver.findElement(By.linkText("Create Lead")).click();
		System.out.println("Create Lead clicked Successfully");
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Thryvedigital");
		System.out.println("Comapany Name entered Successfully");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
		System.out.println("Lead first name entered successfully");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Settu");
		System.out.println("Lead Last name Entered Successfully");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9999999999");
		System.out.println("Phone Number entered successfully");*/
			
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		System.out.println("Find Leads button clicked successfully");
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		System.out.println("Phone tab clicked Successfully");
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9999999999");
		System.out.println("Phone Number entered Successfully to identify leads");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		System.out.println("Find Leads clicked successfully");
		Thread.sleep(5000);
				
		String FirstLead=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(FirstLead+" "+" is the First Lead captured and printed successfully");
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		System.out.println("First lead clicked successfully");
		
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		System.out.println("Delete Button clicked Successfully");
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		System.out.println("Find Leads clicked after deleting the 1st lead");
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(FirstLead);
		System.out.println("Captured Lead id entered Successfully");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		System.out.println("Find Leads clicked successfully again");
		
		
		driver.close();
		
		
		
		
		

	}

}
