package Sample2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Project2 {
	WebDriver driver;
	
	
@BeforeTest
public void setup() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\EHRC\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
	
     driver = new ChromeDriver();
	 driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	 driver.manage().window().maximize();
	
	
}

@Test(enabled = true, priority = 1)
public void login() throws InterruptedException {
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rahulshettyacademy");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("learning");
	//Thread.sleep(1000);
	driver.findElement(By.xpath("//label[@class='customradio'][2]")).click();
	//driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();

	Thread.sleep(2000);
	driver.findElement(By.id("okayBtn")).click();
	
	WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
	  dropdown.sendKeys("teach");
	  
	 driver.findElement(By.id("terms")).click();
	 driver.findElement(By.id("signInBtn")).click();

	}

@Test(enabled = false, priority = 2)
public void category1() throws InterruptedException {
	
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//a[text()='Category 1']")).click();
	 driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Test");
	 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("xyz@gmail.com");
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@123");
	 driver.findElement(By.id("exampleCheck1")).click();
	 
     WebElement dropdown1 = driver.findElement(By.id("exampleFormControlSelect1"));
	  dropdown1.sendKeys("Female");
	  driver.findElement(By.id("inlineRadio2")).click();
	  driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("01/01/2002");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
}

@Test(enabled = false, priority = 3)
 public void category2() throws InterruptedException {
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("//a[text()='Category 2']")).click();
	driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Test1");
	 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@123");
	 driver.findElement(By.id("exampleCheck1")).click();
	 
    WebElement dropdown1 = driver.findElement(By.id("exampleFormControlSelect1"));
	  dropdown1.sendKeys("Female");
	  driver.findElement(By.id("inlineRadio2")).click();
	  driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("02/04/2002");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	
}

@Test(enabled = false, priority = 4)
public void category3() throws InterruptedException {
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("//a[text()='Category 3']")).click();
	driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Test2");
	 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("def@gmail.com");
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@123");
	 driver.findElement(By.id("exampleCheck1")).click();
	 
   WebElement dropdown1 = driver.findElement(By.id("exampleFormControlSelect1"));
	  dropdown1.sendKeys("Female");
	  driver.findElement(By.id("inlineRadio2")).click();
	  driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("06/04/2002");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	
}

@Test(enabled = true, priority = 5)
public void Add() throws InterruptedException {
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
	driver.findElement(By.xpath("(//button[@class='btn btn-info'])[2]")).click();
	driver.findElement(By.xpath("(//button[@class='btn btn-info'])[3]")).click();
	driver.findElement(By.xpath("(//button[@class='btn btn-info'])[4]")).click();
	
	driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
	
	driver.findElement(By.id("country")).sendKeys("Test");
	
	driver.findElement(By.xpath("//label[@for='checkbox2']")).click();
	Thread.sleep(4000);
//	driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();

	driver.findElement(By.xpath("//input[@type='submit']")).click();
}
}


