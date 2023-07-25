package seleniumpracties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Swdpracties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver cb=new ChromeDriver();
        cb.get("https://chandanachaitanya.github.io/selenium-practice-site/");
        
        WebElement c1=cb.findElement(By.xpath("//input[@id='bike-checkbox']"));
        c1.click();
        
        WebElement c2=cb.findElement(By.xpath("//input[@id='self-help-radio-btn']"));
        c2.click();
        
        WebElement c3=cb.findElement(By.xpath("//select[@id='programming-languages']"));
        Select s1=new Select(c3);
        s1.selectByIndex(1);
        
        WebElement c4= cb.findElement(By.name("selenium_suite"));
        Select so=new Select(c4);
      so.selectByIndex(0);
      so.selectByIndex(1);
      so.deselectByIndex(1);
      
      
     
      WebElement c5=cb.findElement(By.id("confirmBox")); 
      c5.click();
      
      	}

}
