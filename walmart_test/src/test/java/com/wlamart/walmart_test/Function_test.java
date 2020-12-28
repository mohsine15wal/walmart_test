package com.wlamart.walmart_test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;

public class Function_test extends browsers_codes  {
	// public WebDriver driver;
	
	   
  @Test
  public void f() {
	 
	  home_page hp=new home_page(driver);
	  hp.account();
	  hp.account2();
	  
	  Account_page ap=new Account_page(driver);
	  ap.createAccount();
	  
	  Create_account_page cap=new Create_account_page(driver);
	  cap.firstName();
	  cap.lastName();
	  cap.email();
	  cap.password();
	  cap.createAccountButton();
	  
 
	  
	  
  }
}
