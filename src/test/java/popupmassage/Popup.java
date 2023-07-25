package popupmassage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver cb=new ChromeDriver();
		cb.get("https://bsadar.github.io/hmrbuild1/Loging.html");
		WebElement w1=cb.findElement(By.xpath("//body[1]/center[1]/table[1]/tbody[1]/tr[2]/td[2]/form[1]/input[1]"));
		w1.sendKeys("sadarsir");
		WebElement w2=cb.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));
		w2.sendKeys("sadar");
		WebElement w3=cb.findElement(By.xpath("//tbody/tr[4]/td[1]/center[1]/input[1]"));
        w3.click();
       cb.switchTo().alert().accept();
       
        
	}

}
