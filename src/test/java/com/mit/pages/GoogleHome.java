package com.mit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHome {
	
	 public WebDriver driver;
	 
	 public GoogleHome(WebDriver driver){
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
				 
	 }
	 
	 		
//WebElement searchBox = driver.findElement(By.name("q"));
	 @FindBy(name="q")
	 WebElement searchBox;
	
		
//		//2. perform action
////		searchBox.sendKeys(string);	
	 
	 public void enterSearch(String string){
		searchBox.sendKeys(string);	
	 }
	 
	 
//	 WebElement searchBtn = driver.findElement(By.name("btnK"));
	 @FindBy(name="btnK")
	 WebElement searchBtn;

	 
//  searchBtn.click();
//		searchBtn.submit();
	 
	 public void clickSearch(){
		 searchBtn.submit();
	 }
	 
	 
	 

}
