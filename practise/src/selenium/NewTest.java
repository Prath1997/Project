package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
}
