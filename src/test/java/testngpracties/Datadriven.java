package testngpracties;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class Datadriven {
  @Test(dataProvider = "dp")
  public void testcase1(String uid, String pd) {
	 WebDriverManager.chromedriver().setup();
     WebDriver cb=new ChromeDriver();
		
	  //enter url in browser address 
		cb.get("https://bsadar.github.io/hmrbuild1/Loging.html");
		//enter valid value in user id text field
		WebElement w1=cb.findElement(By.xpath("//body[1]/center[1]/table[1]/tbody[1]/tr[2]/td[2]/form[1]/input[1]"));
		w1.sendKeys(uid);
		//enter valid value in pass word text field
		WebElement w2=cb.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));
		w2.sendKeys(pd);
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

  @DataProvider
  public Object[][] dp() {
	  Object[][] crd=new Object[2][2];
	  crd[0][0]="sadar";
	  crd[0][1]="sadar";
	  
	  crd[1][0]="sadar";
	  crd[1][1]="sadar";
	return crd;
    }
  }

