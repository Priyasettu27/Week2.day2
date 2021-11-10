package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
	
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/");
			System.out.println("Page loaded successfully");
			driver.manage().window().maximize();
			System.out.println("maximized successfully");
			
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();	
			System.out.println("logged in successfully");
			
			driver.findElement(By.linkText("CRM/SFA")).click();
			System.out.println("clicked on CRM/SFA successfully");
			
			driver.findElement(By.linkText("Contacts")).click();
			System.out.println("Contact Tab clicked Successfully");
			
			driver.findElement(By.linkText("Create Contact")).click();
			System.out.println("clicked on Create Contact successfully");
			
			driver.findElement(By.id("firstNameField")).sendKeys("Priya");
			System.out.println("First Name is entered successfully");
			
			driver.findElement(By.id("lastNameField")).sendKeys("Settu");
			System.out.println("Last Name is entered successfully");
			
			driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("PriyaVicky");
			System.out.println("FirstName Local is entered successfully");
			
			driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("VickyPriya");
			System.out.println("LastName is entered successfully");
			
			driver.findElement(By.id("createContactForm_departmentName")).sendKeys("BCA");
			System.out.println("Department name is entered successfully");
			
			driver.findElement(By.id("createContactForm_description")).sendKeys("No description");
			System.out.println("Description is entered successfully");
			
			driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abc@gmail.com");
			System.out.println("Email id entered successfully");
			
			WebElement drop=driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
			Select state=new Select(drop);
			state.selectByVisibleText("Indiana");
			System.out.println("State selected successfully");
			
			driver.findElement(By.xpath("//input[@name='submitButton']")).click();
			System.out.println("Create contact button clicked successfully");
			
			driver.findElement(By.linkText("Edit")).click();
			System.out.println("Edit button clicked successfully");
			
			driver.findElement(By.id("updateContactForm_description")).clear();
			System.out.println("Description is cleared successfully");
			
			driver.findElement(By.xpath("//input[@name='accountName']")).sendKeys("swapna Settu");
			System.out.println("Account Name is entered successfully");
			
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("mahesh");
			System.out.println("First name entered successfully");
			
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("muthu");
			System.out.println("Last Name entered successfully");
			
			driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("Thryvedigital");
			System.out.println("Company name entered successfully");
			
			driver.findElement(By.xpath("//input[@name='submitButton']")).click();
			System.out.println("update Button clicked Successfully");
			String title1=driver.getTitle();
			System.out.println(title1);
			
					
			
	}

}
