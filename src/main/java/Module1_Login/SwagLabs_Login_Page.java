package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabs_Login_Page 

{
	
		@FindBy(xpath = "//input[@name='user-name']")private WebElement UN;                 // private WebElement UN=driver.findElement(By.xpath(""));
		@FindBy(xpath = "//input[@id='password']")private WebElement PWD;				    // private WebElement PWD=driver.findElement(By.xpath(""));
		@FindBy(xpath = "//input[@name='login-button']")private WebElement Loginbtn;        // private WebElement Loginbtn=driver.findElement(By.xpath(""));
		@FindBy(xpath = "//h3[@data-test=\"error\"]")private WebElement ErrorMsg;
		public SwagLabs_Login_Page(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void UN(String username)
		{
			UN.sendKeys(username);
		}
		public void PWD(String password)
		{
			PWD.sendKeys(password);
		}
		public void Loginbtn()
		{
			Loginbtn.click();
		}
		public void ErrorMsg()
		{
			if(ErrorMsg.isDisplayed())
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
		}
	
}
