package LibraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	
	public static String GetETD(int rowindex,int colindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file= new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Maven-Selenium\\TestData\\Data.xlsx");
		Sheet sht = WorkbookFactory.create(file).getSheet("DDF");
		String value = sht.getRow(rowindex).getCell(colindex).getStringCellValue();
		return value;
	}
	
	public static void SCFailTC(WebDriver driver,int TCID) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\hp\\eclipse-workspace\\Maven-Selenium\\Screenshots\\TCID"+TCID+".jpg");
		FileHandler.copy(src, des);
	}
	public static String GetPFTD(String key) throws IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Selenium\\PropertyFile.properties");
		
		Properties p=new Properties();
		p.load(file);
		
		String value = p.getProperty(key);
		
		return value;
	}

	
}
