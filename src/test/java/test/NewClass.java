package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewClass {
@Test	
public void name() {
	
	System.out.println("hi how are you");
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	System.out.println("end");
	System.out.println("bye");
	
}
	
}
