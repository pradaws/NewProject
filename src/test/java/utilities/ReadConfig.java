package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


	
	public class ReadConfig {//reading the properties file data (supporting file)

		   Properties pro;
		   
		   public ReadConfig() {
		       //configurate the properties file ./ project home directory
		       File f=new File("C:\\Users\\Dell\\eclipse-workspace\\framework23\\config.properties");
		       
		       try {
		           FileInputStream fis=new FileInputStream(f);//convert file data into reading mode
		           pro=new Properties();
		           pro.load(fis);
		       }catch(Exception e) {
		           System.out.println(e.getMessage());
		       }
		   }
		   
		   //associated methods
		   public String getApplicationURL() {
		       String url=pro.getProperty("baseURl");
		       return url;
		   }
		   public String getUsername() {
		       String username=pro.getProperty("username");
		       return username;
		   }
		   
		   public String getPassword() {
		       String password=pro.getProperty("password");
		       return password;
		   }
		   public String getUserusername() 
			{
				String Username=pro.getProperty("Username");
				return Username;
				
			}
		   public String getpassword() 
			{
				String Password=pro.getProperty("Password");
				return Password;
				
			}
		   
		
			public String getconfirmpassword() 
			{
				String co_password=pro.getProperty("co_password");
				return co_password;
			}
			public String  getfullname() 
			{
				String full_name= pro.getProperty("full_name");
				return full_name;
			}
			
			public String getaddemail() 
			{
				String emailadd=pro.getProperty("emailadd");
				return emailadd;
				
			}
			
			
}
	
