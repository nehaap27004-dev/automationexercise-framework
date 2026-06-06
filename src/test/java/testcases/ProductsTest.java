package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.ProductsPage;
import pages.CartPage;

public class ProductsTest extends BaseClass {

	/**@Test
	public void verifyValidProductSearch() {
	
	    // Create ProductsPage object
	    ProductsPage pp = new ProductsPage(driver);
	
	    // Click Products button
	    pp.clickProductsButton();
	
	    // Enter valid product keyword
	    pp.enterSearchProduct("shirt");
	
	    // Click Search button
	    pp.clickSearchButton();
	   
	    // Get searched products text
	    String actualText = pp.getSearchedProductsText();
	
	    // Print text
	    System.out.println("Search Result Text: " + actualText);
	
	    // Verify searched products displayed
	    Assert.assertEquals(actualText,
	            "SEARCHED PRODUCTS");
	}**/
	@Test
	public void verifyViewProduct() {

		// Create ProductsPage object
		ProductsPage pp = new ProductsPage(driver);
	
		// Click Products button
		pp.clickProductsButton();
	
		// Click first View Product
		pp.clickFirstViewProduct();
	
		// Get current URL
		String actualURL = driver.getCurrentUrl();
	
		// Print URL
		System.out.println("Current URL: " + actualURL);
	
		// Verify product details page opened
		Assert.assertTrue(actualURL.contains("product_details"));

	}
	@Test
	public void verifyProductDetails() {

		
		// Create ProductsPage object
		ProductsPage pp = new ProductsPage(driver);
	
		// Click Products button
		pp.clickProductsButton();
	
		// Click View Product
		pp.clickFirstViewProduct();
	
		// Get Product Name
		String productName = pp.getProductName();
	
		// Get Product Category
		String productCategory = pp.getProductCategory();
	
		// Get Product Price
		String productPrice = pp.getProductPrice();
	
		// Get Product Description
		String productDescription = pp.getProductDescription();
	
		// Print Details
		System.out.println("Product Name: " + productName);
	
		System.out.println("Product Category: " + productCategory);
	
		System.out.println("Product Price: " + productPrice);
	
		System.out.println("Product Description: " + productDescription);
	
		// Verifications
		Assert.assertFalse(productName.isEmpty());
	
		Assert.assertFalse(productCategory.isEmpty());
	
		Assert.assertFalse(productPrice.isEmpty());
	
		Assert.assertFalse(productDescription.isEmpty());

	}
	
	@Test
	public void verifyAddProductToCart() {

	
		// Create ProductsPage object
		ProductsPage pp = new ProductsPage(driver);
	
		// Click Products button
		pp.clickProductsButton();
	
		// Click Add To Cart
		pp.clickFirstAddToCart();
	
		// Click View Cart
		pp.clickViewCart();
	
		// Get Product Name from Cart
		String productName = pp.getCartProductName();
	
		// Print Product Name
		System.out.println("Cart Product: " + productName);
	
		// Verify product displayed in cart
		Assert.assertFalse(productName.isEmpty());
		
	}
	@Test
	public void verifyWomenCategoryFilter() {

	// Create ProductsPage object
	ProductsPage pp = new ProductsPage(driver);

	// Click Products button
	pp.clickProductsButton();

	// Click Women category
	pp.clickWomenDressCategory();

	// Click Dress subcategory
	pp.clickWomenDressCategory();

	// Get category page text
	String categoryText = pp.getCategoryPageText();

	// Print category text
	System.out.println("Category Page: " + categoryText);

	// Verify Women category products page opened
	Assert.assertTrue(categoryText.contains("WOMEN"));
	

	}
	@Test
	public void verifyRemoveProductFromCart() {

	
		// Create ProductsPage object
		ProductsPage pp = new ProductsPage(driver);
	
		// Click Products button
		pp.clickProductsButton();
	
		// Add product to cart
		pp.clickFirstAddToCart();
	
		// Create CartPage object
		CartPage cp = new CartPage(driver);
	
		// Open Cart page
		cp.clickViewCart();
	
		// Remove product
		cp.clickRemoveProduct();
	
		// Get empty cart message
		String actualMessage = cp.getEmptyCartMessage();
	
		// Print message
		System.out.println("Cart Message: " + actualMessage);
	
		// Verify cart is empty
		Assert.assertTrue(actualMessage.contains("Cart is empty!"));

		

	}



}
