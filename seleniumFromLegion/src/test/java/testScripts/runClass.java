package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class runClass {

	public static void main(String[] args) {
		
		
		
		
	 WebDriver driver  =  new ChromeDriver();
	 
	 driver.get("https://automationbookstore.dev/");
	 
	 driver.quit();
	 
	}

}
