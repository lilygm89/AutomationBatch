package automation_code_22ndOct_2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validations {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		System.out.println(driver.getCurrentUrl());
		
		String actualCurrentUrl = "https://www.rediff.com/";
		String expectedCurrentUrl = driver.getCurrentUrl();
		String actualTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String expectedTitle = driver.getTitle();
		
	
		if (actualCurrentUrl.equals(expectedCurrentUrl)) && actualTitle.equals(expectedTitle)) {
			
			
		}
		
		/*
		 * String actualTitle = "Rediff.com: News | Rediffmails | Stock Quotes | Shopping";
		 * String expectedTitle = driver.getTitle();
		 */
		
		

	}

}
