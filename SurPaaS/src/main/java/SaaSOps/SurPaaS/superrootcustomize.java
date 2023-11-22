package SaaSOps.SurPaaS;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class superrootcustomize extends Parentorialclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void login(String URI,String UN, String PWD, String loginButton) {
		driver.get(URI);
        driver.findElement(By.id("loginForm:username")).sendKeys(UN);
        driver.findElement(By.id("loginForm:password")).sendKeys(PWD);
        driver.findElement(By.id(loginButton)).click();
	
	}
	public static void configuration() throws InterruptedException, IOException {
		Properties props=new Properties();
		FileInputStream  fis=new FileInputStream("C:\\Users\\aprabhakaran\\eclipse-workspace\\SurPaaS\\src\\test\\java\\SaaSOps\\SurPaaS\\config.properties");
		props.load(fis);
		driver.findElement(By.id("menuCLinkForm:cffsdsdCmdLink")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("menuCLinkForm:cffsdsdCmdLink")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("menuCLinkForm:channelconfiguration")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("menuCLinkForm:serverurltxt")).click();
		Thread.sleep(9000);
		String SurpaasURL= driver.findElement(By.id("configure:cockpiturl")).getAttribute("value");
		Assert.assertEquals("SurPaaS URL is matched",SurpaasURL,props.getProperty("SurpaasURLs"));
		String CommonURL=driver.findElement(By.id("configure:apiUrl")).getAttribute("value");
		Assert.assertEquals("Common URL is matched",CommonURL,props.getProperty("CommonURLs"));
		String MarketplaceURL=driver.findElement(By.id("configure:marketplaceUrl")).getAttribute("value");
		Assert.assertEquals("Marketplace URL is matched",MarketplaceURL,props.getProperty("MarketplaceURLs"));
		String StorageURL=driver.findElement(By.id("configure:storageUrl")).getAttribute("value");
		Assert.assertEquals("Storage URL is matched",StorageURL,props.getProperty("StorageURLs"));
		String Repo=driver.findElement(By.id("configure:prlocation")).getAttribute("value");
		Assert.assertEquals("Repo URL is matched",Repo,props.getProperty("RepoLocation"));
		String FileServerURL=driver.findElement(By.id("configure:fileServerUrl")).getAttribute("value");
		Assert.assertEquals("Fileserver URL is matched",FileServerURL,props.getProperty("FileServerURLs"));
		String RuleEngineURL=driver.findElement(By.id("configure:RuleEngineURL")).getAttribute("value");
		Assert.assertEquals("RuleEngine URL is matched",RuleEngineURL,props.getProperty("RuleEngineURLs"));
		String BillingURL=driver.findElement(By.id("configure:surpaasbillingurl")).getAttribute("value");
		Assert.assertEquals("Billing URL is matched",BillingURL,props.getProperty("BillingURLs"));
		String ScriptURL=driver.findElement(By.id("configure:scriptprovisioninngtext")).getAttribute("value");
		Assert.assertEquals("Script URL is matched",ScriptURL,props.getProperty("ScriptURLs"));
		String QuantizeURL=driver.findElement(By.id("configure:quantizationurltext")).getAttribute("value");
		Assert.assertEquals("Quantized URL is matched",QuantizeURL,props.getProperty("QuantizeURLs"));
		String QuartzURL=driver.findElement(By.id("configure:cornurltext")).getAttribute("value");
		Assert.assertEquals("Quartz URL is matched",QuartzURL,props.getProperty("QuartzURLs"));
		String WebsocketURL=driver.findElement(By.id("configure:wsserviceurltext")).getAttribute("value");
		Assert.assertEquals("Websocket URL is matched",WebsocketURL,props.getProperty("WebsocketURLs"));
		String ReleaseDocumentURL=driver.findElement(By.id("configure:releaseDocumentText")).getAttribute("value");
		Assert.assertEquals("ReleaseDoc URL is matched",ReleaseDocumentURL,props.getProperty("ReleaseDocumentURLs"));
		String InfraURL=driver.findElement(By.id("configure:infraurltext")).getAttribute("value");
		Assert.assertEquals("Infra URL is matched",InfraURL,props.getProperty("InfraURLs"));
		String AnalyzerURL=driver.findElement(By.id("configure:analyzerurltext")).getAttribute("value");
		Assert.assertEquals("Analyzer URL is matched",AnalyzerURL,props.getProperty("AnalyzerURLs"));
		String CloudURL=driver.findElement(By.id("configure:cloudserviceurltext")).getAttribute("value");
		Assert.assertEquals("Cloud URL is matched",CloudURL,props.getProperty("CloudURLs"));
		String CommonServiceURL=driver.findElement(By.id("configure:commonserviceurltext")).getAttribute("value");
		Assert.assertEquals("CommonService URL is matched",CommonServiceURL,props.getProperty("CommonServiceURLs"));
		String KBURL=driver.findElement(By.id("configure:knowledgebaseserviceurltext")).getAttribute("value");
		Assert.assertEquals("KB URL is matched",KBURL,props.getProperty("KBURLs"));
		String MonitoringURL=driver.findElement(By.id("configure:monitoringurltext")).getAttribute("value");
		Assert.assertEquals("Montoring URL is matched",MonitoringURL,props.getProperty("MonitoringURLs"));
		String ModernizeURL=driver.findElement(By.id("configure:modernizeserviceurltext")).getAttribute("value");
		Assert.assertEquals("Modernize URL is matched",ModernizeURL,props.getProperty("ModernizeURLs"));
		String NotificationURL=driver.findElement(By.id("configure:notificationurltext")).getAttribute("value");
		Assert.assertEquals("Notification URL is matched",NotificationURL,props.getProperty("NotificationURLs"));
		String SaaSAPIRUL=driver.findElement(By.id("configure:saasApiUrl")).getAttribute("value");
		Assert.assertEquals("SaaSapi URL is matched",SaaSAPIRUL,props.getProperty("SaaSAPIRULs"));
		String OpsAPIRUL=driver.findElement(By.id("configure:opsApiUrl")).getAttribute("value");
		Assert.assertEquals("Opsapi URL is matched",OpsAPIRUL,props.getProperty("OpsAPIRULs"));
		String AgentManagerURL=driver.findElement(By.id("configure:agentmanagerurlvalue")).getAttribute("value");
		Assert.assertEquals("AgentManager URL is matched",AgentManagerURL,props.getProperty("AgentManagerURLs"));
		String CDNURL=driver.findElement(By.id("configure:cdnendpointtext")).getAttribute("value");
		Assert.assertEquals("CDN URL is matched",CDNURL,props.getProperty("CDNURLs"));
		String MaaSURL=driver.findElement(By.id("configure:maasapiurll")).getAttribute("value");
		Assert.assertEquals("MaaS URL is matched",MaaSURL,props.getProperty("MaaSURLs"));
		
		driver.findElement(By.id("configure:update")).click();
		Thread.sleep(20000);
		driver.findElement(By.id("alertrootAdminMessageForm:adminCmdButton")).click();
		Thread.sleep(3000);
		System.out.println("Casi Config saved successfully");	
		
		driver.findElement(By.id("menuCLinkForm:mailservertxt")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("mailConfigForm:sendtestemail")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("sendEmailBoxsForm:sendTo")).sendKeys("aprabhakaran@corenttech.com");
		driver.findElement(By.id("sendEmailBoxsForm:sendMailBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("MessageFormss:MessageSubmit")).click();
		System.out.println("Test Mail triggered successfully");		
	}
	public static void customization() throws InterruptedException, IOException {
		Thread.sleep(9000);
		driver.findElement(By.id("menuCLinkForm:cffsdsdCmdLink")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("menuCLinkForm:cffsdsdCmdLink")).click();
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
		Thread.sleep(6000);
		String iframetext = driver
				.findElement(By.xpath(
						"//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']/p"))
				.getText();
		System.out.println(iframetext);

		driver.findElement(
				By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']/p"))
				.sendKeys("Testing");
		Thread.sleep(2000);
		String s=driver
				.findElement(By.xpath(
						"//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']/p"))
				.getText();
		System.out.println(s);
		
		Thread.sleep(10000);
		driver.switchTo().window(parent);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		System.out.println("Back to Default");
		Thread.sleep(3000);
		driver.findElement(By.id("configure:update")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("alertrootAdminPrefMsgFormhh:adminPrefCmdButton")).click();
		driver.findElement(By.id("menuCLinkForm:adminurltxt")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("menuCLinkForm:customizationtxt")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("menuCLinkForm:supportteaminfo")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("supportteamform:supportPhoneNumber")).sendKeys("9080814534");
		driver.findElement(By.id("supportteamform:supportEmailID")).sendKeys("vramkumar@corenttech.com");
		driver.findElement(By.id("supportteamform:salesTeamEmailID")).sendKeys("vramkumar@corenttech.com");
		driver.findElement(By.id("supportteamform:save")).click();
		driver.findElement(By.id("supportTeamInfoForm:supportTeamInfoButton")).click();
		System.out.println("Support Info Updated successfully");
		Thread.sleep(3000);
		driver.findElement(By.id("menuCLinkForm:adminUsercCmdLink")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ZoneAdminListForm:adminAdd")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("zoneAddOREditForm:firstName")).sendKeys("TestAdmin");
		driver.findElement(By.id("zoneAddOREditForm:lastName")).sendKeys("Admin");
		driver.findElement(By.id("zoneAddOREditForm:userName")).sendKeys("chnadmin");
		driver.findElement(By.id("zoneAddOREditForm:email")).sendKeys("aprabhakaran@corenttech.com");
		driver.findElement(By.id("zoneAddOREditForm:roleSelection")).click();
		driver.findElement(By.xpath("//li[@title='Admin   ']")).click();
		driver.findElement(By.id("zoneAddOREditForm:saveuserInfoButtonID")).click();
		Thread.sleep(12000);
		driver.findElement(By.id("productuserProfileErrorForm:errorZoneProfileDialogSubmit")).click();
		Thread.sleep(2000);
		List<WebElement> roleassigned=driver.findElements(By.xpath("//tbody[@id='ZoneAdminListForm:zoneadminlists2_data']/tr/td[6]"));
		for(WebElement ro: roleassigned) {
			String ra= ro.getText();
			System.out.println(ra);}
		
		List<WebElement> userlist=driver.findElements(By.xpath("//tbody[@id='ZoneAdminListForm:zoneadminlists2_data']/tr/td[1]"));
		for(WebElement li2: userlist) {
			String s2= li2.getText();
			System.out.println(s2);	
			if(s2.equalsIgnoreCase("chnadmin")) {
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[@title='Delete']")).click();
				
				//driver.findElement(By.xpath("//a[@title='Delete']")).click();
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				
				driver.findElement(By.id("zoneStatusMessageForm:statusMessageSubmit")).click();
				
			}
			else {
				System.out.println("No such user found");
			}

		}}
		
}
