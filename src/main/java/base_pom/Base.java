package base_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base {
	protected WebDriver driver;
		public void LaunchBrowser() throws InterruptedException {
			
			
			System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Data class\\Selenium1\\driverChromeApplctn\\Chromedriver.exe");
			
			driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://neostox.com/");
			
			
			Reporter.log("launchng browser", true);
			Thread.sleep(500);
			
			
			
		}

}