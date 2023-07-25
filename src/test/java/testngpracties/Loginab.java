package testngpracties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

 class Loginab {
  @Test(enabled=true,priority=1,groups="login")
  void testcase1() {
	  WebDriverManager.chromedriver().setup();
		WebDriver cb=new ChromeDriver();
		//enter url in browser address 
		cb.get("https://bsadar.github.io/hmrbuild1/Loging.html");
		//enter valid value in user id text field
		WebElement w1=cb.findElement(By.xpath("//body[1]/center[1]/table[1]/tbody[1]/tr[2]/td[2]/form[1]/input[1]"));
		w1.sendKeys("sadar");
		//enter valid value in pass word text field
		WebElement w2=cb.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));
		w2.sendKeys("sadar");
		//click on login button
		WebElement w3=cb.findElement(By.xpath("//tbody/tr[4]/td[1]/center[1]/input[1]"));
		w3.click();
		//actual result
		String ar=cb.getTitle();
		//expected result
		 String er="MainHMR";
		 //comparing actual result
		 Assert.assertEquals(ar, er);
		 //quiting the browser
		 cb.quit();
			}
        @Test(enabled=true,priority=2,groups="login")
         void testcase2(){
	     WebDriverManager.chromedriver().setup();
		 WebDriver cb=new ChromeDriver();
		//enter url in browser address
		cb.get("https://bsadar.github.io/hmrbuild1/Loging.html");
		//enter in valid value in user id text field
		WebElement w1=cb.findElement(By.xpath("//body[1]/center[1]/table[1]/tbody[1]/tr[2]/td[2]/form[1]/input[1]"));
		w1.sendKeys("sadarsir");
		//enter valid value in pass word text field
		WebElement w2=cb.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));
		w2.sendKeys("sadar");
		//click on login button
		WebElement w3=cb.findElement(By.xpath("//tbody/tr[4]/td[1]/center[1]/input[1]"));
        w3.click();
       // Actual result
       String ar= cb.switchTo().alert().getText();
       // expected result
	   String er="Invalid UserID";
	   //comparing the ar and er
	   Assert.assertEquals(ar, er);
	   //closing popup window
	   cb.switchTo().alert().accept();
	   //quiting the browser
	   cb.quit();
  
  }
        @Test(enabled=true,priority=3,groups="login")
        void testcase3(){
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
    	    //actual result
    	    String ar=cb.switchTo().alert().getText();
    	    // expected result
    	    String er="Invalid Password";
    	    //comparing the ar and er
        	Assert.assertEquals(ar, er);
        	//closing popup window
        	cb.switchTo().alert().accept();
        	//quiting the browser
        	cb.quit();
        }
        
        @Test(enabled=true,priority=4,groups="login")
        void testcase4(){
        	WebDriverManager.chromedriver().setup();
    		WebDriver cb=new ChromeDriver();
    		//enter url in browser address
    		cb.get("https://bsadar.github.io/hmrbuild1/Loging.html");
    		//enter invalid value in user id text field
    		WebElement w1=cb.findElement(By.xpath("//body[1]/center[1]/table[1]/tbody[1]/tr[2]/td[2]/form[1]/input[1]"));
    		w1.sendKeys("sadarsir");
    		//enter invalid value in pass word text field
    		WebElement w2=cb.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));
    		w2.sendKeys("sadarsir");
    		//click on login button
    		WebElement w3=cb.findElement(By.xpath("//tbody/tr[4]/td[1]/center[1]/input[1]"));
    		w3.click();
        	//actual result
    		String ar=cb.switchTo().alert().getText();
    		//expected result
    		String er="Invalid UserID";
    		//comparing ar and er
    		Assert.assertEquals(ar, er);
    		//closing popup window
    		cb.switchTo().alert().accept();
    		//quiting the browser
    		cb.quit();
        }
        
        
        @Test(enabled=true,priority=5,groups="login")
        void testcase5(){
        	WebDriverManager.chromedriver().setup();
    		WebDriver cb=new ChromeDriver();
    		//enter url in browser address
    		cb.get("https://bsadar.github.io/hmrbuild1/Loging.html");
    		
    		WebElement w1=cb.findElement(By.xpath("//body[1]/center[1]/table[1]/tbody[1]/tr[2]/td[2]/form[1]/input[1]"));
    		w1.sendKeys("");
    		
    		WebElement w2=cb.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));
    		w2.sendKeys("");
    		//click on login button
    		WebElement w3=cb.findElement(By.xpath("//tbody/tr[4]/td[1]/center[1]/input[1]"));
            w3.click();
            
          //actual result
    		String ar=cb.switchTo().alert().getText();
    		//expected result
    		String er="Invalid UserID";
    		//comparing ar and er
    		Assert.assertEquals(ar, er);
    		//closing popup window
    		cb.switchTo().alert().accept();
    		//quiting the browser
    		cb.quit();
        	
        }
        @Test(enabled=true,priority=6,groups="login")
        void testcase6(){
        	WebDriverManager.chromedriver().setup();
    		WebDriver cb=new ChromeDriver();
    		//enter url in browser address
    		cb.get("https://bsadar.github.io/hmrbuild1/Loging.html");
    		//enter valid value in user id text field
    		WebElement w1=cb.findElement(By.xpath("//body[1]/center[1]/table[1]/tbody[1]/tr[2]/td[2]/form[1]/input[1]"));
    		w1.sendKeys("sadar");
    		//enter valid value in pass word text field
    		WebElement w2=cb.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));
    		w2.sendKeys("sadar");
    		//click on reset button
    		WebElement w3=cb.findElement(By.xpath("//tbody/tr[4]/td[2]/center[1]/input[1]"));
    		w3.click();
    		//actual result
    		WebElement ar1=cb.findElement(By.xpath("//tbody/tr[4]/td[2]/center[1]/input[1]"));
    		String ar=ar1.getText();
    		//expected result
    		String er="";
    		//comparing ar and er
    		Assert.assertEquals(ar, er);
    		
    		cb.quit();
    		
        	
        }
  
 }
