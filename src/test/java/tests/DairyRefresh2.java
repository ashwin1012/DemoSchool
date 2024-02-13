package tests;

import org.testng.annotations.Test;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Pages.DairyPage;
import genericPages.CommonMethod;

public class DairyRefresh2 extends CommonMethod{
	
	public DairyRefresh2() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	Logger log = LogManager.getLogger(DairyRefresh.class);

	@BeforeTest
	public void login() throws Exception {
		test=reports.startTest("Open Application");
		initializeBrowser();
		log.info("Opened Browser");
		driver.get("https://schooldemostand-dot-iknotwebpage.el.r.appspot.com/");
		log.info("Opened Web Page");
		DairyPage dp=new DairyPage();
		dp.enterUsername2();
		log.info("Entered Username");
		dp.enterPassword();
		log.info("Entered Password");
		dp.clickSignIn();
		log.info("Clicked Sign In");
		dp.clickParentUser1();
		log.info("Clicked User1");
		dp.clickDiaryIcon();
		log.info("Clicked Diary Icon");
	}

	@Test(invocationCount = 500)
	public void viewDiary() throws Exception {
		test=reports.startTest("View Diary");
		//scrollDown();
		driver.navigate().refresh();
		log.info("Refreshed Successfully");
	}

	@AfterTest
	public void logout() throws Exception {
		driver.close();
		
	}


}
