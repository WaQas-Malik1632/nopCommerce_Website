package ListenerPackage;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Pages_Package.BaseClass_Browser;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;

public class AllureListener implements ITestListener
{	
	WebDriver webdriver; 
	private static String getTestMethodName(ITestResult iTestResult)
	{
		return iTestResult.getMethod().getConstructorOrMethod().getName();
	}
	@Override
	public void onTestFailure(ITestResult iTestResult) {
		System.out.println("I am in onTestFailure method " + getTestMethodName(iTestResult) + " failed");
		Object testClass = iTestResult.getInstance();
		WebDriver driver = BaseClass_Browser.getDriver();
		// Allure ScreenShot and SaveTestLog
		if (driver instanceof WebDriver) 
		{
			System.out.println("Screenshot captured for test case:" + getTestMethodName(iTestResult));
			TakeScreenshot(driver);
		}
		saveTextLog(getTestMethodName(iTestResult) + " failed and screenshot taken!");	
	}
	
	@Attachment(value="Screenshot", type="image/png")
	public byte[] TakeScreenshot(WebDriver driver)
	{
		
	//	 Allure.addAttachment("Any__text", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		// Allure.addAttachment("Some Screenshot", (InputStream) ((TakesScreenshot) driver));
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
	
	@Attachment(value = "{0}", type = "text/plain")
	public static String saveTextLog(String message)
	{
		return message; 
	}
	
	@Override
	public void onTestSuccess(ITestResult iTestResult) 
	{
		System.out.println("I am in onTestSuccess method " + getTestMethodName(iTestResult) + " succeed");
	}	
	@Override
	public void onTestSkipped(ITestResult iTestResult)
	{
		System.out.println("I am in onTestSkipped method " + getTestMethodName(iTestResult) + " skipped");
	}
}