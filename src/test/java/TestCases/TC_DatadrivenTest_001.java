package TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import io.opentelemetry.api.internal.Utils;
import utilities.XLUtils;

public class TC_DatadrivenTest_001 extends BaseClass 
{
       @Test(dataProvider="ExcelData")
	   public void DataDrivenTest(String usr, String pwd) 
	   {
		   LoginPage lp=new LoginPage(driver);
		   
		   lp.setUsername(usr);
		   
		   lp.setPassword(pwd);
		   
		   lp.ClickLoginbtn();
	   }

	    @DataProvider(name="ExcelData")
	   String [][] getData() throws IOException
	   {
		   String path=System.getProperty("user.dir")+"\\src\\test\\java\\Test_Data\\ExcelData.xlsx";
		   
		   int rownum=XLUtils.getRowcount(path, "Sheet1");
		   
		   int colcount=XLUtils.getCellcount(path, "Sheet1", 1);
		   
		   String logindata[][]=new String [rownum][colcount];
		   
		   for (int i=1; i<rownum;i++)
		   {
			  for (int j=0;j<colcount;j++)
			  {
				  logindata[i-1][j]= XLUtils.getCelldata(path, "Sheet1", i, j);
			  }
		   }
		   
		   return logindata;
	   }
	   
	   
	   
}
