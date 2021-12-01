package com.ys.h2hdrx.webmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Initiate_epa {

	Webmoduleobjects obj;

	public WebDriver driver;
	
	@Test(priority=52)
	public void BenefitpatientSearch() throws Exception {
		obj = PageFactory.initElements(driver, Webmoduleobjects.class);
		
		obj.search_patientid.sendKeys("BNFT008");
		obj.search_btn.click();
		
		 System.out.println(obj.Patient_ID_txt.getText());
		 System.out.println(obj.Patient_fullname_txt.getText());
		 System.out.println(obj.patient_dobin_table.getText());
		 System.out.println(obj.Patient_address_txt.getText());
		 System.out.println(obj.Patient_tel_txt.getText());
		 		 
		 obj.more_linktext.click();
		 
		 Thread.sleep(2000);
		 
		 obj.close_lnk.click();
		 
		obj.patient_select_link.click();
		
		System.out.println(obj.rxhubPBMUniqueId_txt.getText());
		
		
	
	}

	
	@BeforeTest	
	  public void beforeTest() throws Exception {
	
		driver = Driver.browser("web");
		 UserLogin us = new UserLogin();
		 System.out.println("EPA-initiate");
	      // System.out.println("getDriver"+Driver.getDriver());
	      us.driver = driver;
	      us.doctorLogin("NYDDWDN001", "Pass@123");
	      
	      
	  }
	 @AfterTest
	  public void afterTest() {
		// driver.quit();
	  }
}
