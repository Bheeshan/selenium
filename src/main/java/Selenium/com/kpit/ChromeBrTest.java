package Selenium.com.kpit;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 * 
 */
public class ChromeBrTest {

	public static String driverPath = "C:\\Program Files\\Mozilla Firefox\\";

	public static void main(String[] args) {
		System.out.println("In selenium test of browser");

		System.setProperty("webdriver.chrome.driver", driverPath
				+ "firefox.exe");
		// Creating a new instance of google driver
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Navigating to gmail");
		driver.navigate().to("https://www.google.com");
		
		String strPageTitle = driver.getTitle();
		System.out.println("Page title: - "+strPageTitle);
		Assert.assertTrue("Page title doesn't match", strPageTitle.equalsIgnoreCase("Google"));

	}
}
