package Practice_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tool_tips {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\Selenium_pro\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/tooltip.html");
		
		
		WebElement toolTips = driver.findElement(By.xpath("//input[@id='age']"));
		String tooltipsname = toolTips.getAttribute("title");
		System.out.println(tooltipsname);
		toolTips.sendKeys("hello");
		String text = toolTips.getText();
		System.out.println(text);
		
		

	}

}
