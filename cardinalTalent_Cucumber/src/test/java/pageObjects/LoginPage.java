package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath = "//*[@name='email']")
	WebElement txtEmail;
	
	

	@FindBy(xpath = "//*[@name='password']")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//*[@type='submit']")
	@CacheLookup
	WebElement btnSignIn;
	
	@FindBy(xpath = "//*[@id='dropdown-basic']")
	@CacheLookup
	WebElement clickOnDropdown;
	
	@FindBy(xpath = "//*[contains(text(),'Log Out')]")
	@CacheLookup
	WebElement clickOnLogout;
	
	
	public void setUserName(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}

	public void clickLogin() {
		btnSignIn.click();
	}
	
	public void clickOnLogout() {
		clickOnDropdown.click();
		clickOnLogout.click();
	}
}
