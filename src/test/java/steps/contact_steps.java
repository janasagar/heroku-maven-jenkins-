package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class contact_steps {
	WebDriver driver;
	@Given("User is vist Sparsh Hospital")
	public void user_is_vist_sparsh_hospital() {
		driver = new ChromeDriver();
		driver.get("https://www.sparshhospital.com/");
		driver.manage().window().maximize();
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("User Navigate to Contact Us Page")
	public void user_navigate_to_contact_us_page() {
	    driver.findElement(By.linkText("Contact Us")).click();
	    
	}
	
	@When("User enters {string}, {string}, {string}, {string}, {string}")
	public void user_enters(String firstname, String lastname, String ph_num, String email, String message) {
	    driver.findElement(By.id("contact_first_name")).sendKeys(firstname);
	    driver.findElement(By.id("contact_last_name")).sendKeys(lastname);
	    driver.findElement(By.id("contact_phone")).sendKeys(ph_num);
	    driver.findElement(By.id("contact_email")).sendKeys(email);
	    driver.findElement(By.id("contact_message")).sendKeys(message);
	}

	@When("User Select Enquiry, Select Hospital")
	public void user_select_enquiry_select_hospital() {
	    Select drp1 = new Select(driver.findElement(By.id("contact_hospital")));
	    drp1.selectByVisibleText("SPARSH Hospital, Hassan");
	    
	    Select drp2 = new Select(driver.findElement(By.id("contact_enquiry_type")));
	    drp2.selectByVisibleText("General Enquiry");
	    
	    
	    
	    
	    
	}
	@When("User Click send button")
	public void User_Click_send_button() {
		driver.findElement(By.id("contact_submit")).click();
	}

//	@And("User enters FirstName, LastName, Phone Number, Email, Enquiry, Select Hospital, Message And click on the send button")
//	public void user_enters_first_name_last_name_phone_number_email_enquiry_select_hospital_message_and_click_on_the_send_button() {
//	    driver.findElement(By.id("contact_first_name")).sendKeys("Sagar");
//	    driver.findElement(By.id("contact_last_name")).sendKeys("Jana");
//	    driver.findElement(By.id("contact_phone")).sendKeys("7098510151");
//	    driver.findElement(By.id("contact_email")).sendKeys("sagar@gmail.com");
//	    
//	    Select drp1 = new Select(driver.findElement(By.id("contact_hospital")));
//	    drp1.selectByVisibleText("SPARSH Hospital, Hassan");
//	    
//	    Select drp2 = new Select(driver.findElement(By.id("contact_enquiry_type")));
//	    drp2.selectByVisibleText("General Enquiry");
//	    
//	    driver.findElement(By.id("contact_message")).sendKeys("Hello World!");
//	    
//	    driver.findElement(By.id("contact_submit")).click();
//	}

	@Then("Message displayed Thank You Our support representative will be in touch with you as soon as possible")
	public void message_displayed_thank_you_our_support_representative_will_be_in_touch_with_you_as_soon_as_possible() {
	    String str = driver.getTitle();
	    
	    Assert.assertEquals("Thank You - SPARSH Hospital",str);
	    
	    driver.quit();
	    
	}

}
