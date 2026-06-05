package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CartPage {


	WebDriver driver;
	
	// Constructor
	public CartPage(WebDriver driver) {
	
	    this.driver = driver;
	}
	
	// Locators
	
	By viewCartButton = By.xpath("//u[contains(text(),'View Cart')]");
	
	By cartProduct = By.xpath("//td[@class='cart_description']/h4/a");
	
	By removeProductButton = By.xpath("//a[@class='cart_quantity_delete']");
	
	By emptyCartMessage = By.id("empty_cart");
	
	// Methods
	
	public void clickViewCart() {

		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.elementToBeClickable(viewCartButton));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();",
		        driver.findElement(viewCartButton));
		

	}

	
	public String getCartProductName() {
	
	    return driver.findElement(cartProduct).getText();
	}
	
	public void clickRemoveProduct() {
	
	    driver.findElement(removeProductButton).click();
	}
	
	public String getEmptyCartMessage() {

		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOfElementLocated(emptyCartMessage));

		return driver.findElement(emptyCartMessage).getText();
		

		}



}
