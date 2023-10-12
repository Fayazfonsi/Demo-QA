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

		js= (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");
		
		driver.findElement(By.xpath("(//span)[26]")).click();
		
		driver.findElement(By.xpath("(//input)[1]")).click();
		
		Thread.sleep(2000);
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_R);
		
		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);
		
		r.keyPress(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_D);
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_Y);
		r.keyRelease(KeyEvent.VK_Y);
		
		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);
		
		r.keyPress(KeyEvent.VK_L);
		r.keyRelease(KeyEvent.VK_L);
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.keyPress(KeyEvent.VK_G);
		r.keyRelease(KeyEvent.VK_G);
		
		r.keyPress(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_R);
		
		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		

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
