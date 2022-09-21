package Testcases_Package;
import org.testng.annotations.Test;
import Pages_Package.BaseClass_Browser;
import Pages_Package.RegisterUser_Page;
import org.testng.annotations.BeforeMethod;
import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestCase_RegisterUser extends BaseClass_Browser
{
	public WebDriver webdriver=null;
  @Test
  public void Testcases_ToRegisterUserSuccessfully() throws IOException
  {
	  RegisterUser_Page Register=new RegisterUser_Page(driver);
	  Register.Precondition();
	  Register.SignUp_Form("Test", "user", "Test3@gmail.com", "TestComp", "Test@123", "Test@123");
	  
	  String actual_url=driver.getCurrentUrl();
	  String expected_url="https://demo.nopcommerce.com/registerresu";
	  Assert.assertEquals(actual_url, expected_url);
	  if(actual_url==expected_url)
	  {
		  driver=super.TakeScreenshot(driver, "Imagescreenshot");
	  }
	//  Assert.assertEquals(true, driver.getTitle(), "nopcommerce");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  driver=super.Setup_Browser();
	 //driver=super.Setup_HeadlessBrowser();	
  }
  @AfterMethod
  public void afterMethod()
  {
	  System.out.print("Current Page Name is: "+driver.getTitle() +"\n" + driver.getCurrentUrl() +"\n" );
  }
}