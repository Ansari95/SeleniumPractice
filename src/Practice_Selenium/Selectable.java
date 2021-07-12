package Practice_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\Selenium_pro\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		List<WebElement> selectableList = driver.findElements(By.xpath("//ol[@id='selectable']//li"));
		int size = selectableList.size();
		System.out.println(size);
	
	/*	Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(selectableList.get(0)).click(selectableList.get(1)).
		click(selectableList.get(2)).build().perform();
		*/
		
	/*	Actions action = new Actions(driver);
		action.clickAndHold(selectableList.get(0)).build().perform();
		action.clickAndHold(selectableList.get(1)).build().perform();
		action.clickAndHold(selectableList.get(2)).build().perform(); */
		
		for (int i = 0; i<=2; i++){
			
			Actions action = new Actions(driver);
			action.keyDown(Keys.CONTROL).click(selectableList.get(i)).build().perform();
				}
			}

}
