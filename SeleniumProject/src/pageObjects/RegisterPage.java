package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage {
	
	final WebDriver driver;
	
	@FindBy(how = How.LINK_TEXT, using = "REGISTER")
	@CacheLookup
	public WebElement register_link;
	
	@FindBy(how = How.NAME, using = "firstName")
	@CacheLookup
	public WebElement first_name;
	
	@FindBy(how = How.NAME, using = "lastName")
	@CacheLookup
	public WebElement last_name;
	
	@FindBy(how = How.NAME, using = "phone")
	@CacheLookup
	public WebElement phone;
	
	@FindBy(how = How.ID, using = "userName")
	@CacheLookup
	public WebElement userName;
	
	@FindBy(how = How.NAME, using = "address1")
	@CacheLookup
	public WebElement address1;
	
	@FindBy(how = How.NAME, using = "city")
	@CacheLookup
	public WebElement city;
	
	@FindBy(how = How.NAME, using = "state")
	@CacheLookup
	public WebElement state;
	
	@FindBy(how = How.NAME, using = "postalCode")
	@CacheLookup
	public WebElement postalCode;
	
	@FindBy(how = How.NAME, using = "country")
	@CacheLookup
	public WebElement country;
	
	@FindBy(how = How.ID, using = "email")
	@CacheLookup
	public WebElement email;
	
	@FindBy(how = How.NAME, using = "password")
	@CacheLookup
	public WebElement password;
	
	@FindBy(how = How.NAME, using = "confirmPassword")
	@CacheLookup
	public WebElement confirmPassword;
	
	@FindBy(how = How.NAME, using = "register")
	@CacheLookup
	public WebElement submit;
	
	@FindBy(how = How.LINK_TEXT, using = "sign-in")
	@CacheLookup
	public By signin;
	
	// This is a constructor, as every page need a base driver to find web elements
	public RegisterPage(WebDriver driver)
	 
	{
 
		this.driver = driver;
 
	}

}
