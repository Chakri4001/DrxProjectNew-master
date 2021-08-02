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

public class PendingRefills {
	Webmoduleobjects obj;

	public WebDriver driver;
	
	@Test(priority=41)
	public void RefillApproveaction() throws Exception
	{
		
		obj = PageFactory.initElements(driver, Webmoduleobjects.class);
		obj.Pending_Refills.click();
		
		System.out.println("Patient Name:"+obj.PatientRefillReq.getText());
		System.out.println("Refill count:"+obj.PatientRefillcon.getText());
		Thread.sleep(1000);
		
		obj.selRefillReq.click();
		
		obj.Pharmacy_link.click();
		obj.send_close.click();
		
		obj.prescribed_drug_info.click();
		obj.send_close.click();
		
		String RDD = obj.RefillDrugDescription.getText();
		
		System.out.println(RDD);
		
		String DD2 = "[Schedule II Drug]";
		String DD3 = "[Schedule III Drug]";
		String DD4 = "[Schedule IV Drug]";
		String DD5 = "[Schedule V Drug]";
		
		if(RDD.contains(DD2))
		{
			System.out.println("SCHEDULE II DRUGS CANNOT BE APPROVED");
		}
		else if(RDD.contains(DD3))
		{
			System.out.println("SCHEDULE III DRUGS CANNOT BE APPROVED");
		}
		else if(RDD.contains(DD4))
		{
			System.out.println("SCHEDULE IV DRUGS CANNOT BE APPROVED");
		}
		else if(RDD.contains(DD5))
		{
			System.out.println("SCHEDULE V DRUGS CANNOT BE APPROVED");
		}
		
		else
		{
		Select RefillActdrpdwn = new Select(obj.Refilldrpdwm);
		
		RefillActdrpdwn.selectByIndex(1);
		
		obj.RefillSndButton.click();
		
		obj.send_close.click();
		}
	}
	
	@Test(priority=42)
	public void Refilldeniedaction() throws Exception
	{
        obj.Pending_Refills.click();
		
		System.out.println("Patient Name:"+obj.PatientRefillReq.getText());
		System.out.println("Refill count:"+obj.PatientRefillcon.getText());
		Thread.sleep(1000);
		
		obj.selRefillReq.click();
		
		obj.Pharmacy_link.click();
		obj.send_close.click();
		
		obj.prescribed_drug_info.click();
		obj.send_close.click();
		
		Select RefillActdrpdwn = new Select(obj.Refilldrpdwm);
		String RDD = obj.RefillDrugDescription.getText();
		
		System.out.println(RDD);
		
		String DD2 = "[Schedule II Drug]";
		String DD3 = "[Schedule III Drug]";
		String DD4 = "[Schedule IV Drug]";
		String DD5 = "[Schedule V Drug]";
		
		if(RDD.contains(DD2))
		{
			System.out.println("SCHEDULE II DRUGS");
			
			RefillActdrpdwn.selectByIndex(2);
			
			Select DenialReasondrpdwn = new Select(obj.DenialReason);
			
			DenialReasondrpdwn.selectByIndex(4);
			
			obj.RefillSndButton.click();
			
			obj.send_close.click();
		}
		else if(RDD.contains(DD3))
		{
			System.out.println("SCHEDULE III DRUGS");
			
			RefillActdrpdwn.selectByIndex(2);
			
			Select DenialReasondrpdwn = new Select(obj.DenialReason);
			
			DenialReasondrpdwn.selectByIndex(4);
			
			obj.RefillSndButton.click();
			
			obj.send_close.click();
		}
		else if(RDD.contains(DD4))
		{
			System.out.println("SCHEDULE IV DRUGS");
			
			RefillActdrpdwn.selectByIndex(2);
			
			Select DenialReasondrpdwn = new Select(obj.DenialReason);
			
			DenialReasondrpdwn.selectByIndex(4);
			
			obj.RefillSndButton.click();
			
			obj.send_close.click();
		}
		else if(RDD.contains(DD5))
		{
			System.out.println("SCHEDULE V DRUGS");
			
			RefillActdrpdwn.selectByIndex(2);
			
			Select DenialReasondrpdwn = new Select(obj.DenialReason);
			
			DenialReasondrpdwn.selectByIndex(4);
			
			obj.RefillSndButton.click();
			
			obj.send_close.click();
		}
		else{
			
			RefillActdrpdwn.selectByIndex(3);
			
			Select DenialReasondrpdwn = new Select(obj.DenialReason);
			
			DenialReasondrpdwn.selectByIndex(4);
			
			obj.RefillSndButton.click();
			
			obj.send_close.click();
		}
		
	}
	
	@Test(priority=43)
	public void RefillReplaceaction() throws Exception
	{
		obj.Pending_Refills.click();
		
		System.out.println("Patient Name:"+obj.PatientRefillReq.getText());
		System.out.println("Refill count:"+obj.PatientRefillcon.getText());
		Thread.sleep(1000);
		
		obj.selRefillReq.click();
		
		obj.Pharmacy_link.click();
		obj.send_close.click();
		
		obj.prescribed_drug_info.click();
		obj.send_close.click();
		
		Select RefillActdrpdwn = new Select(obj.Refilldrpdwm);
		
		String RDD = obj.RefillDrugDescription.getText();
		
		System.out.println(RDD);
		
		String DD2 = "[Schedule II Drug]";
		String DD3 = "[Schedule III Drug]";
		String DD4 = "[Schedule IV Drug]";
		String DD5 = "[Schedule V Drug]";
		
		if(RDD.contains(DD2))
		{
			System.out.println("SCHEDULE II DRUGS");
			
			RefillActdrpdwn.selectByIndex(1);
			
			Select DenialReasondrpdwn = new Select(obj.DenialReason);
			
			DenialReasondrpdwn.selectByIndex(4);
			
			obj.RefillSndButton.click();
			
			obj.send_close.click();
		}
		else if(RDD.contains(DD3))
		{
			System.out.println("SCHEDULE III DRUGS");
			
			RefillActdrpdwn.selectByIndex(1);
			
			Select DenialReasondrpdwn = new Select(obj.DenialReason);
			
			DenialReasondrpdwn.selectByIndex(4);
			
			obj.RefillSndButton.click();
			
			obj.send_close.click();
		}
		else if(RDD.contains(DD4))
		{
			System.out.println("SCHEDULE IV DRUGS");
			
			RefillActdrpdwn.selectByIndex(2);
			
			Select DenialReasondrpdwn = new Select(obj.DenialReason);
			
			DenialReasondrpdwn.selectByIndex(4);
			
			obj.RefillSndButton.click();
			
			obj.send_close.click();
		}
		else if(RDD.contains(DD5))
		{
			System.out.println("SCHEDULE V DRUGS");
			
			RefillActdrpdwn.selectByIndex(1);
			
			Select DenialReasondrpdwn = new Select(obj.DenialReason);
			
			DenialReasondrpdwn.selectByIndex(4);
			
			obj.RefillSndButton.click();
			
			obj.send_close.click();
		}
		
		else{
		RefillActdrpdwn.selectByIndex(2);
		
		obj.RefillSndButton.click();
		Thread.sleep(10000);
		
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
		 System.out.println("Pending Refills");
	      // System.out.println("getDriver"+Driver.getDriver());
	      us.driver = driver;
	      us.doctorLogin("NYNAAHA001", "Pass@123");
	      /*PatientSearch ps = new PatientSearch();
	      ps.driver = driver;
	      ps.patientSearch();*/
    
	  }

	  @AfterTest
	  public void afterTest() {
		// driver.quit();
	  }
}
//NYNAAHA001,NYNWNEA001