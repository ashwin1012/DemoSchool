package tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.DairyPage;
import genericPages.CommonMethod;

public class ParentDairy3 extends CommonMethod{

public ParentDairy3() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

Logger log = LogManager.getLogger(ParentDairy1.class);
	
	@BeforeClass
	public void login() throws Exception {
		test=reports.startTest("Open Application");
		initializeBrowser();
		log.info("Opened Browser");
		driver.get("https://schooldemostand-dot-iknotwebpage.el.r.appspot.com/");
		log.info("Opened Web Page");
		
	}
	
	@Test (invocationCount = 1000)
	public void viewDiary() throws Exception {
		test=reports.startTest("View Diary");
		DairyPage dp=new DairyPage();
		dp.enterUsername3();
		log.info("Entered Username");
		dp.enterPassword();
		log.info("Entered Password");
		dp.clickSignIn();
		log.info("Clicked Sign In");
		dp.clickParentUser1();
		log.info("Clicked User3");
		dp.clickDiaryIcon();
		log.info("Clicked Diary Icon");
		scrollDown();
		dp.clickDropdown();
		log.info("Clicked DropDown");
		dp.clickLogout();
		log.info("Clicked Logout");
	}
	
	@AfterMethod
	public void logout() throws Exception {
		driver.close();
	}
}
