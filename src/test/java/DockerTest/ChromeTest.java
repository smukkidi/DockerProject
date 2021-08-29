package DockerTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest {

	@Test
	public void ChromeBrowserTest() throws MalformedURLException{
		
		System.out.println("Running on chrome.");
		ChromeOptions op = new ChromeOptions();
		
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, op);
		driver.get("https://www.google.com/");
		System.out.println("Te loaded page title is : " + driver.getTitle());
		driver.quit();
	}
	
	@Test
	public void ChromeBrowserTestTwo() throws MalformedURLException{
		
		System.out.println("Running on chrome.");
		ChromeOptions op = new ChromeOptions();
		
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, op);
		driver.get("https://www.google.com/");
		System.out.println("Te loaded page title is : " + driver.getTitle());
		System.out.println(op.getPlatform());
		driver.quit();
	}
	
}
