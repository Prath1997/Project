package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	String bpath="https://chandanachaitanya.github.io/selenium-practice-site/";
	
	@BeforeMethod 
	public void b(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QA3\\Desktop\\prathamesh new\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(bpath);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void a(){
		driver.close();
	}
	
	
	
  @Test
  public void cheakbox() throws InterruptedException {
	
	 driver.findElement(By.xpath("//input[@id='bicycle-checkbox']")).click();
	 Thread.sleep(1000);
	 
	 driver.findElement(By.xpath("//input[@id='bike-checkbox']")).click();
	 Thread.sleep(1000);
	 
	 driver.findElement(By.xpath("//input[@id='hatchback-checkbox']")).click();
	 Thread.sleep(1000);
	 
	 driver.findElement(By.xpath("//input[@id='sedan-checkbox']")).click();
	 Thread.sleep(1000);
	 
	 driver.findElement(By.xpath("//input[@id='van-checkbox']")).click();
	 Thread.sleep(1000);
	 
	 driver.findElement(By.xpath("//input[@id='suv-checkbox']")).click();
	 Thread.sleep(1000);
	 
	 driver.findElement(By.xpath("//input[@id='truck-checkbox']")).click();
	 Thread.sleep(1000);
	  	  
  }
  
  @Test
  public void radiobutton() throws InterruptedException{
	  
	 driver.findElement(By.xpath("//input[@id='magazines-radio-btn']")).click();
		 Thread.sleep(1000);
		 
	 driver.findElement(By.xpath("//input[@id='novels-radio-btn']")).click();
		 Thread.sleep(1000);
		 
	 driver.findElement(By.xpath("//input[@id='self-help-radio-btn']")).click();
		 Thread.sleep(1000);
  }
  
  @Test
  public void listfield() throws InterruptedException{
	  
	  Select cplus=new Select(driver.findElement(By.xpath("//select[@id='programming-languages']")));
		 cplus.selectByValue("C++");
		 Thread.sleep(1000);
		 
		 Select csharp=new Select(driver.findElement(By.xpath("//select[@id='programming-languages']")));
		 csharp.selectByValue("C#");
		 Thread.sleep(1000);
		 
		 Select JavaScript=new Select(driver.findElement(By.xpath("//select[@id='programming-languages']")));
		 JavaScript.selectByValue("JavaScript");
		 Thread.sleep(1000);
		 
		 Select Python=new Select(driver.findElement(By.xpath("//select[@id='programming-languages']")));
		 Python.selectByValue("Python");
		 Thread.sleep(1000);
		 
		 Select PHP=new Select(driver.findElement(By.xpath("//select[@id='programming-languages']")));
		 PHP.selectByValue("PHP");
		 Thread.sleep(1000);
		 
		 Select java=new Select(driver.findElement(By.xpath("//select[@id='programming-languages']")));
		 java.selectByValue("Java");
		 Thread.sleep(1000);
	  
  }
  @Test
  public void multilist() throws InterruptedException{
	  
	  Select multi=new Select(driver.findElement(By.xpath("//select[@id='selenium_suite']")));
		multi.selectByValue("IDE");
		Thread.sleep(1000);
		
		multi.selectByValue("WebDriver");
		Thread.sleep(1000);
		
		multi.selectByValue("RC");
		Thread.sleep(1000);
		
		multi.selectByValue("Grid");
		Thread.sleep(1000);
		
		multi.selectByValue("Adv");
		Thread.sleep(1000);
		
		multi.selectByValue("Limitations");
		Thread.sleep(1000);
		
		
		
		multi.deselectByValue("IDE");
		Thread.sleep(1000);
		
		multi.deselectByValue("Adv");
		Thread.sleep(1000);
		
		multi.deselectByValue("Grid");
		Thread.sleep(1000);
	  
  }
  
  @Test
  public void button() throws InterruptedException{
	  
	  driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		 Thread.sleep(2000);
		 driver.switchTo().alert().accept();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
		 Thread.sleep(2000);
		 Assert.assertEquals(driver.switchTo().alert().getText(), "Click 'OK' or 'Cancel'.");
		 Thread.sleep(1000);
		 driver.switchTo().alert().accept();
		 
		 driver.findElement(By.xpath("//button[@id='promptBox']")).click();
		 Thread.sleep(2000);
		 Assert.assertEquals(driver.switchTo().alert().getText(), "Which Selenium Tool do you like the most?");
		 Thread.sleep(1000);
		 driver.switchTo().alert().accept();
  }
  
}
