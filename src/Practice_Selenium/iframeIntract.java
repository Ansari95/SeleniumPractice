package Practice_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeIntract {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\Selenium_pro\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);

		WebElement clickIframe = driver.findElement(By.xpath("(//button[@id='Click'])"));
		clickIframe.click();
		String text = clickIframe.getText();
		System.out.println(text);
		
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		WebElement nestedFrame = driver.findElement(By.xpath("(//button[@id='Click1'])"));
		nestedFrame.click();
		String text2 = nestedFrame.getText();
		System.out.println(text2);
		
		driver.switchTo().defaultContent();
		
		
		List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
		int size = findElements.size();
		System.out.println(size);
		
	
		
		
		
	
	}	

}
