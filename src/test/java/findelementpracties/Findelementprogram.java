package findelementpracties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findelementprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver cb=new ChromeDriver();
		//enter url in browser address
		cb.get("https://bsadar.github.io/hmrbuild1/Loging.html");
		//enter valid value in user id in text field
		WebElement uid=cb.findElement(By.xpath("//body[1]/center[1]/table[1]/tbody[1]/tr[2]/td[2]/form[1]/input[1]"));
		uid.sendKeys("sadar");
		//enter valid value in password in text field
		WebElement psw=cb.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));
		psw.sendKeys("sadar");
		//click on login button
		WebElement lgin=cb.findElement(By.xpath("//tbody/tr[4]/td[1]/center[1]/input[1]"));
		lgin.click();
		//click on update and profile link
		WebElement udate=cb.findElement(By.xpath("//b[contains(text(),'Update Profile&Skills')]"));
		udate.click();
		
		//enter valid value in text field
		WebElement id=cb.findElement(By.xpath("//input[@id='EID']"));
		id.sendKeys("1234");
		//enter valid value in text field
		WebElement fname=cb.findElement(By.xpath("//input[@id='fname']"));
		fname.sendKeys("Anjali");
		//enter valid value in text field
		WebElement lname=cb.findElement(By.xpath("//input[@id='lname']"));
		lname.sendKeys("Reddy");
		//click on radio button
		WebElement gender=cb.findElement(By.xpath("//input[@id='sex-1']"));
		gender.click();
		//click on radio button
		WebElement year=cb.findElement(By.xpath("//input[@id='exp-1']"));
		year.click();
		//enter valid value in text field
		WebElement date=cb.findElement(By.xpath("//input[@id='datepicker']"));
		date.sendKeys("10-06-2023");
		//click on system engineer button
		WebElement ex=cb.findElement(By.xpath("//input[@id='profession-0']"));
		ex.click();
		
		
		  WebElement pf1=cb.findElement(By.xpath("//input[@id='photo']"));
		  pf1.sendKeys("‪C:\\Users\\ksaik\\Desktop\\1O4A0635.JPG");
		 
		 
		//click on test bech button
		WebElement tool=cb.findElement(By.xpath("//input[@id='tool-0']"));
		tool.click();
		//
		WebElement wp=cb.findElement(By.xpath("//select[@id='continents']"));
		wp.click();
		//click on submit button
		
		/*
		 * WebElement w1=cb.findElement(By.xpath("//button[@id='submit']")); w1.click();
		 * //click on back button WebElement w2 WebElement w2
		 * =cb.findElement(By.xpath("//button[contains(text(),'Back')]")); w2.click();
		 */
		
		
		
		WebElement p1=cb.findElement(By.className("input-xlarge"));
		Select s1=new Select(p1);
		s1.selectByIndex(2);
	
		
		WebElement w=cb.findElement(By.className("input-xlarge"));
		Select s3=new Select(w);
		s3.selectByIndex(0);
		s3.selectByVisibleText("Signal Principles");
		s3.selectByValue("2");
		
		
		

	}

}
