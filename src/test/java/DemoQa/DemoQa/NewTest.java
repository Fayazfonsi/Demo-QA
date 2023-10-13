package DemoQa.DemoQa;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeSuite;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;

public class NewTest {
	WebDriver driver;
	JavascriptExecutor js;

	@Test(priority = 0)
	public void elements() throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.xpath("(//div)[21]")).click();
		Thread.sleep(7000L);

	}
	
	@Test(priority = 1)
	public void widgets2() throws InterruptedException, AWTException {

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span)[24]")).click();
		Thread.sleep(3000);
		
		
	}
	

	@Test(priority = 2)
	public void Accordian() throws InterruptedException, AWTException {
		
		js =(JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span)[27]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("#datePickerMonthYearInput")).click();
		Thread.sleep(3000);
		
		
		WebElement staticDropdown= driver.findElement(By.xpath("(//select)[1]"));
		
		Select down = new Select(staticDropdown);
		down.selectByIndex(7);
		
		Thread.sleep(3000);
		
		WebElement staticDropdown1= driver.findElement(By.xpath("(//select)[2]"));
		
		
		Select down1 = new Select(staticDropdown1);
		down1.selectByValue("2023");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@role='listbox']//div[@aria-label='Choose Wednesday, August 2nd, 2023']")).click();
		Thread.sleep(3000);
		
	    driver.findElement(By.cssSelector("#dateAndTimePickerInput")).click();
	    
	    driver.findElement(By.xpath("(//div)[82]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//div)[86]")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//div)[84]")).click();
	    
	    
	    
		
		
		
		Thread.sleep(4000);
		
		
		

	}
	
	

	
	
	@BeforeSuite
	public void beforeSuite() {

		System.setProperty("webdriver.chrome.driver",
				"E:\\eclips\\chrome driver\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://demoqa.com/elements");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	@AfterSuite
	public void afterSuite() {
		driver.quit();

	}
}
