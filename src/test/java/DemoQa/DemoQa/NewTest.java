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
import org.openqa.selenium.devtools.v113.css.model.Value;
import org.openqa.selenium.interactions.Actions;
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
	public void slider() throws InterruptedException, AWTException {

		js = (JavascriptExecutor) driver;
		js.executeScript("jacascript:window.scrollBy(350,250)");

		js = (JavascriptExecutor) driver;
		js.executeScript("jacascript:window.scrollBy(350,250)");

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span)[28]")).click();
		Thread.sleep(2000);

		WebElement slider = driver.findElement(By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input"));
		Actions a = new Actions(driver);
		
		//we should use x value only y value is not needed. if we use y value instead of 0 will make the test fail
		//method 1
		//a.dragAndDropBy(slider, 595, 0).perform();
		
		//method 2
		//a.dragAndDropBy(slider, 595, 0).build().perform();
		
		//method 3
		a.dragAndDropBy(slider, 595, 0);
		a.perform();
		
		//method 4
		//a.dragAndDropBy(slider, 595, 0);
		//a.build().perform();


		driver.findElement(By.cssSelector("#sliderValue")).click();
		System.out.println(driver.findElement(By.cssSelector("#sliderValue")).getAttribute("value"));

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
