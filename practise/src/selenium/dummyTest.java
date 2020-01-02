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

public class dummyTest {
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
	
	/*@AfterMethod
	public void a(){
		driver.close();
	}*/
	
	
  @Test
  public void f() throws InterruptedException {
	 
	 driver.findElement(By.xpath("//button[@id='promptBox']")).click();
	 Thread.sleep(2000);
	 Assert.assertEquals(driver.switchTo().alert().getText(), "Which Selenium Tool do you like the most?");
	 Thread.sleep(1000);
	 driver.switchTo().alert().accept();
	
  }
}
