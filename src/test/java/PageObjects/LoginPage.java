package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public static WebDriver rdriver;
	   public LoginPage(WebDriver ldriver) {
	       
	       rdriver=ldriver;
	       PageFactory.initElements(ldriver, this);
	   }
	   
	   //locate the all webElements
	   
	   @FindBy(id="username")
	   WebElement txtusername;
	   
	   @FindBy(id="password")
	   WebElement txtpassword;
	   
	   @FindBy(id="login")
	   WebElement btnLogin;
	   
	   public void setUsername(String username) {
	       txtusername.sendKeys(username);
	   }
	   public void setPassword(String password) {
	       txtpassword.sendKeys(password);
	   }
	   public void ClickLoginbtn() {
	       btnLogin.click();
	   }


}
