package Practice_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_practice {
	
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\Selenium_pro\\Browsers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement alert_box = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		alert_box.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		WebElement confirm_alert = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		confirm_alert.click();
		Alert confirm = driver.switchTo().alert();
		confirm.dismiss();
		
		WebElement promptbox = driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']//button[@onclick='confirmPrompt()']"));
		promptbox.click();
		
		Alert pro = driver.switchTo().alert();
		pro.sendKeys("haii");
		Thread.sleep(3000);
		pro.accept();
				
		
		
		
		
	}
	
	

}
