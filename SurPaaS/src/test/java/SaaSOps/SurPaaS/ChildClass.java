package SaaSOps.SurPaaS;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChildClass extends ParentClass {
	
		// TODO Auto-generated method stub
	public static void method2(String Iframelocator, String keys) throws InterruptedException { 
		Thread.sleep(30000);
		WebElement iframeElements = driver.findElement(By.tagName(Iframelocator));
		System.out.println(iframeElements);
		driver.switchTo().frame(iframeElements);
		System.out.println("we are switched to Iframe");
		Thread.sleep(3000);
		String iframetext = driver
				.findElement(By.xpath(
						"//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']/p"))
				.getText();
		System.out.println(iframetext);

		driver.findElement(
				By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']/p"))
				.sendKeys(keys);
		Thread.sleep(2000);
		String s=driver
				.findElement(By.xpath(
						"//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']/p"))
				.getText();
		System.out.println(s);
		
		Thread.sleep(10000);

	}
	
	public String method3 (String Iframelocator) throws InterruptedException {
		Thread.sleep(30000);
		//WebElement iframeElements = driver.findElement(By.tagName(Iframelocator));
		//System.out.println(iframeElements);
		//driver.switchTo().frame(iframeElements);
		//System.out.println("we are switched to Iframe");
		//Thread.sleep(3000);
		
		String iframetext = driver
				.findElement(By.xpath(
						"//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']/p/span"))
				.getText();
		driver.switchTo().defaultContent();

		return iframetext;
	}
	

public void documentReader() throws InterruptedException {
	List<WebElement> menus = driver.findElements(By.xpath("//a[@class='ui-commandlink ui-widget']"));
	for (WebElement menu : menus) {
		if (menu.getText().equalsIgnoreCase("Administration")) {
			menu.click();
		}
	}
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
	driver.findElement(By.xpath("//span[@class='breadcrumb']")).click();
	Thread.sleep(3000);
	List<WebElement> icons = driver.findElements(By.xpath(
			"//div[@id='menudocumentlink:j_idt3243']//div[@class='ui-accordion-header ui-helper-reset ui-state-default ui-corner-all']"));
	for (WebElement icon : icons) {
		String name = icon.getText();
		System.out.println ("\033[0;1m" +"Title : " + name + "\033[0m");
		Thread.sleep(3000);
		icon.click();

		Thread.sleep(3000);
		List<WebElement> links = driver.findElements(By.xpath(
				"//div[@id='menudocumentlink:j_idt3243']//div[@class='ui-accordion-content ui-helper-reset ui-widget-content'] | //div[@class='ui-accordion-content ui-helper-reset ui-widget-content ui-helper-hidden']"));
		for (WebElement link : links) {
			String linkss = link.getText();
			System.out.println(linkss);
		}}
	}
public void themesetting() throws InterruptedException {
	
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
		String name = theme.getText();
		System.out.println(name);
	}	
	System.out.println("Enter your prefered theme as same as in case:");
		Scanner cc = new Scanner(System.in);
		String name = cc.next();
		switch(name) {
          case "Azul":
              driver.findElement(By.id("themesettingform:bluethemeapply")).click();
              break;  
          case "Dark":
          	driver.findElement(By.id("themesettingform:darkthemeapply")).click();
              break;
          case "Ocean":
          	driver.findElement(By.id("themesettingform:oceanthemeapply")).click();
              break;
          case "Custom":
          	driver.findElement(By.id("themesettingform:customthemeapply")).click();
              break;
          default:
              System.out.println("Invalid choice");
      }
		Thread.sleep(4000);
		driver.findElement(By.id("alertrootAdminPrefMsgForm:alertloginimagebeanDialogButton")).click();
	}
	
	
}

