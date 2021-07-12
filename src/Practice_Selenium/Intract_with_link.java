package Practice_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intract_with_link {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\Selenium_pro\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Link.html");
		
		WebElement goToHOme = driver.findElement(By.partialLinkText("Home Page"));
		goToHOme.click();
		
		driver.navigate().back();
		
		
		WebElement where = driver.findElement(By.partialLinkText("Find where"));
		String attributeName= where.getAttribute("href");
		System.out.println(attributeName);
		
		
		WebElement amIBroken = driver.findElement(By.partialLinkText("Verify am I broken?"));
		amIBroken.click();
		String title = driver.getTitle();
		
		if(title.contains("404")){
			
			System.out.println("link is broken");
		}
		
		else{
			
			System.out.println("link is not broken");
		}
		
		driver.navigate().back();
		
		List<WebElement> findElements = driver.findElements(By.tagName("a"));
		int size = findElements.size();
		System.out.println(size);
		
		}

}
