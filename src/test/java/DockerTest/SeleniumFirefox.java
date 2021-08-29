package DockerTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumFirefox {

	@Test
	public void FirefoxTest() throws MalformedURLException {
		DesiredCapabilities op = DesiredCapabilities.firefox();
		System.out.println("Running on Firefox");
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, op);
		
		// WebDriver driver = new RemoteWebDriver(new URL("http://localhost:5555/wd/hub"), dc);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		System.out.println("Te loaded page title is : " + driver.getTitle());
		System.out.println(op.firefox().getPlatform());
		driver.quit();

	}
	
	@Test
	public void FirefoxTestTwo() throws MalformedURLException {
		DesiredCapabilities op = DesiredCapabilities.firefox();
		System.out.println("Running on Firefox");
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, op);
		
		// WebDriver driver = new RemoteWebDriver(new URL("http://localhost:5555/wd/hub"), dc);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		System.out.println("Te loaded page title is : " + driver.getTitle());
		System.out.println(op.firefox().getPlatform());
		driver.quit();

	}

}
