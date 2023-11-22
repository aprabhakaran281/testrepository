package SaaSOps.SurPaaS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentClass {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// TODO Auto-generated method stub
   String URL = "https://qaops.smartersaas.com:9000/surpaas";
   String Username = "surpaasadmin";
   String password = "qaops@1234";
   String locator ="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']/p/span";
   String keys="Testing";
   String Iframelocator="iframe";
   driver.get(URL);
   Thread.sleep(7000);
driver.findElement(By.id("loginForm:username")).sendKeys("surpaasadmin");
driver.findElement(By.id("loginForm:password")).sendKeys("qaops@1234");
driver.findElement(By.id("loginForm:loginButton")).click();
Thread.sleep(7000);
driver.findElement(By.id("collapse-icon")).click();
driver.findElement(By.id("menuCLinkForm:adminurltxt")).click();
Thread.sleep(4000);
ChildClass p= new ChildClass();
p.method2(Iframelocator, keys);
String text = p.method3(Iframelocator);
System.out.println(text);
driver.switchTo().defaultContent();
p.documentReader();
p.themesetting();


   //method2(driver, "https://qaops.smartersaas.com:9000/surpaas/#", "surpaasadmin","qaops@1234");
   
	}

    //driver.findElement

//	List<WebElement> lis= driver.findElements(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']/p/span"));
//	for (WebElement li : lis) {
//	    System.out.println("1st part: "+li.getText());
//	    }
//	driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']/p/span")).clear();
//	
//	driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']/p/span")).sendKeys("Testing");
//	Thread.sleep(4000);
//	driver.switchTo().window(parent);
//	driver.switchTo().defaultContent();

	
	
}

