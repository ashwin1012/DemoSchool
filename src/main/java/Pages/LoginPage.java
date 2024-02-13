package Pages;

import genericPages.CommonMethod;

public class LoginPage extends CommonMethod{

	public LoginPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void enterUserName() throws Exception {
		enterData("userName", "userName");
	}
	
	public void enterPassword() throws Exception {
		enterData("password", "password");
	}

	public void clickSignInBtn() throws Exception {
		click("signIn");
	}
}
