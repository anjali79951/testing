package brc1;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exeptionprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver cb=new ChromeDriver();
		cb.get("https://www.redbus.in/");
		
		try {

			cb.findElement(By.xpath("fffgghukokjjgfff")).sendKeys("");
			
				
			}
			catch(InvalidSelectorException e) {
				
				System.out.println("no xpathS");
				
			}
		catch(NoSuchElementException e) {
			System.out.println("xpath");
		}
		finally
		{
			System.out.println("pass");
		}
	
		

	}

}
