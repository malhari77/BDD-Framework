package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginDemoSteps {
	
	WebDriver driver = null;

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
		
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
				
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
		
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		
		Thread.sleep(3000);
		
	}
	
	@And("clicks on login button")
	public void clicks_on_login_button() {
		
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
	}
	

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		
		driver.findElement(By.linkText("Log out")).isDisplayed();
		driver.close();
		
	}
}
