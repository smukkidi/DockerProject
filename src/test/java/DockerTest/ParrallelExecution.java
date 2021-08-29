package DockerTest;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParrallelExecution {

	public RemoteWebDriver driver = null;
	public DesiredCapabilities dc = null;
	public String browser = null;
	

	@BeforeTest
	@org.testng.annotations.Parameters(value = { "browser" })
	public void setUp(String browser) throws Exception {
		this.browser = browser;
		
		if (browser.equalsIgnoreCase("firefox")) {
			dc = DesiredCapabilities.firefox();
			URL url = new URL("http://localhost:4444/wd/hub");
			driver = new RemoteWebDriver(url, dc);

		} else if (browser.equalsIgnoreCase("chrome")) {
			dc = DesiredCapabilities.chrome();
			URL url = new URL("http://localhost:4444/wd/hub");
			driver = new RemoteWebDriver(url, dc);
			
		} else {
			System.out.println("Script is not running..");
		}
	}
	
	

	@Test
	public void testSimple() throws Exception {
		System.out.println("Running on : " + browser);

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
	
	@Test
	public void testSimpleTwo() throws Exception {

		System.out.println("Running on : " + browser);

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
	
	@Test
	public void testSimpleThree() throws Exception {

		System.out.println("Running on : " + browser);

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
	
	@Test
	public void testSimpleFour() throws Exception {

		System.out.println("Running on : " + browser);

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
		System.out.println(title);
		Assert.assertEquals(title, "OrangeHRM");

	}



	@AfterTest
	public void tearDown() throws Exception {

		driver.quit();
		
	}

}
