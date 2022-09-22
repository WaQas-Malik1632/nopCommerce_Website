package Pages_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OrderAndCart_Page 
{
	
	WebDriver driver;
	By Menu_Computer=By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a");
	By SubMenu_Computer_Notebook=By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[2]/div/div/a/img");
	By Item_SubMenu_Computer=By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/a/img");
	
	public OrderAndCart_Page(WebDriver driver)
	{
		 driver=this.driver;
	}
	public void orderPage()
	{
		WebElement Menu=driver.findElement(Menu_Computer);
		
		Actions actions=new Actions(driver);
		actions.moveToElement(Menu).perform();
		
		WebElement SubMenu=driver.findElement(SubMenu_Computer_Notebook);
		actions.moveToElement(SubMenu).perform();
		actions.click();
		
		WebElement Item_SubMenu=driver.findElement(Item_SubMenu_Computer);
		actions.moveToElement(Item_SubMenu);
		
		actions.click().build().perform();
		
	}
}
