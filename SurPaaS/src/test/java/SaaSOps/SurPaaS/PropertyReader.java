package SaaSOps.SurPaaS;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertyReader {
//	public static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Properties props=new Properties();
		FileInputStream  fis=new FileInputStream("C:\\Users\\aprabhakaran\\eclipse-workspace\\SurPaaS\\src\\test\\java\\SaaSOps\\SurPaaS\\config.properties");
		props.load(fis);
		WebDriverManager.chromedriver().setup();
		 WebDriver  driver = new ChromeDriver();
		  driver.get(props.getProperty("urla"));
		  Thread.sleep(2000);
		   driver.findElement(By.id("loginForm:username")).sendKeys(props.getProperty("Username"));
		   driver.findElement(By.id("loginForm:password")).sendKeys(props.getProperty("Password"));
		   driver.findElement(By.id("loginForm:loginButton")).click();
		   Thread.sleep(7000);
		   
		   
	}
	

}
