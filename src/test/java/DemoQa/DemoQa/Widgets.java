package DemoQa.DemoQa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class Widgets {

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

		driver.findElement(By.xpath("(//span)[25]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='card']//div[@id='section1Heading']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@class='accordion']//div[@id='section2Heading']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@class='card']//div[@id='section2Heading']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@id='accordianContainer']//div[@id='section3Heading']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@class='card']//div[@id='section3Heading']")).click();

		Thread.sleep(5000);

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