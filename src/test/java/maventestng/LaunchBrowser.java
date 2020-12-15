package maventestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	String url = "https://www.google.com";
	String actual, expected;
	
	@Test
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		actual=driver.getTitle();
		expected="Google";
		//Performing assert using TestNG
		Assert.assertEquals(actual, expected, "Mismatch in title");
		driver.manage().window().maximize();
		driver.quit();
		
	}

}
