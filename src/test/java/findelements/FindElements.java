package findelements;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver cb=new ChromeDriver();
		cb.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		WebElement w1= cb.findElement(By.xpath("//button[@id='win1']"));
		w1.click();
		
		String s=cb.getWindowHandle();
		cb.switchTo().window(s);
		
		WebElement w2=cb.findElement(By.xpath("//textarea[@id='APjFqb']"));
		w2.sendKeys("Anjali");
		WebElement w3=cb.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]"));
		w3.click();
		
		
		
		
	}

}
