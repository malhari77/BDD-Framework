package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.loginPage;

public class LoginDemoSteps_POM {
	
	WebDriver driver = null;
	loginPage login;

	@Given("browser is open")
	public void browser_is_open() {
		
		String projectpath = System.getProperty("user.dir");
		System.out.println("Project Path is:"+projectpath);
		
		System.setProperty("webdriver.chrome.driver", projectpath+"/src/test/resources/drivers/chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		
		driver.navigate().to("https://practice.automationtesting.in/my-account/");
				
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		
		login = new loginPage(driver);
		login.entrUsername(username);
		login.enterPassword(password);
		
		
		//driver.findElement(By.name("username")).sendKeys(username);
		//driver.findElement(By.name("password")).sendKeys(password);
		
	}
	
	@And("^clicks on login button$")
	public void clicks_on_login_button() {
		
		login.clickLogin();
		
		//driver.findElement(By.name("login")).click();
		
	}
	

	@Then("^user is navigated to the home page$")
	public void user_is_navigated_to_the_home_page() {
		
		login.clickLogoutisDisplayed();
		//driver.findElement(By.linkText("Log out")).isDisplayed();
		driver.close();
		
	}
}
