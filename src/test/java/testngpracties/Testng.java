package testngpracties;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Testng {
 
	WebDriver cb;
	
  @Parameters({"browser"})	
  @BeforeMethod
  public void buidexecution(String br) {
		if(br.equalsIgnoreCase("ed")) {
		
	 WebDriverManager.firefoxdriver().setup();
	 cb=new FirefoxDriver();
	 cb.get("https://bsadar.github.io/hmrbuild1/Loging.html");
		}
  }

  @AfterMethod
  public void buildclose() {
	  cb.quit();
  }
  @Test
  public void testcase1() {
	 
  }

}
