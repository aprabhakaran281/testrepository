package SaaSOps.SurPaaS;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasic {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
System.setProperty("webdrier.chrome.driver", "");
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://qaops.smartersaas.com:9000/");
driver.manage().window().maximize();
Thread.sleep(3000);

driver.findElement(By.id("loginForm:username")).sendKeys("surpaasadmin");
driver.findElement(By.id("loginForm:password")).sendKeys("qaops@1234");
driver.findElement(By.id("loginForm:loginButton")).click();
Thread.sleep(7000);
driver.findElement(By.id("collapse-icon")).click();
driver.findElement(By.id("menuCLinkForm:adminurltxt")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
List <WebElement> list =driver.findElements(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-e']/ancestor::div[1]"));

for (WebElement li : list) {	
	String documentlist = li.getText();
	System.out.println(documentlist);

}
driver.findElement(By.id("menuCLinkForm:customizationAction")).click();
driver.findElement(By.id("menuCLinkForm:rootSetting")).click();

String parent = driver.getWindowHandle();
System.out.println(parent);

Set<String> child = driver.getWindowHandles();
System.out.println(child);
driver.findElement(By.id("configure:surpasscreenname")).sendKeys("SurPaaS Console Testing");
driver.findElement(By.id("configure:iconTooltip")).sendKeys("Powered by Corent Technology Inc Testing");
driver.findElement(By.id("configure:supportURL")).sendKeys("http://www.corenttech.com/support.htmltesting");
driver.findElement(By.id("configure:webURL")).sendKeys("http://www.corenttech.comtesting");
Thread.sleep(2000);
driver.findElements(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']/p/span")).clear();
WebElement iframeElements = driver.findElement(By.tagName("iframe"));
System.out.println(iframeElements);
driver.switchTo().frame(iframeElements);
System.out.println("we are switched to Iframe");
Thread.sleep(3000);
List<WebElement> lis= driver.findElements(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']/p/span"));
for (WebElement li : lis) {
    System.out.println("1st part: "+li.getText());
    }
driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']/p/span")).clear();
driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']/p/span")).sendKeys("Testing");
Thread.sleep(4000);
driver.switchTo().window(parent);
driver.switchTo().defaultContent();
Thread.sleep(3000);
System.out.println("Back to Default");
driver.findElement(By.id("configure:update")).click();
driver.findElement(By.id("alertrootAdminPrefMsgFormhh:adminPrefCmdButton")).click();
Thread.sleep(2000);
driver.findElement(By.id("headerform:iconProfileLink")).click();
Thread.sleep(2000);
driver.findElement(By.id("logoutButton")).click();
String Summarycontent =driver.findElement(By.id("summarycontant")).getText();
if(Summarycontent.equalsIgnoreCase("Testing")) {
	System.out.println("Change has been made successfully");}
	else {
		System.out.println("Change is not happened");	
	}
driver.findElement(By.id("loginForm:username")).sendKeys("surpaasadmin");
driver.findElement(By.id("loginForm:password")).sendKeys("qaops@1234");
driver.findElement(By.id("loginForm:loginButton")).click();
Thread.sleep(7000);
driver.findElement(By.id("collapse-icon")).click();
driver.findElement(By.id("menuCLinkForm:adminurltxt")).click();
Thread.sleep(4000);
driver.findElement(By.id("menuCLinkForm:customizationAction")).click();
driver.findElement(By.id("menuCLinkForm:supportteaminfo")).click();
Thread.sleep(2000);
driver.findElement(By.id("supportteamform:supportPhoneNumber")).sendKeys("9080814534");
driver.findElement(By.id("supportteamform:supportEmailID")).sendKeys("vramkumar@corenttech.com");
driver.findElement(By.id("supportteamform:salesTeamEmailID")).sendKeys("vramkumar@corenttech.com");
driver.findElement(By.id("supportteamform:reset")).click();
driver.findElement(By.id("supportTeamInfoForm:supportTeamInfoButton")).click();
System.out.println("Support Info Updated successfully");
driver.findElement(By.id("menuCLinkForm:adminUsercCmdLink")).click();
driver.findElement(By.id("ZoneAdminListForm:adminAdd")).click();
driver.findElement(By.id("zoneAddOREditForm:firstName")).sendKeys("TestAdmin");
driver.findElement(By.id("zoneAddOREditForm:lastName")).sendKeys("Admin");
driver.findElement(By.id("zoneAddOREditForm:userName")).sendKeys("chnadmin");
driver.findElement(By.id("zoneAddOREditForm:email")).sendKeys("aprabhakaran@corenttech.com");
Select role = new Select(driver.findElement(By.id("zoneAddOREditForm:roleSelection_input")));
role.selectByVisibleText("Admin");

List<WebElement> roleassigned=driver.findElements(By.xpath("//tbody[@id=\"ZoneAdminListForm:zoneadminlists2_data\"]/tr/td[6]"));
for(WebElement ro: roleassigned) {
	String ra= ro.getText();
	
	if(ra.contentEquals("Admin")) {
		
		System.out.println("The user has admin rights");
	}
	else {
			System.out.println("The user is readonly");
	
}
List<WebElement> userlist=driver.findElements(By.xpath("//tbody[@id='ZoneAdminListForm:zoneadminlists2_data']/tr/td[1]"));
for(WebElement li2: userlist) {
	String s2= li2.getText();
	
	if(s2.equalsIgnoreCase("chnadmin")) {
		
		driver.findElement(By.id("//a[@title='Delete']")).click();
		driver.findElement(By.id("//button[@type='submit']")).click();
		
		driver.findElement(By.id("zoneStatusMessageForm:statusMessageSubmit")).click();
		
	}
	else {
		System.out.println("No such user found");
	}
	
}

	
	
}
}

	
}






