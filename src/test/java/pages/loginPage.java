package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	WebDriver driver;

	By txt_username_loginpage = By.name("username");
	
	By txt_password_loginpage = By.name("password");
	
	By btn_login = By.name("login");
	
	By btn_logout = By.xpath("//a[contains(text(),'Logout')]");
	
	
	public loginPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void entrUsername(String username) {
		
		driver.findElement(txt_username_loginpage).sendKeys(username);
		
	}
	
	public void enterPassword(String password) {
		
		driver.findElement(txt_password_loginpage).sendKeys(password);
	}
	
	public void clickLogin() {
		
		driver.findElement(btn_login).click();
	}
	
	public void clickLogoutisDisplayed() {
		
		driver.findElement(btn_logout).isDisplayed();
	}
	
	public void loginvalidUser(String username, String password) {
		
		driver.findElement(txt_username_loginpage).sendKeys(username);
		driver.findElement(txt_password_loginpage).sendKeys(password);
		driver.findElement(btn_login).click();
	}
}
