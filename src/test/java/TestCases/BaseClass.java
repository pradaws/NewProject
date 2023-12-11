package TestCases;



import java.io.File;
import java.io.IOException;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import utilities.ReadConfig;


public class BaseClass {
	
	
	   public static WebDriver driver;
	   public static Logger log;
	   
	   ReadConfig rc=new ReadConfig();
	   
	   public String url=rc.getApplicationURL();
	   public String username=rc.getUsername();
	   public String password=rc.getPassword();
	   public String Username=rc.getUserusername();
	   public String Password=rc.getPassword();
	   public String co_password=rc.getconfirmpassword();
	   public String full_name=rc.getfullname();
	   public String emailadd=rc.getaddemail();
//	    public ResourceBundle rb;
	   
	   @BeforeClass
	   @Parameters("browser")
	   public void openApplication(String br) {
		   if(br.equals("chrome")) {
		       
		        driver=new ChromeDriver();
		        }
		        else if(br.equals("edge")) {
		            driver=new EdgeDriver();
		        }
		        else if( br.equals("firefox")) {
		            driver=new FirefoxDriver();
		        }
	       
	       driver=new ChromeDriver();
	       //Project home directory (system.getProperty("user.dir")+"\src\test\resources\config.properties"
	       //./config.propertie
//	        rb=ResourceBundle.getBundle("./config.properties");
	       
	       log=Logger.getLogger(this.getClass());
	       PropertyConfigurator.configure("./log4j.properties");
	       driver.get(url);
	       
	   }
	   
	   @AfterClass
	   public void closeApplication() {
	       driver.close();
	   }
	   
	   public void captureScreen(WebDriver driver, String name) throws IOException 
	   {
		   TakesScreenshot ts= (TakesScreenshot) driver;
		   File src= ts.getScreenshotAs(OutputType.FILE);
		   File target=new File("./Screenshots/"+name+".png");
		   FileUtils.copyFile(src, target);
		   log.info("Screenshot is taken");
		}
	   }
	   




