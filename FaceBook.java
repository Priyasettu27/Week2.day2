package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args)throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		System.out.println("FaceBook page is loaded successfully");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		System.out.println("Create new account clicked successfully");
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("Priya");
		System.out.println("firstname entered successfully");
		driver.findElement(By.name("lastname")).sendKeys("Settu");
		System.out.println("lastname entered successfully");
		driver.findElement(By.name("reg_email__")).sendKeys("9999999999");
		System.out.println("Registered email or mobile number entered successfully");
		driver.findElement(By.id("password_step_input")).sendKeys("Crazy@123");
		System.out.println("New Password entered Successfully");
		
		//step1: first identify the dropdown with the select tag-->Webelement
		WebElement drop1 = driver.findElement(By.id("day"));
		//step2: convert the webelement as select class(for webdriver to understand)
		Select select=new Select(drop1);
		//step3: Choose the method(text\value\index)to perform the action
		select.selectByValue("6");
		System.out.println("Date has been selected");
		
		//step1: first identify the dropdown with the select tag-->Webelement
		WebElement drop2=driver.findElement(By.id("month"));
		//step2: convert the webelement as select class(for webdriver to understand)
		Select select1=new Select(drop2);
		//step3: Choose the method(text\value\index)to perform the action
		select1.selectByValue("11");
		System.out.println("Month has been selected successfully");
		
		//step1: first identify the dropdown with the select tag-->Webelement
		WebElement drop3=driver.findElement(By.id("year"));
		//step2: convert the webelement as select class(for webdriver to understand)
		Select select2=new Select(drop3);
		//step3: Choose the method(text\value\index)to perform the action
		select2.selectByVisibleText("1995");
		System.out.println("Year has been selected successfully");
		
		driver.findElement(By.xpath("//label[contains(@class,'_58mt')]")).click();
		System.out.println("Radio Button clicked successfully");
		
				
		
	}

}
