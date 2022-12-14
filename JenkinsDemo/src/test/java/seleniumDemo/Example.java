package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
		 driver.manage().window().maximize(); 
	}
	@Test
	public void startBrowser() {
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
