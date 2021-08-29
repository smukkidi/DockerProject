package dockertest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dockertestongwithDocker {
	
	public RemoteWebDriver driver = null;
	public DesiredCapabilities dc = null;
	
	@Test
	public void testingDocker() throws MalformedURLException{
		
		dc = DesiredCapabilities.firefox();
		
		URL url = new URL("http://localhost:4444/wd/hub");
		
		driver = new RemoteWebDriver(url, dc);


		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		WebElement userName = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement loginButton = driver.findElement(By.id("btnLogin"));

		userName.sendKeys("admin");
		password.sendKeys("admin123");

		String enteredusername = userName.getAttribute("value");
		String enteredpassword = password.getAttribute("value");

		System.out.println("Entered User Name is : " + enteredusername);
		System.out.println("Entered Password Name is : " + enteredpassword);

		loginButton.click();

		String title = driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");
	}

}
