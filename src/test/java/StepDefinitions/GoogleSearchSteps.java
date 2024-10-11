package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	WebDriver driver = null;

//	@Given("browser is open")
//	public void browser_is_open() {
//	
//		System.out.println("Inside Steps - browser is open");
//		
//		String projectpath= System.getProperty("user.dir");
//		System.out.println("project path is:"+projectpath);
//		
//		System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/drivers/chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		
//		//driver.manage().window().maximize();
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//		
//		System.out.println("Inside Steps -user is on google search page");
//		
//		driver.navigate().to("https://www.google.com/");
//	}
//
//	@When("user enters a text in search box")
//	public void user_enters_a_text_in_search_box() throws InterruptedException {
//	
//		System.out.println("Inside Steps - user enters a text in search box");
//		
//		driver.findElement(By.name("q")).sendKeys("Automation step by step");
//		
//		Thread.sleep(3000);
//	}
//
//	@And("hits enter")
//	public void hits_enter() {
//		
//		System.out.println("Inside Steps -hits enter");
//		
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	}
//
//	@Then("user navigates to serach page")
//	public void user_navigates_to_serach_page() {
//		
//		System.out.println("Inside Steps - user navigate to search page");
//		
//		driver.getPageSource().contains("online Courses");
//		
//		driver.close();
//	}

}
