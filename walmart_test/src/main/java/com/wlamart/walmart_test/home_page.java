package com.wlamart.walmart_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home_page {
	
	WebDriver driver;
	
	@FindBy (xpath = "(//*[text()=\"Account\"])[1]")
	  WebElement Account;
	  
	  @FindBy(xpath = "(//*[text()=\"Account\"])[3]")
	  WebElement account2;
	  
	  public  home_page(WebDriver driver){
			
			this.driver=driver;
			
		PageFactory.initElements(driver, this);
	  }
	 
	  public void account() {
		  Account.click();
		  
	  }
	  public void account2() {
		  account2.click();
		  
	  }

}
