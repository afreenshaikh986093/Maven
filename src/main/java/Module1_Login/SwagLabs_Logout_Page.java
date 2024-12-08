package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabs_Logout_Page 

{
	
		@FindBy(xpath = "//a[text()='Logout']")private WebElement logout;                 // private WebElement Logo=driver.findElement(By.xpath(""));
		
		
		public SwagLabs_Logout_Page(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void logout()
		{
			logout.click();
		}
		
	
}
