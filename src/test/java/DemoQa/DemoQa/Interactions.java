package DemoQa.DemoQa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;

public class Interactions {
	WebDriver driver;
	JavascriptExecutor js;

	@Test(priority = 0)
	public void elements() throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.xpath("(//span)[3]")).click();
		Thread.sleep(7000L);

	}

	@Test(priority = 1)
	public void interaction() throws InterruptedException, AWTException {

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");

		Thread.sleep(4000);

		driver.findElement(By.xpath("(//span)[35]")).click();
		Thread.sleep(4000);

	}

	@Test(priority = 2)
	public void sortable() throws InterruptedException, AWTException {

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");
		
		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");
		
		
		driver.findElement(By.xpath("(//li)[25]")).click();
		
		Thread.sleep(3000);
		
		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");
		
		
		
		Thread.sleep(4000);
		
		Actions a= new Actions(driver);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[1]")), driver.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[6]")));
		a.build().perform();
		
		Thread.sleep(2000);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[1]")), driver.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[5]")));
		a.build().perform();
		
		Thread.sleep(2000);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[1]")), driver.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[4]")));
		a.build().perform();
		
		Thread.sleep(2000);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[1]")), driver.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[3]")));
		a.build().perform();
		
		Thread.sleep(2000);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[1]")), driver.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[2]")));
		a.build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"demo-tab-grid\"]")).click();
		
		Thread.sleep(2000);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]")), driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[9]")));
		a.build().perform();
		
		Thread.sleep(5000);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]")), driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[8]")));
		a.build().perform();
		
		Thread.sleep(5000);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]")), driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[7]")));
		a.build().perform();
		
		Thread.sleep(5000);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]")), driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[6]")));
		a.build().perform();
		
		Thread.sleep(5000);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]")), driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[5]")));
		a.build().perform();
		
		Thread.sleep(5000);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]")), driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[4]")));
		a.build().perform();
		
		Thread.sleep(5000);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]")), driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[3]")));
		a.build().perform();
		
		Thread.sleep(5000);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]")), driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[2]")));
		a.build().perform();
		
		Thread.sleep(5000);
		
		
		
		}
	
	@Test(priority = 3)
	public void selectable() throws InterruptedException, AWTException {

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");
		
		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");
		
		
		driver.findElement(By.xpath("(//li)[26]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//li)[34]")).click();
		driver.findElement(By.xpath("(//li)[35]")).click();
		
		js=(JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(350,250)");
		driver.findElement(By.xpath("(//li)[36]")).click();
		driver.findElement(By.xpath("(//li)[37]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a)[4]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//li)[38]")).click();
		driver.findElement(By.xpath("(//li)[39]")).click();
		driver.findElement(By.xpath("(//li)[40]")).click();
		driver.findElement(By.xpath("(//li)[41]")).click();
		driver.findElement(By.xpath("(//li)[42]")).click();
		driver.findElement(By.xpath("(//li)[43]")).click();
		driver.findElement(By.xpath("(//li)[44]")).click();
		driver.findElement(By.xpath("(//li)[45]")).click();
		driver.findElement(By.xpath("(//li)[46]")).click();
		

		
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
