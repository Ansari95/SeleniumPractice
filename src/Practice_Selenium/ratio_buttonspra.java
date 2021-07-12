package Practice_Selenium;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ratio_buttonspra {

	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\Selenium_pro\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		
	
		
		
		
		List<WebElement> checkboxes = driver.findElements(By.name("webform"));
		
		int size = checkboxes.size();
		System.out.println(size);
	
		for (int i = 0 ; i<checkboxes.size();i++){
			
			checkboxes.get(i).click();
			checkboxes.get(i).click();
				
			
			}
		

		WebElement option1 = driver.findElement(By.xpath("//div//input[@type='radio'][@value='Option 1']"));
		option1.click();
		
		WebElement option2 = driver.findElement(By.xpath("//div//input[@type='radio'][@value='Option 2']"));
		
		if (option1.isSelected()){
			
			option2.click();
		}
		
		
		
		}
		

		
	

}
