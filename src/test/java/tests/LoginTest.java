package tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LoginPage;
import genericPages.CommonMethod;

public class LoginTest extends CommonMethod {
	
	public LoginTest() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	Logger log = LogManager.getLogger(LoginTest.class);

	@BeforeClass
	public void OpenApplication() throws Exception {
		initializeBrowser();
		log.info("Opened Browser");
		driver.get("https://schooldemostand-dot-iknotwebpage.el.r.appspot.com/");
		log.info("Opened Web Page");
	}
	
	@Test
	public void login() throws Exception {
		test=reports.startTest("Login Test");
		LoginPage l=new LoginPage();
		l.enterUserName();
		log.info("Entered UserName");
		l.enterPassword();
		log.info("Entered Password");
		l.clickSignInBtn();
		log.info("Clicked Sign In");
	}
	
	
	@AfterClass
	public void logout() {
		driver.quit();
		reports.endTest(test);
		reports.flush();
	}

}
