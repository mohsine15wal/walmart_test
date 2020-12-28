package com.wlamart.walmart_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_account_page {
	WebDriver driver;
	
	  @FindBy(id = "first-name-su")
	  WebElement First_name;
	  
	  @FindBy(id = "last-name-su")
	  WebElement Last_name;
	  
	  @FindBy(id = "email-su")
	  WebElement email;
	  
	  @FindBy(id = "password-su")
	  WebElement password;
	  
	  @FindBy(xpath = "(//*[text()=\"Create account\"])[2]")
	  WebElement create_account_button;
	  
	  public  Create_account_page(WebDriver driver){
			
			this.driver=driver;
			
		PageFactory.initElements(driver, this);
			  }
	  public void firstName() {
		  First_name.sendKeys("Mike");
	  }
	   public void lastName() {
		   Last_name.sendKeys("Tyson");
	   }
	   public void email() {
		   
		   email.sendKeys("mike@gmail.com");
	   }
	   
	   public void password() {
		   password.sendKeys("Nothing");
	   }
	  public void createAccountButton() {
		  create_account_button.click();
	  }
}
