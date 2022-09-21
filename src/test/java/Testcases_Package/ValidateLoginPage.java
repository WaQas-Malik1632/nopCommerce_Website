package Testcases_Package;
import org.testng.annotations.Test;
import Pages_Package.BaseClass_Browser;
import Pages_Package.LoginPage;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class ValidateLoginPage extends BaseClass_Browser
{ 
	WebDriver driver;	
	
 //Enter wrong  Email and wrong Password
		@Test(priority=1, description="Login Test#2")
		@Description("Verify test using these credentials: Email:Test@gmail.com  password: @1_)()**^%$#@$msd_MALIK")
		@Epic("EP001")
		@Feature("Feature:001")
		@Story("Login Test")
		@Step("Use basic steps")
		@Severity(SeverityLevel.CRITICAL)
		@Attachment()
public void Testcase_VerifyLoginwith_bothWrongEmailandPassword_SignupNewForAccount()
{
		 LoginPage login=new LoginPage(driver);
		 login.Precondition();
		 login.Login_Testcases("ABCD@gmail.com","Test@____/%!123");
		// Assert.assertTrue(true, "Passed");
		  
		 String actualMsg= "Login was unsuccessful. Please correct the errors and try again.\n"
					+ "No customer account found";
			
		String errorMsg= "Login was unsuccessful. Please correct the errors and try again.\n"
					+ "No customer account found";
		 
	     if(actualMsg.equalsIgnoreCase(errorMsg))
	     {
	    	 login.RedirectLogin_forSignup();
	    	 System.out.println("User is not registered with this Email. Kindly signup for new account");
	     }
	    else
	     {
	    	  System.out.println("User is registered with this email, you need to forgot password");
	     }		
}
 /* //Enter  correct Email and correct Password
	@Test(priority=1, description="Login Test#1")
	@Description("Verify test using these credentials: Email:Test@123  password: @1_)()**^%$#@$msd_MALIK")
	@Epic("EP001")
	@Feature("Feature:001")
	@Story("Login Test")
	@Step("Use basic steps")
	@Severity(SeverityLevel.BLOCKER)
	@Attachment()
	
	public void TestcasetoVerifyLoginwithbothcorrectEmailandPassword()
  {
	  LoginPage login=new LoginPage(driver);
	  login.Precondition();
	  login.Login_Testcases("Test@gmail.com", "Test@123");
	  Assert.assertTrue(true, "Passed");
	 // Assert.assertTrue(facebook_Title.contains("Facebook"));
	  //System.out.println("Page title matched");
	  //System.out.println(facebook_Title);
  }
  //Enter wrong Email and Password correct
	@Test(priority=1, description="Login Test#3")
	@Description("Verify test using these credentials: Email:Test@gmail.com  password: @1_)()**^%$#@$msd_MALIK")
	@Epic("EP001")
	@Feature("Feature:001")
	@Story("Login Test")
	@Step("Use basic steps")
	@Severity(SeverityLevel.TRIVIAL)
	@Attachment()
  public void TestcasetoVerifyLoginwith_WrongEmailAndCorrectPassword()
  {
	  LoginPage login=new LoginPage(driver);
	  login.Precondition();
	  login.Login_Testcases("Test","Test@123");
	  Assert.assertTrue(false, "Failed");
  }
  //Enter Correct Email and wrong Password
	@Test(priority=1, description="Login Test#4")
	@Description("Verify test using these credentials: Email:Test@gmail.com  password: @1_)()**^%$#@$msd_MALIK")
	@Epic("EP001")
	@Feature("Feature:001")
	@Story("Login Test")
	@Step("Use basic steps")
	@Severity(SeverityLevel.MINOR)
	@Attachment()
  public void TestcasetoVerifyLoginwith_CorrectEmailAndWrongPassword()
  {
	  LoginPage login=new LoginPage(driver);
	  login.Precondition();
	  login.Login_Testcases("Test@gmail.com","@1_)()**^%$#@$msd_MALIK");
	  Assert.assertTrue(true, "Passed");
	  System.out.println("Enter these credentials to login");
  }
  */
  @BeforeMethod
  public void beforeMethod()
  {
	  	driver=super.Setup_Browser();
	 //	driver=super.Setup_HeadlessBrowser();
  }
  @AfterMethod
  public void afterMethod()
  {  
	  System.out.print("Current Page Name is: "+driver.getTitle() +"\n" + driver.getCurrentUrl() +"\n");
  }
}
