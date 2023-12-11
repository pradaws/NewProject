package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginPage;

public class LoginTest_001 extends BaseClass {
	

@Test
public void logintest() throws InterruptedException, IOException {
   
    LoginPage lp=new LoginPage(driver);
    lp.setUsername(username);
    log.info("username is enetered");
    Thread.sleep(2000);
    lp.setPassword(password);
    log.info("password is enetered");
    Thread.sleep(2000);
    lp.ClickLoginbtn();
    log.info("user is succefully logging inito the account");

String exp_result="Adactin.com - Search Hotel11";
String act_result=driver.getTitle();

if(act_result.equals(exp_result)) {
	
	Assert.assertTrue(true);
	
    log.info("testcase is pass");
}
else {
	
	captureScreen(driver,"logintest" );
	Assert.assertTrue(false);
	
    log.info("testcase is failed");
}


}
}
