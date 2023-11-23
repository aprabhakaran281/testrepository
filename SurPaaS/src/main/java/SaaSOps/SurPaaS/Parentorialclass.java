package SaaSOps.SurPaaS;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parentorialclass {

		// TODO Auto-generated method stub
		public static WebDriver driver;
		
		public static void main(String[] args) throws InterruptedException, IOException {
			WebDriverManager.chromedriver().setup();
			   driver = new ChromeDriver();
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			   String URL = "https://qaops.smartersaas.com:9000/surpaas";
			   String UserName = "surpaasadmin";
			   String PassWorD = "qaops@1234";
			   String LoginButton="loginForm:loginButton";
			   
			   superrootcustomize.login(URL, UserName, PassWorD, LoginButton);
			   superrootcustomize.configuration();
			   superrootcustomize.customization();
			//Test
			   
	}

}
