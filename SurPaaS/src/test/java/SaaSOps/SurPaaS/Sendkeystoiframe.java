package SaaSOps.SurPaaS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sendkeystoiframe {

	 WebDriver driver;

	public Sendkeystoiframe(WebDriver driver) {
		this.driver= driver;
		
	}
	
	public static void iframecontent(By location, String content,WebDriver driver) throws InterruptedException {
	
		WebElement iframeElements = driver.findElement(By.tagName("iframe"));
		System.out.println(iframeElements);
		driver.switchTo().frame(iframeElements);
		System.out.println("we are switched to Iframe");
		Thread.sleep(3000);
        driver.findElement(location).sendKeys(content);

		List<WebElement> lis= driver.findElements(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']/p/span"));
		for (WebElement li : lis) {
		    System.out.println("1st part: "+li.getText());
		    }
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']/p/span")).clear();
		
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']/p/span")).sendKeys("Testing");
		Thread.sleep(4000);
		//driver.switchTo().window(parent);
		driver.switchTo().defaultContent();
		
	}
}
  