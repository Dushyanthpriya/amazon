package org.executionclasses;

import org.baseclass.UtilClass;
import org.elementclasses.AllElements;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Execution extends UtilClass {
	
	public static AllElements a;
	
	@BeforeClass
	private void launchBrowser() {
		launchEdgeBrowser();
		windowMaximize();
	}
	
	@Parameters({"url","productname"})
	@Test
	private void purchaseProduct(String url,String productName) {
		applyWaits();
		passUrl(url);
		a=new AllElements();
		
		enterText(a.getSearchBox(), productName);
		elementClick(a.getSearchButton());
		elementClick(a.getProduct());
		switchIntoNextWindow();
		elementClick(a.getBuyNowButton());
	}
}
