package loginmodule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_00006 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver cb=new ChromeDriver();
		cb.get("https://bsadar.github.io/hmrbuild1/Loging.html");
		WebElement w1=cb.findElement(By.xpath("//body[1]/center[1]/table[1]/tbody[1]/tr[2]/td[2]/form[1]/input[1]"));
		w1.sendKeys("sadar");
		WebElement w2=cb.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));
		w2.sendKeys("sadar");
		WebElement w3=cb.findElement(By.xpath("//tbody/tr[4]/td[2]/center[1]/input[1]"));
		w3.click();
		
		
	//	WebElement c=cb.findElement(By.xpath("//tbody/tr[4]/td[2]/center[1]/input[1]"));
		//String s=c.getText();
		//String s1="";
		   if(cb.getTitle().equals("")) {
			   System.out.println("test case 1 is pass");
		   }
		   else {
			   System.out.println("test case 1 is fail");
		   }
			
	         Thread.sleep(3000);
	        
	        cb.quit();
		
		
		
	}

}
