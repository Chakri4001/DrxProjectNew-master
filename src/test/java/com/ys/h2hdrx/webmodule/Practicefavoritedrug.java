package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class Practicefavoritedrug{
	Webmoduleobjects obj;

	public WebDriver driver;
	
  @Test(priority=11)
  public void Confirmprescription() throws Exception {
	  obj = PageFactory.initElements(driver, Webmoduleobjects.class);
	  obj.Practice_Favorite_Drugs.click();
	  obj.Fav_drug_chkbx.click();
	  obj.Confirm_Favorite_Drug.click();
	  Thread.sleep(5000);
	  obj.sendtophar_txt.click();
	  obj.close_lnk.click();
  }
  @Test(priority=48)
  public void Search_Fav_Drugs() throws Exception {
	  obj = PageFactory.initElements(driver, Webmoduleobjects.class);
	  obj.Practice_Favorite_Drugs.click();
	  obj.Fav_Drug_Search.sendKeys("Lip");
	  obj.Fav_search.click();
	  /*
	  Thread.sleep(5000);
	  obj.sendtophar_txt.click();
	  obj.close_lnk.click();*/
  }
  @Test(priority=49)
  public void Delete_Fav_Drugs() throws Exception {
	  obj = PageFactory.initElements(driver, Webmoduleobjects.class);
	  obj.Practice_Favorite_Drugs.click();
	  obj.Fav_drug_chkbx.click();
	  obj.Delete_Favorite_Drug.click();
	  /*
	  Thread.sleep(5000);
	  obj.sendtophar_txt.click();
	  obj.close_lnk.click();*/
  }
 
	  @BeforeTest	
	  public void beforeTest() throws Exception {
	
		driver = Driver.browser("web");
		 UserLogin us = new UserLogin();
		 System.out.println("Practice Fav Drugs");
	      // System.out.println("getDriver"+Driver.getDriver());
	      us.driver = driver;
	      us.doctorLogin("MIDAWSD001", "Pass@123");
	      PatientSearch ps = new PatientSearch();
	      ps.driver = driver;
	      ps.patientSearch();
  
	  }

	  @AfterTest
	  public void afterTest() {
		// driver.quit();
	  }

}
