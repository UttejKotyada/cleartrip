package com.qa.testscripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.pages.RediffPages;



public class EbayTestCase003 extends EbayTest_Base  {
	
	

RediffPages EbayOR= new RediffPages(driver);
     
	
	
	

	
	@Test(priority=1 , groups="title")
	public void title() {
		
		RediffPages EbayOR= new RediffPages(driver);
 EbayOR.gettitle();

	}
	

	
	
}



