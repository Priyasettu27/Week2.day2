package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		System.out.println("salesforce page is loaded successfully");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Priya");
		System.out.println("First Name Entered Successfully");
		
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Settu");
		System.out.println("Last Name entered Successfully");
		
		driver.findElement(By.xpath("//input[contains(@name,'UserEmail')]")).sendKeys("Priyasettu627@gmail.com");
		System.out.println("Email Entered Successfully");
		
		WebElement drop1=driver.findElement(By.xpath("//select[contains(@name,'UserTitle')]"));
		Select select=new Select(drop1);
		select.selectByVisibleText("Sales Manager");
		System.out.println("Job title selected successfully");
		
		driver.findElement(By.xpath("//input[contains(@name,'CompanyName')]")).sendKeys("Cognizant Technology Solutions");
		System.out.println("Company Name Entered Successfully");
		
		WebElement drop2=driver.findElement(By.xpath("//select[contains(@name, 'CompanyEmployees')]"));
		Select select1=new Select(drop2);
		select1.selectByVisibleText("1501+ employees");
		System.out.println("Employees Selected Successfully");
		
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("9999999999");
		System.out.println("Mobile number entered successfully");
		
		WebElement drop3=driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select select2=new Select(drop3);
		select2.selectByValue("IN");
		System.out.println("Country Selected Successfully");
		
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		System.out.println("Subscription Agreement clicked successfully");
			
		driver.close();	
		
		}

}
