package Pages;

import genericPages.CommonMethod;

public class DairyPage extends CommonMethod {

	public DairyPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void enterUsername1() throws Exception {
		enterData("userName", "parentUser1");
	}
	
	public void enterUsername2() throws Exception {
		enterData("userName", "parentUser2");
	}
	
	public void enterUsername3() throws Exception {
		enterData("userName", "parentUser3");
	}
	
	public void enterPassword() throws Exception {
		enterData("password", "parentPassword");
	}
	
	public void clickSignIn() throws Exception {
		click("signIn");
	}
	
	public void clickParentUser1() throws Exception {
		click("parentUser1");
	}
	
	public void clickParentUser2() throws Exception {
		click("parentUser2");
	}
	
	public void clickParentUser3() throws Exception {
		click("parentUser3");
	}
	
	public void clickDiaryIcon() throws Exception {
		click("diaryIcon");
	}
	
	
	public void clickDropdown() throws Exception {
		click("dropdown");
	}

	public void clickLogout() throws Exception {
		click("logout");
	}
}
