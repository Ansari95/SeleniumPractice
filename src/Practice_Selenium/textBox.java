package Practice_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textBox {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\Selenium_pro\\Browsers\\chromedriver.exe");
	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Link.html");
		
		WebElement goToHome = driver.findElement(By.linkText("Go to Home Page"));
		goToHome.click();
		
		WebElement edit = driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]/a"));
		edit.click();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("abcd@gamail.com");
		
		WebElement Append = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
		Append.clear();
		Append.sendKeys("hello");
		String textOfApeend = Append.getAttribute("value");
		System.out.println(textOfApeend);
		
		
		WebElement getDefaultText = driver.findElement(By.name("username"));
		String text = getDefaultText.getAttribute("value");
		System.out.println(text);
		
		WebElement clearMe = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input"));
		clearMe.clear();
		
		WebElement disabled = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));
		boolean enabled = disabled.isEnabled();
		System.out.println(enabled);
		
	   driver.navigate().back();
	   
	   
	   //this is next operation
	   
	   
	  
	   
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
