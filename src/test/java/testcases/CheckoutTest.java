package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductsPage;

public class CheckoutTest extends BaseClass {


	@Test
	public void verifyCheckoutNavigation() {
	
	    // Create LoginPage object
	    LoginPage lp = new LoginPage(driver);
	
	    // Click Signup/Login
	    lp.clickSignupLogin();
	
	    // Enter valid login email
	    lp.enterEmail("nehaap27004@gmail.com");
	
	    // Enter valid password
	    lp.enterPassword("Neha@2004");
	
	    // Click Login button
	    lp.clickLoginButton();
	
	    // Create ProductsPage object
	    ProductsPage pp = new ProductsPage(driver);
	
	    // Open Products page
	    pp.clickProductsButton();
	
	    // Add product to cart
	    pp.clickFirstAddToCart();
	
	    // Create CartPage object
	    CartPage cp = new CartPage(driver);
	
	    // Open Cart page
	    cp.clickViewCart();
	
	    // Create CheckoutPage object
	    CheckoutPage checkout = new CheckoutPage(driver);
	
	    // Click Proceed To Checkout
	    checkout.clickProceedToCheckout();
	
	    // Get checkout page text
	    String actualText = checkout.getCheckoutPageText();
	
	    // Print text
	    System.out.println("Checkout Page: " + actualText);
	
	    // Verify checkout page opened
	    Assert.assertTrue(actualText.contains("Address Details"));
	}
	@Test
	public void verifyAddressDetails() {

	
		// Create LoginPage object
		LoginPage lp = new LoginPage(driver);
	
		// Click Signup/Login
		lp.clickSignupLogin();
	
		// Enter valid email
		lp.enterEmail("nehaap27004@gmail.com");
	
		// Enter valid password
		lp.enterPassword("Neha@2004");
	
		// Click Login
		lp.clickLoginButton();
	
		// Create ProductsPage object
		ProductsPage pp = new ProductsPage(driver);
	
		// Open Products page
		pp.clickProductsButton();
	
		// Add product to cart
		pp.clickFirstAddToCart();
	
		// Create CartPage object
		CartPage cp = new CartPage(driver);
	
		// Open Cart page
		cp.clickViewCart();
	
		// Create CheckoutPage object
		CheckoutPage checkout = new CheckoutPage(driver);
	
		// Click Proceed To Checkout
		checkout.clickProceedToCheckout();
	
		// Get Billing Address Name
		String billingName = checkout.getBillingAddressName();
	
		// Get Shipping Address Name
		String shippingName = checkout.getShippingAddressName();
	
		// Print Names
		System.out.println("Billing Name: " + billingName);
	
		System.out.println("Shipping Name: " + shippingName);
	
		// Verify billing address displayed
		Assert.assertFalse(billingName.isEmpty());
	
		// Verify shipping address displayed
		Assert.assertFalse(shippingName.isEmpty());
	
		// Verify both addresses match
		Assert.assertEquals(billingName, shippingName);
		

	}
	/**@Test
	public void verifyOrderReviewDetails() {

	
	// Create LoginPage object
	LoginPage lp = new LoginPage(driver);

	// Click Signup/Login
	lp.clickSignupLogin();

	// Enter valid email
	lp.enterEmail("nehaap27004@gmail.com");

	// Enter valid password
	lp.enterPassword("Neha@2004");

	// Click Login
	lp.clickLoginButton();

	// Create ProductsPage object
	ProductsPage pp = new ProductsPage(driver);

	// Open Products page
	pp.clickProductsButton();

	// Add product to cart
	pp.clickFirstAddToCart();

	// Create CartPage object
	CartPage cp = new CartPage(driver);

	// Open Cart page
	cp.clickViewCart();

	// Create CheckoutPage object
	CheckoutPage checkout = new CheckoutPage(driver);

	// Click Proceed To Checkout
	checkout.clickProceedToCheckout();

	// Get Order Product Name
	String productName = checkout.getOrderProductName();

	// Get Product Quantity
	String quantity = checkout.getOrderProductQuantity();

	// Get Product Price
	String productPrice = checkout.getOrderProductPrice();

	// Get Total Price
	String totalPrice = checkout.getOrderTotalPrice();

	// Print values
	System.out.println("Product Name: " + productName);

	System.out.println("Quantity: " + quantity);

	System.out.println("Product Price: " + productPrice);

	System.out.println("Total Price: " + totalPrice);

	// Verify values displayed
	Assert.assertFalse(productName.isEmpty());

	Assert.assertFalse(quantity.isEmpty());

	Assert.assertFalse(productPrice.isEmpty());

	Assert.assertFalse(totalPrice.isEmpty());

	}
	**/
	@Test
	public void verifyPlaceOrderNavigation() {

		// Create LoginPage object
		LoginPage lp = new LoginPage(driver);
	
		// Click Signup/Login
		lp.clickSignupLogin();
	
		// Enter valid email
		lp.enterEmail("nehaap27004@gmail.com");
	
		// Enter valid password
		lp.enterPassword("Neha@2004");
	
		// Click Login
		lp.clickLoginButton();
	
		// Create ProductsPage object
		ProductsPage pp = new ProductsPage(driver);
	
		// Open Products page
		pp.clickProductsButton();
	
		// Add product to cart
		pp.clickFirstAddToCart();
	
		// Create CartPage object
		CartPage cp = new CartPage(driver);
	
		// Open Cart page
		cp.clickViewCart();
	
		// Create CheckoutPage object
		CheckoutPage checkout = new CheckoutPage(driver);
	
		// Click Proceed To Checkout
		checkout.clickProceedToCheckout();
	
		// Enter order comment
		checkout.enterComment("Please deliver product safely.");
	
		// Click Place Order
		checkout.clickPlaceOrder();
	
		// Get payment page text
		String paymentText = checkout.getPaymentPageText();
	
		// Print payment text
		System.out.println("Payment Page: " + paymentText);
	
		// Verify payment page opened
		Assert.assertTrue(paymentText.contains("Payment"));
	}




}
