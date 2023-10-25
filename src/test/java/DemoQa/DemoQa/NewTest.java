package DemoQa.DemoQa;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeSuite;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v113.css.model.Value;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;

public class NewTest {
	WebDriver driver;
	JavascriptExecutor js;

	@Test(priority = 0)
	public void elements() throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.xpath("(//span)[3]")).click();
		Thread.sleep(7000L);

	}

	@Test(priority = 1)
	public void widgets2() throws InterruptedException, AWTException {

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");

		Thread.sleep(4000);

		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[4]/span/div/div[1]/span")).click();
		Thread.sleep(2000);

	}

	@Test(priority = 2)
	public void menu() throws InterruptedException, AWTException {

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");
		
		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");
		
		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");
		
		driver.findElement(By.xpath("(//li)[24]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"withOptGroup\"]/div/div[1]")).click();
		
		Thread.sleep(3000);
		
		
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
