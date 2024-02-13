package tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.AttendancePage;
import Pages.LoginPage;
import genericPages.CommonMethod;

public class TenthSTDAttendance extends CommonMethod {

	public TenthSTDAttendance() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	Logger log = LogManager.getLogger(FirstSTDAttendance.class);
	
	@BeforeClass
	public void OpenApplication() throws Exception {
		test=reports.startTest("Open Application");
		initializeBrowser();
		log.info("Opened Browser");
		driver.get("https://schooldemostand-dot-iknotwebpage.el.r.appspot.com/");
		log.info("Opened Web Page");
		LoginPage l=new LoginPage();
		l.enterUserName();
		log.info("Entered UserName");
		l.enterPassword();
		log.info("Entered Password");
		l.clickSignInBtn();
		log.info("Clicked Sign In");
	}

	@Test
	public void tenthStdAttendance() throws Exception {
		AttendancePage at=new AttendancePage();
		Thread.sleep(3000);
		at.clickAttendance();
		log.info("Clicked Atttendance");
		Thread.sleep(1000);
		at.markAttendance();
		log.info("Clicked Mark Attendance");
		Thread.sleep(2000);
		at.click10th();
		log.info("Clicked LKG Class");
		Thread.sleep(2000);
		at.clickTenthStdSection();
		Thread.sleep(2000);
		log.info("Clicked Section LKG");
		at.takeAttendance();
		log.info("Clicked Take Attendance");
		scrollDown();
		at.markAttendanceForStudents();
		log.info("Clicked Mark Attendance");
	}
	
	@AfterClass
	public void logout() {
		driver.quit();
		reports.endTest(test);
		reports.flush();
	}
}

