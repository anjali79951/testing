package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Contextclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver cb=new ChromeDriver();
		cb.get("https://www.redbus.in/");
		
		WebElement help=cb.findElement(By.xpath("//span[contains(text(),'Help')]"));
		Actions act=new Actions(cb);
		act.moveToElement(help).perform();
		act.contextClick().perform();
		
	}

}
