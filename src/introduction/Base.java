package introduction;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public WebDriver driver;
	
	
	public WebDriver initializeDriver() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		return driver;
				
	}
	
	
	public void launchApplication() {
		driver = initializeDriver();
		driver.get("https://www.saucedemo.com/");
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
