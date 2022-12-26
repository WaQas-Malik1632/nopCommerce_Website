package Testcases_Package;
import org.testng.annotations.Test;
import Pages_Package.AddReviews;
import Pages_Package.BaseClass_Browser;
import Pages_Package.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Testcases_ProductReviews extends BaseClass_Browser
{
	WebDriver driver;
  @Test
  public void DeskReview() throws InterruptedException
  {
	  AddReviews reviews=new AddReviews(driver);
	  reviews.AddReviewsOfDesktop("DeskTop Review", "Its been Fantastic experience of using Desktop system");
	  
	  System.out.print("Page Title is:"+driver.getTitle()+"/n");
	  String Actual_Url=driver.getCurrentUrl();
	  String Expected_Url="https://demo.nopcommerce.com/productreviews/3";
	  if(Expected_Url==Actual_Url)
	  {
		  Assert.assertTrue(true, "Reviews has been successfully submitted");
	  }
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
  }
}
