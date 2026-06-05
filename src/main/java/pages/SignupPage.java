package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupPage {
	WebDriver driver; 
	// Constructor 
	public SignupPage(WebDriver driver) { 
		this.driver = driver; 
	}
	// Locators 
	By titleMrs = By.id("id_gender2"); 
	By password = By.id("password"); 
	 
	By firstName = By.id("first_name"); 
	By lastName = By.id("last_name"); 
	By address = By.id("address1"); 
	By country = By.id("country"); 
	By state = By.id("state");
	By city = By.id("city"); 
	By zipcode = By.id("zipcode"); 
	By mobileNumber = By.id("mobile_number");
	By createAccountButton = By.xpath("//button[contains(text(),'Create Account')]");
	// Methods
	public void selectTitle() {
		driver.findElement(titleMrs).click();
	} 
	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass); 
	} 
	public void enterFirstName(String fname) {
		driver.findElement(firstName).sendKeys(fname); 
	} 
	public void enterLastName(String lname) {
		driver.findElement(lastName).sendKeys(lname);
	
	}
	public void enterAddress(String addr) {
		driver.findElement(address).sendKeys(addr); 
	}
	public void selectCountry(String countryValue) {

		Select countryDropdown = new Select(driver.findElement(country));

		countryDropdown.selectByVisibleText(countryValue);

	}
	public void enterState(String st) { 
		driver.findElement(state).sendKeys(st); 
	} 
	public void enterCity(String ct) {
		driver.findElement(city).sendKeys(ct); 
	} 
	public void enterZipcode(String zip) { 
		driver.findElement(zipcode).sendKeys(zip); 
	} 
	public void enterMobileNumber(String mobile) {
		driver.findElement(mobileNumber).sendKeys(mobile); 
	} 
	public void clickCreateAccount() { 
		driver.findElement(createAccountButton).click(); 
	}
}
