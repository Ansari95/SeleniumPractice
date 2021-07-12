package Practice_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intract_image {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
      System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\Selenium_pro\\Browsers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.leafground.com/pages/Image.html");
	  
	  WebElement image = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
	  String attribute = image.getAttribute("naturalWidth");
	  System.out.println(attribute);
	  
	  if(image.getAttribute("naturalWidth").equals("0")){
		  
		  System.out.println("this is broken image");
		  
	  }
		

	}

}

