package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {

	WebDriver driver;
	
	// Constructor
	public PaymentPage(WebDriver driver) {
	
	    this.driver = driver;
	}
	
	// Locators
	
	By nameOnCard =
	        By.name("name_on_card");
	
	By cardNumber =
	        By.name("card_number");
	
	By cvcNumber =
	        By.name("cvc");
	
	By expiryMonth =
	        By.name("expiry_month");
	
	By expiryYear =
	        By.name("expiry_year");
	
	By payAndConfirmButton =
	        By.id("submit");
	
	By orderSuccessMessage =
	        By.xpath("//p[contains(text(),'Congratulations! Your order has been confirmed!')]");
	
	// Methods
	
	public void enterNameOnCard(String name) {
	
	    driver.findElement(nameOnCard).sendKeys(name);
	}
	
	public void enterCardNumber(String number) {
	
	    driver.findElement(cardNumber).sendKeys(number);
	}
	
	public void enterCVC(String cvc) {
	
	    driver.findElement(cvcNumber).sendKeys(cvc);
	}
	
	public void enterExpiryMonth(String month) {
	
	    driver.findElement(expiryMonth).sendKeys(month);
	}
	
	public void enterExpiryYear(String year) {
	
	    driver.findElement(expiryYear).sendKeys(year);
	}
	
	public void clickPayAndConfirmOrder() {
	
	    driver.findElement(payAndConfirmButton).click();
	}
	
	public String getOrderSuccessMessage() {
	
	    return driver.findElement(orderSuccessMessage).getText();
	}


}
