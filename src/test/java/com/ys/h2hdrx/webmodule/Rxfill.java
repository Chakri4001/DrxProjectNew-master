package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Rxfill {
	
	Webmoduleobjects obj;

	public WebDriver driver;
	
	
	@Test(priority=47)
	public void Rxfill_view() throws Exception
	{
		obj = PageFactory.initElements(driver, Webmoduleobjects.class);
		obj.Rxfill_link.click();
		
		System.out.println("Patient Name:"+obj.rxfillpatientname.getText());
		System.out.println("Rxfill date:"+obj.Rxfilldate.getText());
		System.out.println("Rxfill status:"+obj.rxfilldrugdesc.getText());
		System.out.println("Rxfill status:"+obj.rxfillstatus.getText());
		Thread.sleep(1000);
		
		obj.selrxfillchk.click();
		obj.view_rxfill_btn.click();
		
		Thread.sleep(2000);
		
		obj.Dispensed_DrugInfo.click();
		obj.send_close.click();
		
		
		Thread.sleep(2000);
		obj.Backbtn.click();
		
		
	}
	 @BeforeTest	
	  public void beforeTest() throws Exception {
	
		driver = Driver.browser("web");
		 UserLogin us = new UserLogin();
		 System.out.println("Rxfill");
	      // System.out.println("getDriver"+Driver.getDriver());
	      us.driver = driver;
	      us.doctorLogin("MIDAWSD001", "Pass@123");
	      /*PatientSearch ps = new PatientSearch();
	      ps.driver = driver;
	      ps.patientSearch();*/
   
	  }

	  @AfterTest
	  public void afterTest() {
		// driver.quit();
	  }

}
