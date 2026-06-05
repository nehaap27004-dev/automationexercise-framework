package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {
	WebDriver driver;
	//constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	//Locators
	By signupLoginButton = By.xpath("//a[contains(text(), 'Signup / Login')]");
	By emailTextbox = By.xpath("//input[@data-qa='login-email']");
	By passwordTextbox = By.xpath("//input[@data-qa='login-password']");
	By loginButton = By.xpath("//button[@data-qa='login-button']");
	By loginErrorMessage = By.xpath("//form[@action='/login']//p");
	By loggedInAsText = By.xpath("//a[contains(text(),'Logged in as')]");
	By logoutButton = By.xpath("//a[contains(text(),'Logout')]");

	By signupNameTextbox = By.xpath("//input[@data-qa='signup-name']");
	By signupEmailTextbox = By.xpath("//input[@data-qa='signup-email']");
	By signupButton = By.xpath("//button[@data-qa='signup-button']");
	By emailAlreadyExistMessage = By.xpath("//p[contains(text(),'Email Address already exist!')]");

	//Methods
	
	public void clickSignupLogin() {
		driver.findElement(signupLoginButton).click();
		
	}
	public void enterEmail(String email) {
		driver.findElement(emailTextbox).sendKeys(email);
		
	}
	public void enterPassword(String password) {
		driver.findElement(passwordTextbox).sendKeys(password);
	}
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}
	public String getLoggedInText() {

		return driver.findElement(loggedInAsText).getText();
	
	}
	public void clickLogoutButton() {

		driver.findElement(logoutButton).click();
	}

	public String getLoginErrorMessage() {		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(loginErrorMessage));
		return driver.findElement(loginErrorMessage).getText();
	}


	
	public void enterSignupName(String name) {
		driver.findElement(signupNameTextbox).sendKeys(name);
		
	}
	public void enterSignupEmail(String email) {

		driver.findElement(signupEmailTextbox).sendKeys(email);

	}
	public void clickSignupButton() {

		driver.findElement(signupButton).click();

	}
	public String getEmailAlreadyExistMessage() {

		
		return driver.findElement(emailAlreadyExistMessage).getText();

	}

}
