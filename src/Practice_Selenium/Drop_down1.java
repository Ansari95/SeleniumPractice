package Practice_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class Drop_down1 {
	
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		// (//a[@class='wp-categories-link maxheight'])[5]
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\Selenium_pro\\Browsers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		
		WebElement this_isDropDown = driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[5]"));
		this_isDropDown.click();
	
		WebElement using_index = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select select = new Select(using_index);
		select.selectByIndex(3);
		
		WebElement using_text = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select select2 = new Select(using_text);
		select2.selectByVisibleText("Selenium");
		
		WebElement using_value = driver.findElement(By.xpath("//select[@id='dropdown3']"));
		Select select3 = new Select(using_value);
		select3.selectByValue("2");
		
		
		WebElement findDropdownCount = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select select4 = new Select(findDropdownCount);
		List<WebElement> options = select4.getOptions();
		int size = options.size();
		System.out.println(size);
		
		for (int i =0; i<options.size();i++){
			
			
			
		    select4.selectByIndex(i);
		    		
		}
		
		
		WebElement senkey = driver.findElement(By.xpath("//div[@id='contentblock']//div[5]//select"));
		senkey.sendKeys("selenium");
		
		
		
		
		WebElement newselect = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
		Select allselect = new Select(newselect);
		List<WebElement> options2 = allselect.getOptions();
		
		for (int i =0; i<options2.size();i++){
			
			allselect.selectByIndex(i);
			
		}
		
						
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}	

}
