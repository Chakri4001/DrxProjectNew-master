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

public class PendingRefillAlerts {
	Webmoduleobjects obj;

	public WebDriver driver;
	
	@Test(priority=44)
	public void RefillAlertApproveaction() throws Exception
	{
		
		obj = PageFactory.initElements(driver, Webmoduleobjects.class);
		obj.Pending_Refill_Alerts.click();
		
		System.out.println("Patient Name:"+obj.Alert_Patient_name.getText());
		System.out.println("Drug Name:"+obj.AlertDrugname.getText());
        System.out.println("Type of Alert:"+obj.AlertDescription.getText());
		
		obj.RefillAlertchk.click();
		obj.ViewAlert.click();
		
    	//obj.send_close.click();
				
		String s1 =obj.RefillSchType.getText();
		String s2 ="[Schedule II Drug]";
		String s3 ="[Schedule III Drug]";
		String s4 ="[Schedule IV Drug]";
		String s5 ="[Schedule V Drug]";
		System.out.println(s1);
		
		if(s1.equalsIgnoreCase(s2))
				{
			
			System.out.println("SCHEDULE II DRUGS CANNOT BE APPROVED");
		}
		else if(s1.equalsIgnoreCase(s3))
		{
			System.out.println("SCHEDULE III DRUGS CANNOT BE APPROVED");
		}
		else if(s1.equalsIgnoreCase(s4))
		{
			System.out.println("SCHEDULE IV DRUGS CANNOT BE APPROVED");
		}
		else if(s1.equalsIgnoreCase(s5))
		{
			System.out.println("SCHEDULE V DRUGS CANNOT BE APPROVED");
		}
		else{
		obj.send_close.click(); 
		Thread.sleep(3000);
		obj.Alert_ApprovedBtn.click();
		Thread.sleep(5000);
		
		obj.send_close.click();
		}
	}
	@Test(priority=45)
	public void RefillAlertdeniedaction() throws Exception
	{
		obj = PageFactory.initElements(driver, Webmoduleobjects.class);
		obj.Pending_Refill_Alerts.click();
		
		System.out.println("Patient Name:"+obj.Alert_Patient_name.getText());
		System.out.println("Drug Name:"+obj.AlertDrugname.getText());
        System.out.println("Type of Alert:"+obj.AlertDescription.getText());
		
		obj.RefillAlertchk.click();
		obj.ViewAlert.click();
		
		//obj.send_close.click(); 
		Thread.sleep(3000);
		
		
		Select DeniedReasonDrpdwn = new Select(obj.Alert_DeniedReason);
		DeniedReasonDrpdwn.selectByIndex(4);
		Thread.sleep(2000);
		
		obj.Alert_DeniedBtn.click();
		
		Thread.sleep(5000);
	obj.send_close.click();
	}
	@Test(priority=46)
	public void RefillAlertReplaceaction() throws Exception
	{
		obj = PageFactory.initElements(driver, Webmoduleobjects.class);
		obj.Pending_Refill_Alerts.click();
		
		System.out.println("Patient Name:"+obj.Alert_Patient_name.getText());
		System.out.println("Drug Name:"+obj.AlertDrugname.getText());
        System.out.println("Type of Alert:"+obj.AlertDescription.getText());
		
		obj.RefillAlertchk.click();
		obj.ViewAlert.click();
				
		String s5 =obj.RefillSchType.getText();
		String s6 ="[Schedule II Drug]";
		String s7 ="[Schedule III Drug]";
		String s8 ="[Schedule IV Drug]";
		String s9 ="[Schedule V Drug]";
		System.out.println(s5);
		
		if(s5.equalsIgnoreCase(s6))
				{
			
			System.out.println("SCHEDULE II DRUGS REPLACE CONTINUE TO THE ID.me");
		}
		else if(s5.equalsIgnoreCase(s7))
		{
			System.out.println("SCHEDULE III DRUGS REPLACE CONTINUE TO THE ID.me");
		}
		else if(s5.equalsIgnoreCase(s8))
		{
			System.out.println("SCHEDULE IV DRUGS REPLACE CONTINUE TO THE ID.me");
		}
		else if(s5.equalsIgnoreCase(s9))
		{
			System.out.println("SCHEDULE V DRUGS REPLACE CONTINUE TO THE ID.me");
		}
		else
		{
		obj.AlertReplaceBtn.click();
		
		Thread.sleep(20000);
		
		obj.confirmPrescription_LinkText.click();
		
		  Thread.sleep(5000);
		  obj.sendtophar_txt.click();
		  obj.close_lnk.click();
		}
	}
	
	 @BeforeTest	
	  public void beforeTest() throws Exception {
	
		driver = Driver.browser("web");
		 UserLogin us = new UserLogin();
		 System.out.println("Pending Refill Alerts");
	      // System.out.println("getDriver"+Driver.getDriver());
	      us.driver = driver;
	      us.doctorLogin("NYNWNEA001", "Pass@123");
	      /*PatientSearch ps = new PatientSearch();
	      ps.driver = driver;
	      ps.patientSearch();*/
    
	  }

	  @AfterTest
	  public void afterTest() {
		// driver.quit();
	  }

}
//NYNWNEA001