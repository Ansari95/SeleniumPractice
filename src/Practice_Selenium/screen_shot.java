package Practice_Selenium;

import java.io.File;
import java.io.IOException;

import javax.xml.transform.Source;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screen_shot {
	
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\Selenium_pro\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/home.html");
		
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		
		File source = screenShot.getScreenshotAs(OutputType.FILE);
		
		File saveFolter = new File("C:\\Users\\ELCOT\\Desktop\\eclipse\\Selenium_pro\\screenshot");
		
		//String[] list = saveFolter.list();
		
		//System.out.println(list);
		
		FileUtils.copyFileToDirectory(source, saveFolter);
		
		
		
		
	

	}

}
