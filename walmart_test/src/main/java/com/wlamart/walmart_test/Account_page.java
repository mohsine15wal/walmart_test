package com.wlamart.walmart_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account_page {

	WebDriver driver;
	  @FindBy(xpath = "(//*[text()=\"create an account\"])[1]")
	  WebElement createAccount_link;
	  
	  public  Account_page(WebDriver driver){
			
			this.driver=driver;
			
		PageFactory.initElements(driver, this);
	  }
	  
	
	  public void createAccount() {
		  createAccount_link.click();
	  }
}
