package loginmodule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_00003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver cb=new ChromeDriver();
		cb.get("https://bsadar.github.io/hmrbuild1/Loging.html");
		//enter valid value in user id text field
		WebElement w1=cb.findElement(By.xpath("//body[1]/center[1]/table[1]/tbody[1]/tr[2]/td[2]/form[1]/input[1]"));
		w1.sendKeys("sadar");
		//enter in valid value in pass word text field
		WebElement w2=cb.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));
		w2.sendKeys("sadarsir");
		//click on login button
		WebElement w3=cb.findElement(By.xpath("//tbody/tr[4]/td[1]/center[1]/input[1]"));
	    w3.click();
	
	    if(cb.switchTo().alert().getText().equals("Invalid Password")) {
	    	System.out.println("test case 3 is pass");
	    }
	    else
	    {
	    	System.out.println("test case 3 is fail");
	    }
	    
	    cb.switchTo().alert().accept();
	    cb.quit();
	    
	    
	}

}
