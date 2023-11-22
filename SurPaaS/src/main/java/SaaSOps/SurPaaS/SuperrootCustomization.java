package SaaSOps.SurPaaS;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuperrootCustomization {
	public static WebDriver driver;
	public static String name;
	public static String apply;

	//@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			   driver = new ChromeDriver();
			   
			   driver.get("https://qaops.smartersaas.com:9000/surpaas/#");
			   Thread.sleep(2000);
			   driver.findElement(By.id("loginForm:username")).sendKeys("surpaasadmin");
			   driver.findElement(By.id("loginForm:password")).sendKeys("qaops@1234");
			   driver.findElement(By.id("loginForm:loginButton")).click();
			   Thread.sleep(7000);
			   driver.findElement(By.id("collapse-icon")).click();
			   driver.findElement(By.id("menuCLinkForm:adminurltxt")).click();
			   Thread.sleep(6000);
			   driver.findElement(By.id("menuCLinkForm:adminurltxt")).click();
			   Thread.sleep(6000);
			   driver.findElement(By.id("menuCLinkForm:cffsdsdCmdLink")).click();
			   Thread.sleep(4000);
			   driver.findElement(By.id("menuCLinkForm:customizationtxt")).click();
			   Thread.sleep(4000);
			   driver.findElement(By.id("menuCLinkForm:themesetting")).click();
			   Thread.sleep(4000);
			   
			   List<WebElement> themes= driver.findElements(By.xpath("//div[@id='themesettingform:themelistpanel']/table/tbody/tr[2]/td/div[2]/table/tbody/tr[1]/td/span | //div[@id='themesettingform:themelistpanel']/table/tbody/tr[3]/td/div[2]/table/tbody/tr[1]/td/span"));
			for(WebElement theme: themes) {	
				name=theme.getText();
				System.out.println(name);
				
			}
				List<WebElement> applytheme= driver.findElements(By.xpath("//div[@id='themesettingform:themelistpanel']/table/tbody/tr[2]/td/div[1]/span | //div[@id='themesettingform:themelistpanel']/table/tbody/tr[3]/td/div[1]/span"));
				for (WebElement chosentheme : applytheme) {
					apply=chosentheme.getAttribute("id");
					System.out.println(apply);}{
					if (apply.equalsIgnoreCase("themesettingform:appliedpurple")) {
						driver.findElement(By.id("themesettingform:bluethemeapply")).click();
						Thread.sleep(2000);
						driver.findElement(By.id("alertrootAdminPrefMsgForm:alertloginimagebeanDialogButton")).click();
					}else if(apply.contentEquals("themesettingform:appliedblue")) {
						driver.findElement(By.id("themesettingform:darkthemeapply")).click();
						Thread.sleep(2000);
						driver.findElement(By.id("alertrootAdminPrefMsgForm:alertloginimagebeanDialogButton")).click();
					}else if(apply.contentEquals("themesettingform:applieddark")) {
						driver.findElement(By.id("themesettingform:oceanthemeapply")).click();
						Thread.sleep(2000);
						driver.findElement(By.id("alertrootAdminPrefMsgForm:alertloginimagebeanDialogButton")).click();
					}else if (apply.contentEquals("themesettingform:appliedocean")) {
						driver.findElement(By.id("themesettingform:customthemeapply")).click();
						Thread.sleep(2000);
						driver.findElement(By.id("alertrootAdminPrefMsgForm:alertloginimagebeanDialogButton")).click();
						Thread.sleep(4000);
					} else if(apply.contentEquals("themesettingform:appliedcustom")) {
						driver.findElement(By.id("themesettingform:purplethemeapply")).click();
						Thread.sleep(2000);
						driver.findElement(By.id("alertrootAdminPrefMsgForm:alertloginimagebeanDialogButton")).click();
						Thread.sleep(4000);{
					}}
				
//				switch(apply) {
//	            case "bottompurplerectangle":
//	            	Thread.sleep(2000);
//	                driver.findElement(By.id("themesettingform:bluethemeapply")).click();
//	                Thread.sleep(4000);
//	            	driver.findElement(By.id("alertrootAdminPrefMsgForm:alertloginimagebeanDialogButton")).click();
//	            	Thread.sleep(2000);
//	                break;  
//	            case "bottombluerectangle":
//	            	Thread.sleep(2000);
//	            	driver.findElement(By.id("themesettingform:darkthemeapply")).click();
//	            	Thread.sleep(4000);
//	            	driver.findElement(By.id("alertrootAdminPrefMsgForm:alertloginimagebeanDialogButton")).click();
//	            	Thread.sleep(2000);
//	                break;
//	            case "bottomdarkrectangle":
//	            	Thread.sleep(2000);
//	            	driver.findElement(By.id("themesettingform:oceanthemeapply")).click();
//	            	Thread.sleep(4000);
//	            	driver.findElement(By.id("alertrootAdminPrefMsgForm:alertloginimagebeanDialogButton")).click();
//	            	Thread.sleep(2000);
//	                break;
//	            case "bottomrgreyectangle":
//	            	Thread.sleep(2000);
//	            	driver.findElement(By.id("themesettingform:customthemeapply")).click();
//	            	Thread.sleep(4000);
//	            	driver.findElement(By.id("alertrootAdminPrefMsgForm:alertloginimagebeanDialogButton")).click();
//	            	Thread.sleep(2000);
//	                break;
//	            default:
//	            	driver.findElement(By.id("themesettingform:purplethemeapply")).click();
//	            	Thread.sleep(4000);
//	            	driver.findElement(By.id("alertrootAdminPrefMsgForm:alertloginimagebeanDialogButton")).click();
//	            	Thread.sleep(2000);
//	                break;
//	        }}
	
			
//			System.out.println("Enter your prefered theme as same as in case:");
//				Scanner cc = new Scanner(System.in);
//				String name = cc.next();
//				switch(name) {
//		            case "Azul":
//		                driver.findElement(By.id("themesettingform:bluethemeapply")).click();
//		                break;  
//		            case "Dark":
//		            	driver.findElement(By.id("themesettingform:darkthemeapply")).click();
//		                break;
//		            case "Ocean":
//		            	driver.findElement(By.id("themesettingform:oceanthemeapply")).click();
//		                break;
//		            case "Custom":
//		            	driver.findElement(By.id("themesettingform:customthemeapply")).click();
//		                break;
//		            default:
//		                System.out.println("Invalid choice");
//		        }
//				Thread.sleep(4000);
//				driver.findElement(By.id("alertrootAdminPrefMsgForm:alertloginimagebeanDialogButton")).click();
				
				driver.findElement(By.id("menuCLinkForm:adminCloudManagementcmdLink")).click();
				Thread.sleep(4000);
					boolean e= driver.findElement(By.xpath("//tbody[@id='cloudManagementMenuForm:cloudaccountdetailstable_data']")).isDisplayed();
				System.out.println(e);
					if(e==false) {
						System.out.println("need to add cloud account");
					}else {
						System.out.println("Cloud account already added");
						Thread.sleep(4000);}
					String parentWindowHandler = driver.getWindowHandle();
					System.out.println(parentWindowHandler);
				    String subWindowHandler = null;
					   Set<String>      handles  = driver.getWindowHandles(); // get all window handles
					    Iterator<String> iterator = handles.iterator();
					    while (iterator.hasNext()){
					        subWindowHandler = iterator.next();
					        driver.switchTo().window(subWindowHandler); // switch to popup window
                            Thread.sleep(3000);
						driver.findElement(By.id("cloudManagementMenuForm:cloudaccountdetailstable:0:viewandeditid")).click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//span[@toggle='#secretkey1']")).click();
						 driver.findElement(By.id("providerAccForm:tenantid")).click();
						 String TenantID= driver.findElement(By.id("providerAccForm:tenantid")).getAttribute("value");
						 System.out.println(TenantID);
			   String ExpectedTenantID = "1b3d7cc1-48aa-4b5c-92c5-234fdb46c627";
			   Assert.assertEquals(TenantID, ExpectedTenantID);	
						String ClientID = driver.findElement(By.id("providerAccForm:clientid")).getAttribute("value");
						System.out.println(ClientID);
						String ExpectedClientID = "e06bf067-7b6a-47fe-8b06-924467b32346";
						   Assert.assertEquals(ClientID, ExpectedClientID);
						String SubscriptionID = driver.findElement(By.id("providerAccForm:SubscriptionID")).getAttribute("value");
						System.out.println(SubscriptionID);
						String ExpectedSubscriptionID = "51a5f3b4-53ab-446e-b1cf-00d2b29f4032";
						   Assert.assertEquals(SubscriptionID, ExpectedSubscriptionID);
						String endPoint= driver.findElement(By.id("providerAccForm:url")).getAttribute("value");
						System.out.println(endPoint);
						System.out.println("Assertion is True");
						Thread.sleep(6000);
						driver.findElement(By.xpath("//div[@id='cloudproviderDialog']/div/a")).click();
						Thread.sleep(5000);
						driver.findElement(By.id("menuCLinkForm:cffsdsdCmdLink")).click();
						Thread.sleep(4000);	
					    driver.findElement(By.id("menuCLinkForm:adminKBCmdLinktxt")).click();
					    Thread.sleep(4000);
					    List<WebElement> kbheader =driver.findElements(By.xpath("//form[@id='AdvisoryKBMenuForm']/div/ul/li/a/span"));
					    for (WebElement KBHeading : kbheader) {
					    	String KBTypes =KBHeading.getText();
					    	System.out.println(KBTypes);
					    }
					    Thread.sleep(3000);
					    	driver.findElement(By.xpath("//form[@id='AdvisoryKBMenuForm']/div/ul/li[1]")).click();
					    	String librarycount=driver.findElement(By.id("//span[@class='ui-paginator-current']")).getText();   
					    	Assert.assertEquals(librarycount, "Code Libraries 1 - 10 of 49");
					    	System.out.println("passed");
					    	Thread.sleep(2000);
					    	driver.findElement(By.xpath("//form[@id='AdvisoryKBMenuForm']/div/ul/li[2]")).click();
					    	Thread.sleep(6000);
					    	String advisorycount=driver.findElement(By.id("//span[@class='ui-paginator-current']")).getText();   
					    	Assert.assertEquals(advisorycount, "Advisories 1 - 10 of 51");
					    	System.out.println("passed");
					    	Thread.sleep(2000);
					    	driver.findElement(By.xpath("//form[@id='AdvisoryKBMenuForm']/div/ul/li[3]")).click();
					    	Thread.sleep(300);
					    	String workloadlist=driver.findElement(By.id("//span[@class='ui-paginator-current']")).getText();   
					    	Assert.assertEquals(workloadlist, "Workload Scan Lists 1 - 10 of 21");
					    	System.out.println("passed");
					    	Thread.sleep(2000);
					    	
					    	
					    }	
					    
						}
					
					}}
