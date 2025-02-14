package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Form1 {
	@Test
	public void Amethode() throws Exception {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://qavalidation.com/demo-form/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//input[@id='g4072-fullname']")).click();
		 
		 driver.findElement(By.xpath("//input[@id='g4072-fullname']")).sendKeys("Aparna");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='g4072-email']")).sendKeys("aprna12345@gamil.com");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='g4072-phonenumber']")).sendKeys("7083573291");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//select[@id='g4072-gender']")).sendKeys("Female");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='g4072-yearsofexperience-1']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='g4072-yearsofexperience-2']")).click();
	         Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='g4072-yearsofexperience-3']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='g4072-yearsofexperience-4']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='g4072-yearsofexperience-5']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='g4072-yearsofexperience-Above 5']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='g4072-skills-Functional testing']")).click();
                 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='g4072-skills-Automation testing']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='g4072-skills-API testing']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='g4072-skills-DB testing']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//select[@id='g4072-qatools']")).sendKeys("Selenium");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//select[@id='g4072-qatools']")).sendKeys("Appium");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//select[@id='g4072-qatools']")).sendKeys("Cypress");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//select[@id='g4072-qatools']")).sendKeys("protractor");
		 Thread.sleep(2000)
		 driver.findElement(By.xpath("//textarea[@id='contact-form-comment-g4072-otherdetails']")).sendKeys("hello,My Name is Aparna."); 
		 
	       } 
	}


