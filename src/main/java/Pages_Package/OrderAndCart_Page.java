package Pages_Package;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OrderAndCart_Page 
{
	WebDriver driver;
	// =======================All menu items are initialized here=================================================
	By Computers=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
	By Electronics=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
	By Apparel=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']");
	By Digital=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']");
	By Books=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Books']");
	By Jewelry=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']");
	By GiftCards=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']");
	// =======================Computers sub-categories are initialized here===================================	
	By Desktop=By.xpath("//img[@title='Show products in category Desktops']");
	By Notebooks=By.xpath("//img[@title='Show products in category Notebooks']");
	By Softwares=By.xpath("//img[@title='Show products in category Software']");
	
	// =======================Electronics sub-categories are initialized here===================================	
	By Electronics_Camera=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Camera & photo']");
	By Electronics_Mobiles=By.xpath("//img[@title='Show products in category Cell phones']");
	By Electronics_others=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Others']");
	// =======================Apparel sub-categories are initialized here===================================	
	By Apparel_Shoes=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Shoes']");
	By Apparel_Clothes=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Clothing']");
	By Apparel_Accessories=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Accessories']");
	
	// =======================Apple's relevent details===================================
		By Apple_MacBook_Pro_13_inch=By.xpath("//img[@title='Show details for Apple MacBook Pro 13-inch']");
		By AppleAddToCartButton=By.xpath("//button[@id='add-to-cart-button-4']");
		By AppleShoppingCart=By.xpath("//a[normalize-space()='shopping cart']");
	
	// =======================Desktops relevent details===================================
	By Lenovo_IdeaCentrePC=By.xpath("//div[@class='picture']//img[@title='Show details for Lenovo IdeaCentre 600 All-in-One PC']");
	By DesktopAddToCart=By.xpath("//button[@id='add-to-cart-button-3']");
	By DesktopShoppingCart=By.xpath("//a[normalize-space()='shopping cart']");
	
	// =======================Nokia Mobile phones relevent details===================================
		By NokiaCellPhone=By.xpath("//div[@class='picture']//img[@title='Show details for Nokia Lumia 1020']");
		By NokiaCartButton=By.xpath("//button[@id='add-to-cart-button-20']");
		By NokiaShoppingCart=By.xpath("//a[normalize-space()='shopping cart']"); 
		

	public OrderAndCart_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	public void PlaceOrderofDesktop() throws InterruptedException
	{
		Actions action = new Actions(driver);
		WebElement ComputersMenu=driver.findElement(Computers);
		action.moveToElement(ComputersMenu).click().perform();
		
		Thread.sleep(2000);
		WebElement Desktops=driver.findElement(Desktop);
		Desktops.click();
		
		Thread.sleep(2000);
		WebElement DesktopName=driver.findElement(Lenovo_IdeaCentrePC);
		DesktopName.click();
		
		WebElement DesktopCartClick=driver.findElement(DesktopAddToCart);
		DesktopCartClick.click();
		
		WebElement DesktopFinalCart=driver.findElement(DesktopShoppingCart);
		DesktopFinalCart.click();
	}
	public void PlaceOrderofAppleNotebook() throws InterruptedException
	{
		Actions action = new Actions(driver);
		WebElement ComputersMenu=driver.findElement(Computers);
		action.moveToElement(ComputersMenu).click().perform();
		
		Thread.sleep(2000);
		WebElement Notebook=driver.findElement(Notebooks);
		Notebook.click();
		
		Thread.sleep(2000);
		WebElement NotebookName=driver.findElement(Apple_MacBook_Pro_13_inch);
		NotebookName.click();
		
		WebElement NotebookCartClick=driver.findElement(AppleAddToCartButton);
		NotebookCartClick.click();
		
		WebElement NotebookFinalcart=driver.findElement(AppleShoppingCart);
		NotebookFinalcart.click();
	}
	public void PlaceOrderofNokiaPhone() throws InterruptedException
	{
		Actions action = new Actions(driver);
		WebElement mainMenu=driver.findElement(Electronics);
		action.moveToElement(mainMenu).click().perform();
		
		WebElement Electronics=driver.findElement(Electronics_Mobiles);
		Electronics.click();
		
		WebElement MobileName=driver.findElement(NokiaCellPhone);
		MobileName.click();
		
		
		WebElement MobileCartClick=driver.findElement(NokiaCartButton);
		MobileCartClick.click();
		
		Thread.sleep(2000);
		WebElement MobileFinalCart=driver.findElement(NokiaShoppingCart);
		MobileFinalCart.click();
	}
	public void viewCart() throws InterruptedException
	{
		Actions actionCart=new Actions(driver);
		WebElement cart=driver.findElement(By.xpath("//span[@class='cart-label']"));
		
		actionCart.moveToElement(cart);
		
		
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		WebElement GotoCartBtn=driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]"));
		
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		GotoCartBtn.click();
		
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		  js1.executeScript("window.scrollBy(0,600)");
		  
		  
	}
	
}
