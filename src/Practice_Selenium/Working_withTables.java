package Practice_Selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.collection.ArrayAccess;

public class Working_withTables {
	
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\Selenium_pro\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/table.html");
		
		List<WebElement> numberOfColumns = driver.findElements(By.tagName("th"));
		int size = numberOfColumns.size();
		System.out.println(size);
		
	    List<WebElement> numberOfRows = driver.findElements(By.tagName("tr"));
	    int size2 = numberOfRows.size();
	    System.out.println(size2);
	  
	    WebElement learnInteract = driver.findElement(By.xpath("//td[text()='Learn to interact with Elements']//following::td[1]"));
	    String text = learnInteract.getText();
	    System.out.println(text);
	    
	    //  td[normalisze space()]
	   
	    
	    List<WebElement> leastValue = driver.findElements(By.xpath("//td[2]"));
	    
	    ArrayList<Integer> numberList = new ArrayList<>();
	    
	    for (WebElement integerNumber : leastValue) {
	    	
	    	String text2 = integerNumber.getText().replace("%", "");
	    	
	    	numberList.add(Integer.parseInt(text2));
	    	
	    }
	    
	    System.out.println(numberList);
	    Integer min = Collections.min(numberList);
	    System.out.println(min);
	    
	    String minvalue = String.valueOf(min)+"%";
	    System.out.println(minvalue);
	    
	//    driver.findElement(By.xpath("//td[text()="+"\""+ minvalue + "\""+" ]"+"followong::td[1]");
	    
	    ////td[text()='30%']//following::td[1]
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	 }
}