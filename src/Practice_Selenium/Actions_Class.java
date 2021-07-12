package Practice_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class {
	
	static WebDriver driver;
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\Selenium_pro\\Browsers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Actions ac = new Actions(driver);

	}

}
