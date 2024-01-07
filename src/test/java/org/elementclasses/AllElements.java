package org.elementclasses;

import org.baseclass.UtilClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllElements extends UtilClass {
	
	public AllElements() {
		PageFactory.initElements(driver, this);
	}

	@FindAll({
		@FindBy(xpath="//input[@id='twotabsearchtextbox']"),
		@FindBy(xpath="//*[@placeholder='Search Amazon.in']")
	})
	private WebElement searchBox;
	
	
	@FindAll({
		@FindBy(xpath = "//*[@type='submit']"),
		@FindBy(id="nav-search-submit-button")
	})
	private WebElement searchButton;
	
	@FindBy(xpath = "(//span[contains(text(),'Apple iP')])[5]")
	private WebElement product;
	
	@FindBy(xpath ="//input[@title='Buy Now']")
	private WebElement buyNowButton;

	
	
	public WebElement getSearchBox() {
		return searchBox;
	}


	public WebElement getSearchButton() {
		return searchButton;
	}


	public WebElement getProduct() {
		return product;
	}


	public WebElement getBuyNowButton() {
		return buyNowButton;
	}
	

	
	
	
}
