package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_Page {
	
	public static WebDriver xdriver;
	
	public  Registration_Page(WebDriver ldriver)
	{
		xdriver=ldriver;
		PageFactory.initElements( ldriver, this);
		
	}		
		
		@FindBy(linkText="New User Register Here")
		WebElement Newregisterationlink;
		
		@FindBy(id= "username")
		WebElement Username;
		
		@FindBy(id="password")
		WebElement Password;
		
		@FindBy(id="re_password")
		WebElement co_password;
		
		@FindBy(id="full_name")
		WebElement full_name;
		

		@FindBy(id="email_add")
		WebElement emailadd;
		
		@FindBy(id="tnc_box")
		WebElement checkbox;
		
		@FindBy(id="Submit")
		WebElement registerbutton;
		
		public void ClickRegisterLink() {
			
			 Newregisterationlink.click();
		}
		
		public void setUserusername(String usr) 
		{
			Username.sendKeys(usr);
			
		}
		
		public void setpassword(String pwd) 
		{
			Password.sendKeys(pwd);
			
		}
		public void setconfirmpassword(String con_pwd) 
		{
			co_password.sendKeys(con_pwd);
			
		}
		public void fullname(String fname) 
		{
			full_name.sendKeys(fname);
			
		}
		
		public void addemail(String email) 
		{
			emailadd.sendKeys(email);
			
		}
		
		public void clickcheckbox() 
		{
			checkbox.click();
			
		}
		
		public void clickRegisterButton() 
		{
			checkbox.click();
			
		}
		
	}


