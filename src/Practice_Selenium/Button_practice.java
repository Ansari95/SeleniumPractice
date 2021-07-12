package Practice_Selenium;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_practice {
	
	public static WebDriver driver;

	public static void main(String[] args) {
	
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\Selenium_pro\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		WebElement position = driver.findElement(By.id("position"));
		int x = position.getLocation().getX();
		int Y =position.getLocation().getY();
		
		System.out.println("x point is "+ x + " y point is "+ Y);
		
		WebElement findcolor = driver.findElement(By.id("color"));
		String cssValue = findcolor.getCssValue("background-color");
		System.out.println(cssValue);
		
		WebElement size = driver.findElement(By.id("size"));
	    int height = size.getSize().height;
	    int width = size.getSize().getWidth();
	    System.out.println(height +"and "+ width);
		
		
		
		
	
		
		
		
		
		
		
		

		   
		  
	}

}
