package Practice_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class intract_withCheckbox {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\Selenium_pro\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		WebElement java = driver.findElement(By.xpath("//div[@class='example']//div//input[@type='checkbox']"));
		java.click();
		
		WebElement c = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div[4]"));
		c.click();
		
		
		WebElement confirmIsSelect = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div"));
		boolean selected = confirmIsSelect.isSelected();
		System.out.println(selected);
		
		
	if (!confirmIsSelect.isSelected()){
		
		confirmIsSelect.click();
	}
	
	boolean selected2 = confirmIsSelect.isSelected();
	System.out.println(selected2);
		
	}

}
