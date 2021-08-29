package DockerTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumEdge {

	@Test
	public void EdgeTest() throws MalformedURLException{
		DesiredCapabilities dc = DesiredCapabilities.edge();
		
		URL url = new URL("http://localhost:5555/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, dc);
		
		// WebDriver driver = new RemoteWebDriver(new URL("http://localhost:5555/wd/hub"), dc);
		driver.get("https://www.google.com/");
		System.out.println("Te loaded page title is : " + driver.getTitle());
		driver.quit();

	}

}
