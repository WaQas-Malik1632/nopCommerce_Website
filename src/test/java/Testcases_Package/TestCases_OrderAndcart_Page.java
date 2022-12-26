package Testcases_Package;
import org.testng.annotations.Test;
import Pages_Package.BaseClass_Browser;
import Pages_Package.LoginPage;
import Pages_Package.OrderAndCart_Page;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class TestCases_OrderAndcart_Page extends BaseClass_Browser
{
	WebDriver driver;
  @Test
  public void VerifyplaceOrderofComputer() throws InterruptedException
  {
	  OrderAndCart_Page order=new OrderAndCart_Page(driver);
	 // order.PlaceOrderofDesktop();
	//  order.PlaceOrderofAppleNotebook();
	  order.PlaceOrderofNokiaPhone();
	  
	  order.viewCart();
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  driver=super.Setup_Browser();
	  //driver=super.Setup_HeadlessBrowser();
	  LoginPage login= new LoginPage(driver);
	  login.Precondition();
	  login.Login_Testcases("Test123@gmail.com", "Test@123");
  }

  @AfterMethod
  public void afterMethod()
  {
	  System.out.print("This testcase has been executed");
  }

}
