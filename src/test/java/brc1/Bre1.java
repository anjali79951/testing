package brc1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bre1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver w1=new ChromeDriver();
		w1.get("https://bsadar.github.io/hmrbuild1/Loging.html");
		//find element practies
		WebElement f=w1.findElement(By.xpath("//body[1]/center[1]/table[1]/tbody[1]/tr[2]/td[2]/form[1]/input[1]"));
	     f.sendKeys("sadar");
	     
	     WebElement w2= w1.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));
	     w2.sendKeys("sadar");
	     
	     WebElement w3=w1.findElement(By.xpath("//tbody/tr[4]/td[1]/center[1]/input[1]"));
	     w3.click();
	     
	     WebElement w4=w1.findElement(By.xpath("//b[contains(text(),'Update Profile&Skills')]"));
		w4.click();
		
		
		WebElement w5=w1.findElement(By.name("EmployeeID"));
		w5.sendKeys("1234");
		
		WebElement w6=w1.findElement(By.id("fname"));
		w6.sendKeys("Anjali");
		

		WebElement w7=w1.findElement(By.id("lname"));
		w7.sendKeys("reddy");
		
		 WebElement w8=w1.findElement(By.xpath("//input[@id='sex-1']"));
			w8.click();
		
		
			WebElement w9=w1.findElement(By.id("exp-3"));
			w9.click();
		
			WebElement w0=w1.findElement(By.xpath("//input[@id='datepicker']"));
			w0.sendKeys("21-05-2023");
			

			WebElement w11=w1.findElement(By.id("profession-1"));
			w11.click();
			
			/*
			 * WebElement w12=w1.findElement(By.id("photo"));
			 * w12.sendKeys("S:/Screenshot 2023-04-06 170537.png");
			 */
			WebElement w13= w1.findElement(By.xpath("//select[@id='continents']"));
			Select s=new Select(w13);
			s.selectByVisibleText("Ameerpet");
			
			
			
			WebElement w14=w1.findElement(By.name("selenium_commands"));
			Select s1=new Select(w14);
			s1.selectByIndex(0);
			s1.selectByIndex(1);
			
			
		
		
		
		
		
		
	}

}
