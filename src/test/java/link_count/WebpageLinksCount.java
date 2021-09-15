package link_count;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import base_class.DriverSetup;

public class WebpageLinksCount extends DriverSetup {
	@Test
	public void LinksCount() throws InterruptedException {
		
		//Navigate to the Website
		driver.get("https://celtabroad.com");
		driver.manage().window().maximize();
		
		
		
		//Link Count 
		System.out.println(driver.findElement(By.tagName("a")).getSize());
		Thread.sleep(2000);
		
		
		
		//Link count of Footer Area
		WebElement footerArea = driver.findElement(By.className("footer-section"));
		System.out.println(footerArea.findElement(By.tagName("a")).getSize());
		Thread.sleep(2000);
	
		driver.close();
	}
}
