package syncronizationcmd;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Expected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver cb=new ChromeDriver();
		cb.get("https://bsadar.github.io/hmrbuild1/Loging.html");
		
		WebDriverWait wait=new WebDriverWait(cb,Duration.ofMillis(3000));
		if(wait.until(ExpectedConditions.titleContains("HMR"))) {
			System.out.println("hi");
			
		}else {
			System.out.println("hello");
		}
		 WebElement w=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
        if(w.isDisplayed()) {
System.out.println("hi");
			
		}else {
			System.out.println("hello");
		}
        }
	}


