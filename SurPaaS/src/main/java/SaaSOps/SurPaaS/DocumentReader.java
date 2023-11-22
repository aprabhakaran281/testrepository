package SaaSOps.SurPaaS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DocumentReader {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://octbober31redmine.surpaassaas.com/surpaas/?user=&subdomain=#");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("loginForm:username")).sendKeys("saivignesh@corenttech.com");
		driver.findElement(By.id("loginForm:password")).sendKeys("Corent@123$#");
		driver.findElement(By.xpath("//button[@id='loginForm:loginButton']//span")).click();
		Thread.sleep(40000);
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
			}

	
		}
	}

	}

