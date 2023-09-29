package DemoQa.DemoQa;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeSuite;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class NewTest {
	WebDriver driver;
	JavascriptExecutor js;

	@Test(priority = 0)
	public void elements() throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.xpath("(//div)[21]")).click();
		Thread.sleep(15000L);
		// driver.findElement(By.xpath("(//div)[21]")).click();
		// Thread.sleep(3000);

	}

	@Test(priority = 1)
	public void alertFramesandWindows() throws InterruptedException {

		driver.findElement(By.xpath("(//span)[17]")).click();

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(250,350)");
		
		Thread.sleep(2000);
		
		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(250,350)");
		
		
		Thread.sleep(3000);

	}

	@Test(priority = 2)
	public void frames() throws InterruptedException, AWTException {
		
		driver.findElement(By.xpath("(//span)[21]")).click();
		
		driver.switchTo().frame(6);
		System.out.println(driver.findElement(By.cssSelector("#frame1")).getText());
		//driver.findElement(By.cssSelector("#frame1")).getText();
		
		Thread.sleep(3000);
		driver.switchTo().frame(10);
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
