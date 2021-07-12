package Practice_Selenium;

import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download_file {

	public static WebDriver driver;
	public static void main(String[] args) {
		
      
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\Selenium_pro\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement Pdfexcel= driver.findElement(By.linkText("Download Excel"));
		Pdfexcel.click();
		
		File file = new File("D:\testleaf.xlsx");
		
		File[] Totalfiles = file.listFiles();
		
		for (File file2 : Totalfiles) {
			
			if(file2.equals("testleaf")){
				
				System.out.println("suceesfully download file "+ file2);
				break;
			}
			
		}
		
	
	
	
	
	
	
		
				
	}

}
