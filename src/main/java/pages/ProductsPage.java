package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;

public class ProductsPage {

	
	WebDriver driver;
	
	// Constructor
	public ProductsPage(WebDriver driver) {
	
	    this.driver = driver;
	}
	
	// Locators
	
	By productsButton = By.xpath("//a[contains(text(),'Products')]");
	
	By searchTextbox = By.id("search_product");
	
	By searchButton = By.id("submit_search");
	
	By searchedProductsText = By.xpath("//h2[contains(text(),'Searched Products')]");
	
	By firstViewProductButton = By.xpath("(//a[contains(text(),'View Product')])[1]");
	
	By productName = By.xpath("//div[@class='product-information']/h2");
	
	By productCategory = By.xpath("//div[@class='product-information']/p[1]");
	
	By productPrice = By.xpath("//div[@class='product-information']/span/span");
	
	By productDescription = By.xpath("//div[@class='product-information']/p[2]");
	
	By firstAddToCartButton = By.xpath("(//a[contains(text(),'Add to cart')])[1]");

	By viewCartButton = By.xpath("//u[contains(text(),'View Cart')]");

	By cartProduct = By.xpath("//td[@class='cart_description']/h4/a");
	
	By womenCategory = By.xpath("//a[@href='#Women']");

	By womenDressCategory = By.xpath("//a[contains(text(),'Dress')]");

	By categoryPageText = By.xpath("//h2[@class='title text-center']");

	// Methods
	
	public void clickProductsButton() {
	
	    driver.findElement(productsButton).click();
	}
	
	public void enterSearchProduct(String product) {
	
	    driver.findElement(searchTextbox).sendKeys(product);
	}
	
	public void clickSearchButton() {
	
	    driver.findElement(searchButton).click();
	}
	
	public String getSearchedProductsText() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchedProductsText));
	    return driver.findElement(searchedProductsText).getText();
	}
	
	public void clickFirstViewProduct() {

	
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();",
		        driver.findElement(firstViewProductButton));

	}

	
	public String getProductName() {
	
	    return driver.findElement(productName).getText();
	}
	
	public String getProductCategory() {
	
	    return driver.findElement(productCategory).getText();
	}
	public void clickWomenDressCategory() {


		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		By dressLocator = By.xpath("//a[contains(text(),'Dress')]");

		wait.until(ExpectedConditions.presenceOfElementLocated(dressLocator));

		WebElement dressCategory = driver.findElement(dressLocator);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);", dressCategory);

		js.executeScript("arguments[0].click();", dressCategory);
	

	}


	public String getCategoryPageText() {
		return driver.findElement(categoryPageText).getText();
	
	}

	
	public String getProductPrice() {
	
	    return driver.findElement(productPrice).getText();
	}
	
	public String getProductDescription() {
	
	    return driver.findElement(productDescription).getText();
	}
	public void clickFirstAddToCart() {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();",
		        driver.findElement(firstAddToCartButton));
	}

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


}
