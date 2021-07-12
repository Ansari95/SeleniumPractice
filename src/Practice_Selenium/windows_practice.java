package Practice_Selenium;

import java.awt.Window;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows_practice {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\Selenium_pro\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Window.html");
		
	    String firstWindow = driver.getWindowHandle();
		//String currentUrl = driver.getCurrentUrl();
		//System.out.println(currentUrl);
		/*System.out.println(firstWindow); */
		
	    WebElement multiwindow = driver.findElement(By.xpath("(//button[contains(text(),'Open')])[2]"));
	    multiwindow.click();
	    
	    Set<String> winowsize= driver.getWindowHandles();
	    int size = winowsize.size();
		System.out.println(size);
		
		for (String closeall : winowsize) {
			
			if(!closeall.equals(firstWindow)){
				
				driver.switchTo().window(closeall);
				
				driver.close();
				
			}
			
		}
   
	}
}