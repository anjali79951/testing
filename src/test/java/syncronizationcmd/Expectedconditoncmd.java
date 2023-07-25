package syncronizationcmd;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Expectedconditoncmd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver cb=new ChromeDriver();
		cb.get("https://bsadar.github.io/hmrbuild1/Loging.html");
		
		
		WebDriverWait act=new WebDriverWait(cb,Duration.ofMillis(3000));
		
		if(act.until(ExpectedConditions.titleContains("HMR"))) {
			System.out.println("pass");
		}	else {
			System.out.println("fail");
		}
		
		WebElement uid=act.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//body[1]/center[1]/table[1]/tbody[1]/tr[2]/td[2]/form[1]/input[1]")));
		if(uid.isDisplayed()) {
			System.out.println("ppass");
		}	else {
			System.out.println("fail");
		}
		}
	}
	
				

	


