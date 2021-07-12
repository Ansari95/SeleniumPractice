package Practice_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ratio_button {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\Selenium.org\\exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		WebElement yesOrNo = driver.findElement(By.xpath("//div[@id='first']//label[@for='yes']"));
		yesOrNo.click();
		boolean selected = yesOrNo.isEnabled();
		System.out.println(selected);
		
		WebElement noOrYres  = driver.findElement(By.xpath("//div[@id='first']//label[@for='no']"));
		noOrYres.click();
		boolean enabled = noOrYres.isSelected();
	  	System.out.println(enabled);

	  	
	  	WebElement selectOrNot = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/label[3]"));
	  	boolean enabled2 = selectOrNot.isEnabled();
	  	System.out.println(enabled2);
	  //	boolean selected2 = selectOrNot.isSelected();
	  //
	  	//System.out.println(selected2);
	}

}
