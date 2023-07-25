package brc1;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver cb=new ChromeDriver();
		cb.get("https://www.redbus.in/");
	
		try {
			cb.findElement(By.xpath("ggggggfdd")).sendKeys("");	
		}
		catch(InvalidSelectorException e) {
			System.out.println("xpath");	
		}
		catch(NoSuchWindowException e) {
			System.out.println("xpath2");
		}
		finally {
			System.out.println("pass");
		}
		
		
		
		
	
}
}	
		