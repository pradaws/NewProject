package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjects.Registration_Page;

public class TC_Register_002 extends BaseClass{
	
	@Test
	public void RegisterTest() throws InterruptedException 
	{
		Registration_Page rp=new Registration_Page(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		rp.ClickRegisterLink();
		log.info("Link completed");
		rp.setUserusername(Username);
		log.info("Username entered in register page");
		rp.setpassword(Password);
		log.info("Password entered in register page");
		rp.setconfirmpassword(co_password);
		log.info("Confirm password entered in register page");
		rp.fullname(full_name);
		log.info("Full name entered in register page");
		rp.addemail(emailadd);
		log.info("email-id entered in register page");
		
		Thread.sleep(2000);
		
		rp.clickcheckbox();
		rp.clickRegisterButton();
		
		
		
		
	}
	

}
