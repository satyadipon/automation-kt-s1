package setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Setup {

	private WebDriver driver = null;

	public WebDriver getDriver() {
		return driver;
	}

	private void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	@BeforeSuite
	void beforeSuite() {

		WebDriverManager.chromedriver().setup();

	}

	@BeforeMethod
	void beforeMethod() {

		setDriver(new ChromeDriver());
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@AfterMethod
	void afterMethod() {

	}

}
