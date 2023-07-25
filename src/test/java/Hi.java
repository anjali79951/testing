import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver cb=new ChromeDriver();
		cb.get("");
		cb.getCurrentUrl();
		cb.close();
		cb.quit();
		WebElement w1=cb.findElement(By.xpath(""));
		w1.click();
		w1.sendKeys("");
		w1.submit();
		Navigation v=cb.navigate();
		v.to("");
		v.back();
		v.forward();
		v.refresh();
		v.back();
		

	}

}
