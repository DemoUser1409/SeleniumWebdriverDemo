package automationFramework;
		import static org.junit.Assert.assertEquals;
		import java.util.concurrent.TimeUnit;
		import lib.FunctionalLibrary;
		import org.junit.After;
		import org.junit.Before;
		import org.junit.Test;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.PageFactory;
		import pageObjects.RegisterPage;

public class TestCase_POF {
	
	static WebDriver driver;
	
	@Before 
	public void setup_driver() throws Exception
	{
		// Launching the browser
		System.setProperty("webdriver.chrome.driver","D:/Personal/java/workspace/driver/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void testWebsite() throws Exception
	{
		RegisterPage register_page = PageFactory.initElements(driver, RegisterPage.class);
		FunctionalLibrary lib = new FunctionalLibrary();
		//get the title of the page
		String actualTitle="Sign-on: Mercury Tours";
		String expectedtitle= driver.getTitle();
		System.out.println("Title is:"+expectedtitle);
		PageFactory.initElements(driver, TestCase_POF.class);
		//Automation of Functionality			
		register_page.register_link.click();
		register_page.first_name.sendKeys(lib.generatingRandomAlphanumericString());
		register_page.last_name.sendKeys(lib.generatingRandomAlphanumericString());
		register_page.phone.sendKeys(lib.generatingRandomNumber());
		register_page.email.sendKeys(lib.generatingRandomAlphanumericString());
		register_page.address1.sendKeys(lib.generatingRandomAlphanumericString());
		register_page.city.sendKeys(lib.generatingRandomAlphanumericString());
		register_page.state.sendKeys(lib.generatingRandomAlphanumericString());
		register_page.postalCode.sendKeys(lib.generatingRandomNumber());
		register_page.userName.sendKeys(lib.generatingRandomAlphanumericString());
		String password = lib.generatingRandomAlphanumericString();
		register_page.password.sendKeys(password);
		register_page.confirmPassword.sendKeys(password);
		register_page.submit.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertEquals(actualTitle,expectedtitle);

	}
	
	@After
	public void teardown() throws Exception
	{
		//Close all the browser instance
		driver.quit();
		
	}

}

