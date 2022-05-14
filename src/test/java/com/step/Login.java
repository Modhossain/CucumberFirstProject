package com.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.Browser;
import com.utils.Utility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login {
	WebDriver dr;
	
	@Given("^I Open the Browser$")
	public void i_Open_the_Browser() throws InterruptedException {
	   dr= Browser.open_browser();
	   dr.get("https://www.osaconsultingtech.com/");
	   Thread.sleep(3000);
	}
	@And("I click on Forum button")
	public void i_click_on_Forum_button() {
		dr.findElement(By.xpath("//a[text()='Forum']")).click();
	    
	}

	@And("I enter the username")
	public void i_enter_the_username() {
	    dr.findElement(By.id("username")).sendKeys("mhossainchem89@gmail.com");
	}

	@And("I enter the password")
	public void i_enter_the_password() {
		dr.findElement(By.name("password")).sendKeys("Mhossain@7979");
	   
	}

	@When("I click on Login button")
	public void i_click_on_Login_button() throws InterruptedException {
		dr.findElement(By.xpath("//*[@id=\"login_button\"]")).click();
	  Thread.sleep(2000);  
	}

	@Then("I verify the student page title")
	public void i_verify_the_student_page_title() {
	  String expectedvalue="Student page";
	 String actualvalue= dr.getTitle();
	// Utility.verify(expectedvalue, actualvalue);
	}
	@And("I close the browser")
	public void i_close_the_browser() {
	    dr.close();
	}
	
	@Given("I enter the username {string}")
	public void i_enter_the_username(String username) {
		  dr.findElement(By.id("username")).sendKeys(username);
	    
	}

	@Given("I enter the password {string}")
	public void i_enter_the_password(String password) {
		dr.findElement(By.name("password")).sendKeys(password);
	  
	}

}
