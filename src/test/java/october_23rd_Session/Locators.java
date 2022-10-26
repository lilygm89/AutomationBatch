package october_23rd_Session;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	//16 locators in Selenium 4
	
	//1. id
	//2. className
	//3. name
	//4. xpath
	//5. cssSelector
	//6. tagname
	//7. linkText
	//8. partiallinkText
	
	//9. ByAll
	//10. ByIdOrName
	//11. ByChained
	
	//12. above
	//13. below
	//14. near
	//15. toRightOf
	//16. toLeftOf
	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		//tagName as a locator is mostly used to identify multiple web elements
		
		//determine all the web elements with html div ??
		
		List<WebElement> allDivTags = driver.findElements(By.tagName("div"));
		System.out.println(allDivTags.size());
		
	
		WebElement usernameTextbox = driver.findElement(By.id("login1"));
		System.out.println(usernameTextbox.getTagName());
		
		/*
		 * WebElement username
		 */
		
		

	}

}
