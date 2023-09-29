package DemoQa.DemoQa;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeSuite;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class AlertFrameswindows {

	WebDriver driver;
	JavascriptExecutor js;

	@Test(priority = 0)
	public void elements() throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.xpath("(//div)[21]")).click();
		Thread.sleep(7000L);
		// driver.findElement(By.xpath("(//div)[21]")).click();
		// Thread.sleep(3000);

	}

	@Test(priority = 1)
	public void alertFramesandWindows() throws InterruptedException {

		driver.findElement(By.xpath("(//span)[17]")).click();

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(250,350)");
		Thread.sleep(3000);

	}

	@Test(priority = 2)
	public void broweserWindows() throws InterruptedException, AWTException {

		driver.findElement(By.xpath("(//span)[18]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#tabButton")).click();
		Thread.sleep(5000);
		ArrayList<String> a = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(a.get(1));
		Thread.sleep(5000);
		// driver.findElement(By.cssSelector("#sampleHeading")).getText();
		Assert.assertEquals(driver.findElement(By.cssSelector("#sampleHeading")).getText(), "This is a sample page");

		driver.close();

		driver.switchTo().window(a.get(0));
		Thread.sleep(4000);

		driver.findElement(By.cssSelector("#windowButton")).click();
		Thread.sleep(5000);

		ArrayList<String> b = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(b.get(1));
		Thread.sleep(4000);
		// driver.findElement(By.cssSelector("#sampleHeading")).getText();
		Assert.assertEquals(driver.findElement(By.cssSelector("#sampleHeading")).getText(), "This is a sample page");
		driver.close();
		Thread.sleep(5000);

		driver.switchTo().window(b.get(0));

		driver.findElement(By.cssSelector("#messageWindowButton")).click();

		Thread.sleep(4000);

		ArrayList<String> c = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(c.get(1));
		Thread.sleep(4000);

		Robot r = new Robot();

		r.mouseMove(482, 17);
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);

		driver.switchTo().window(c.get(0));

		Thread.sleep(3000);



	}

	@Test(priority = 3)
	public void alerts() throws InterruptedException {

		driver.findElement(By.xpath("(//span)[19]")).click();

		driver.findElement(By.cssSelector("#alertButton")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("#timerAlertButton")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#confirmButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.cssSelector("#confirmButton")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		// System.out.println(driver.findElement(By.cssSelector("#confirmResult")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("#confirmResult")).getText(), "You selected " + "Ok");

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(250,350)");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#promtButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Top-G");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#promptResult")).getText();
		Assert.assertEquals(driver.findElement(By.cssSelector("#promptResult")).getText(), "You entered " + "Top-G");

	}
	
	@Test(priority = 4)
	public void frames() throws InterruptedException, AWTException {
		
		
		driver.findElement(By.xpath("(//span)[20]")).click();
		Thread.sleep(2000);
		//List<WebElement> a=(driver.findElements(By.tagName("iframe")));
		//System.out.println(a.size());
		driver.switchTo().frame(3);
		
		//driver.findElement(By.cssSelector("#sampleHeading")).getText();
		Assert.assertEquals(driver.findElement(By.cssSelector("#sampleHeading")).getText(), "This is a sample page");
		driver.switchTo().defaultContent();
		
		
		Thread.sleep(4000);
		driver.switchTo().frame(4);
		Thread.sleep(3000);
		Assert.assertEquals(driver.findElement(By.cssSelector("#sampleHeading")).getText(), "This is a sample page");
		
		
		
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
