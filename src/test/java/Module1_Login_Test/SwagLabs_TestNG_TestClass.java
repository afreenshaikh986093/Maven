package Module1_Login_Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import Module1_Login.SwagLabs_Home_Page;
import Module1_Login.SwagLabs_Login_Page;
import Module1_Login.SwagLabs_Logout_Page;

public class SwagLabs_TestNG_TestClass extends BaseClass
{
	   
	    
	    SwagLabs_Login_Page SLP;
	    SwagLabs_Home_Page SHP;
	    SwagLabs_Logout_Page SLOP;
	    int TCID;
		@BeforeClass
		public void OpenBrowser() throws EncryptedDocumentException, IOException
		{
		openbrowser();
		
		SLP=new SwagLabs_Login_Page(driver);
		SHP=new SwagLabs_Home_Page(driver);
		SLOP=new SwagLabs_Logout_Page(driver);
		}
	
		@BeforeMethod
		public void LoginToApp() throws InterruptedException, EncryptedDocumentException, IOException
		{
			SLP.UN(UtilityClass.GetPFTD("UN"));
			SLP.PWD(UtilityClass.GetPFTD("PWD"));
			SLP.Loginbtn();
			Thread.sleep(2000);
		
		}
		@Test()
		public void TCVerifyLogoText() throws InterruptedException, EncryptedDocumentException, IOException
		{
			TCID=101;
			//SHP.Logo(sht.getRow(0).getCell(2).getStringCellValue());
			String ActText=SHP.Logo();
			String ExpText=UtilityClass.GetETD(0, 2);
			Assert.assertEquals(ActText, ExpText,"Fails:Both Result are Diff");
			
			Thread.sleep(2000);
			
		}
		@AfterMethod
		public void LogoutTFromApp(ITestResult itr) throws InterruptedException, IOException
		{
			if(itr.getStatus()==ITestResult.FAILURE)
			{
				UtilityClass.SCFailTC(driver, TCID);
			}
			SHP.OpenMenuBTN();
			Thread.sleep(1000); 
			SLOP.logout();
			Thread.sleep(1000);
		}
		@AfterClass
		public void CloseBrowser()
		{
			driver.quit();
		}
}
