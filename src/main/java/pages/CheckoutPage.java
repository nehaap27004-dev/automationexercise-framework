package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CheckoutPage {

	WebDriver driver;
	
	// Constructor
	public CheckoutPage(WebDriver driver) {
	
	    this.driver = driver;
	}
	
	// Locators
	
	By proceedToCheckoutButton =
	        By.xpath("//a[contains(text(),'Proceed To Checkout')]");
	
	By checkoutPageText =
	        By.xpath("//h2[contains(text(),'Address Details')]");
	
	By billingAddressName =
			By.xpath("//ul[@id='address_delivery']//li[@class='address_firstname address_lastname']");

	By shippingAddressName =
			By.xpath("//ul[@id='address_invoice']//li[@class='address_firstname address_lastname']");

	By orderProductName =
			By.xpath("//td[@class='cart_description']/h4/a");

	By orderProductPrice =
			By.xpath("//td[@class='cart_price']/p");

	By orderProductQuantity =
			By.xpath("//td[@class='cart_quantity']/button");

	By orderTotalPrice =
			By.xpath("//td[@class='cart_total']/p[@class='cart_total_price']");
	By commentTextArea =
			By.name("message");

	By placeOrderButton =
			By.xpath("//a[contains(text(),'Place Order')]");

	By paymentPageText =
			By.xpath("//h2[contains(text(),'Payment')]");

	// Methods
	
	public void clickProceedToCheckout() {
	
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckoutButton));
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].click();",
	        driver.findElement(proceedToCheckoutButton));
	
	
	}
	
	
	public String getCheckoutPageText() {
	
	    return driver.findElement(checkoutPageText).getText();
	}
	public String getBillingAddressName() {

		return driver.findElement(billingAddressName).getText();
	}
	public String getShippingAddressName() {

		return driver.findElement(shippingAddressName).getText();

	}
	public String getOrderProductName() {

		return driver.findElement(orderProductName).getText();
	}
	public String getOrderProductPrice() {

		return driver.findElement(orderProductPrice).getText();
	}
	public String getOrderProductQuantity() {

		return driver.findElement(orderProductQuantity).getText();
	}
	public String getOrderTotalPrice() {
		return driver.findElement(orderTotalPrice).getText();
	}
	public void enterComment(String comment) {

		driver.findElement(commentTextArea).sendKeys(comment);
	}

	public void clickPlaceOrder() {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();",
		        driver.findElement(placeOrderButton));
	}

	public String getPaymentPageText() {

		return driver.findElement(paymentPageText).getText();
	}

}
