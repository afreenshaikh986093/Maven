package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabs_Home_Page 

{
	
		@FindBy(xpath = "//div[@class='app_logo']")private WebElement Logo;                 // private WebElement Logo=driver.findElement(By.xpath(""));
		@FindBy(xpath = "//button[text()='Open Menu']")private WebElement OpenMenuBTN;			  // private WebElement OpenMenuBTN=driver.findElement(By.xpath(""));
		        
		
		public SwagLabs_Home_Page(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		public String Logo()
		{
			String text = Logo.getText();
			return text;
		}
//		public void Logo(String logotext)
//		{
//			String actuallogotext = Logo.getText();
//			
//			if(actuallogotext.equals(logotext))
//			{
//				System.out.println("pass");
//			}
//			else
//			{
//				System.out.println("fail");
//			}
//		}
		public void OpenMenuBTN()
		{
			OpenMenuBTN.click();
			
		}
		
	
}
