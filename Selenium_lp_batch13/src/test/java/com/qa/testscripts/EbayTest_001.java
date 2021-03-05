package com.qa.testscripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.RediffPages;

public class EbayTest_001 extends EbayTest_Base {

	
	
	@Test(priority=1, groups="registration" ,dataProvider="getData")
	   public void register(String first,String last,String email,String password) {
			
			RediffPages EbayOR= new RediffPages(driver);
	   EbayOR.setsigninclick();
	   
	   
	   EbayOR.setregisterclick();
	   
	   
	
	   EbayOR.setfirstnameInput(first);
	   
	   

	   EbayOR.setlastnameInput(last);
	   
	   
	  
	   EbayOR.setemailInput(email);
	   

	   EbayOR.setpassswordInput(password);
	   
	   EbayOR.clickcheckboxInput();
	   
	   EbayOR.clicksubmitInput();
	   }
	   
	  @DataProvider
	  public Object[][] getData(){
		  Object[][] data=new Object [2][4];
		  data[0][0]="Kim";
		  data[1][0]="Roger";
		  data[0][1]="Smith";
		  data[1][1]="Hill";
		  data[0][2]="Kim@gmail.com";
		  data[1][2]="Roger@test.com";
		  data[0][3]="mercury";
		  data[1][3]="fireheart";
		  return data;
	  }
	}

