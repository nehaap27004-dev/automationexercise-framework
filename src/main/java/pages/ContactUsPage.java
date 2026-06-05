package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;

public class ContactUsPage {
	
	WebDriver driver;
	
	// Constructor
	public ContactUsPage(WebDriver driver) {
	
	    this.driver = driver;
	}
	
	// Locators
	
	By contactUsMenu =
	        By.xpath("//a[contains(text(),'Contact us')]");
	
	By getInTouchText =
	        By.xpath("//h2[contains(text(),'Get In Touch')]");
	
	By nameField =
	        By.name("name");
	
	By emailField =
	        By.name("email");
	
	By subjectField =
	        By.name("subject");
	
	By messageField =
	        By.id("message");
	
	By uploadFileButton =
	        By.name("upload_file");
	
	By submitButton =
	        By.name("submit");
	
	By successMessage =
	        By.xpath("//div[@class='status alert alert-success']");
	
	// Methods
	
	public void clickContactUsMenu() {
	
	    driver.findElement(contactUsMenu).click();
	}
	
	public String getGetInTouchText() {
	
	    return driver.findElement(getInTouchText).getText();
	}
	
	public void enterName(String name) {
	
	    driver.findElement(nameField).sendKeys(name);
	}
	
	public void enterEmail(String email) {
	
	    driver.findElement(emailField).sendKeys(email);
	}
	
	public void enterSubject(String subject) {
	
	    driver.findElement(subjectField).sendKeys(subject);
	}
	
	public void enterMessage(String message) {
	
	    driver.findElement(messageField).sendKeys(message);
	}
	
	public void uploadFile(String filePath) {

		
		try {

		    Thread.sleep(3000);

		} catch (InterruptedException e) {

		    e.printStackTrace();
		}

		driver.findElement(uploadFileButton)
		        .sendKeys(filePath);

		try {

		    Thread.sleep(3000);

		} catch (InterruptedException e) {

		    e.printStackTrace();
		}

	}

	public void clickSubmitButton() {

		JavascriptExecutor js =
		        (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);",
		        driver.findElement(submitButton));

		try {

		    Thread.sleep(2000);

		} catch (InterruptedException e) {

		    e.printStackTrace();
		}

		js.executeScript("arguments[0].click();",
		        driver.findElement(submitButton));
	

	}

	
	public String getSuccessMessage() {

	
		WebDriverWait wait =
		        new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions
		        .visibilityOfElementLocated(successMessage));

		return driver.findElement(successMessage).getText();
		

	}

	public void acceptAlert() {

		
		try {

		    WebDriverWait wait =
		            new WebDriverWait(driver, Duration.ofSeconds(5));

		    wait.until(ExpectedConditions.alertIsPresent());

		    Thread.sleep(3000);

		    Alert alert = driver.switchTo().alert();

		    alert.accept();

		} catch (Exception e) {

		    System.out.println("Alert not present. Continuing execution.");
		}
	

	}




}
