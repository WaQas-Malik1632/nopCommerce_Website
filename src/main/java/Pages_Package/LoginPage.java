package Pages_Package;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	WebDriver driver;
	
	By click_login=By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
	By txt_email=By.id("Email");
	By txt_password=By.id("Password");
	By btn_login=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Precondition()
	{
		driver.findElement(click_login).click();
	}
	public boolean Login_Testcases(String Email, String Pass)
	{
		WebElement u1=driver.findElement(txt_email);
		u1.sendKeys(Email);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement p1=driver.findElement(txt_password);
		p1.sendKeys(Pass);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //page load
		
		WebElement b1=driver.findElement(btn_login);
		b1.click();
		//String actualMsg=b1.getText();
		//b1.getScreenshotAs(OutputType.FILE);
	
		String actualUrl=driver.getCurrentUrl();
		String expectrdUrl="https://demo.nopcommerce.com/";
		
		boolean cond=false;
		if(actualUrl.equalsIgnoreCase(expectrdUrl))
		{
			cond=true;
		}
		
		else 
			cond=false;
		
		return cond;
	}
	public void RedirectLogin_forSignup()
	{
		 RegisterUser_Page Register=new RegisterUser_Page(driver);
		  Register.Precondition();
		  Register.SignUp_Form("Test", "user", "Test5@gmail.com", "TestComp", "Test@123", "Test@123");
	}
	
}
