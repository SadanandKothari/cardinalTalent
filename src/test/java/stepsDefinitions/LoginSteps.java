package stepsDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import pageObjects.LoginPage;

public class LoginSteps {
	public WebDriver driver;
	public LoginPage lp;
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Sadanand Kothari\\workspace\\cardinalTalent_Cucumber\\drivers\\chromedriver.exe");
		
	    driver = new ChromeDriver();
	    lp = new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String string) {
	    driver.get(string);
	}

	@When("User enter Email as {string} and Password as {string}")
	public void user_enter_Email_as_and_Password_as(String string, String string2) {
	    lp.setUserName(string);
	    lp.setPassword(string2);
	}

	@When("User click on signIn button")
	public void user_click_on_signIn_button() throws InterruptedException {
	    lp.clickLogin();
	    Thread.sleep(5000);
	}

	@Then("User varify page title should be {string}")
	public void user_varify_page_title_should_be(String title) {
	    if(driver.getPageSource().contains("Invalid email or password.")){
	    	driver.close();
	    	Assert.assertTrue(false);
	    }else{
	    	Assert.assertEquals(title, driver.getTitle());
	    }
	}

	@When("User click on logOut link")
	public void user_click_on_logOut_link() throws InterruptedException {
	    lp.clickOnLogout();
	    Thread.sleep(5000);
	}

	@Then("User close the browser")
	public void user_close_the_browser() {
	    driver.close();
	}
}
