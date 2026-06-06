package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.PaymentPage;
import pages.ProductsPage;

public class PaymentTest extends BaseClass {

	
	@Test
	public void verifySuccessfulOrderPlacement() {
	
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
	
	    // Enter comment
	    checkout.enterComment("Please deliver safely.");
	
	    // Click Place Order
	    checkout.clickPlaceOrder();
	
	    // Create PaymentPage object
	    PaymentPage payment = new PaymentPage(driver);
	
	    // Enter payment details
	    payment.enterNameOnCard("Test User");
	
	    payment.enterCardNumber("4111111111111111");
	
	    payment.enterCVC("123");
	
	    payment.enterExpiryMonth("12");
	
	    payment.enterExpiryYear("2030");
	
	    // Click Pay and Confirm Order
	    payment.clickPayAndConfirmOrder();
	
	    // Get success message
	    String successMessage = payment.getOrderSuccessMessage();
	
	    // Print success message
	    System.out.println("Order Message: " + successMessage);
	
	    // Verify order placed successfully
	    Assert.assertTrue(successMessage.contains("Congratulations"));
	}


}
