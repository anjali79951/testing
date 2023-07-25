package selfpractiestng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Testpracties {
 WebDriver cb;
 @Parameters({"browser","url"})
  @BeforeMethod
  public void buildexecution(String br,String bp  ) {
	 if(br.equalsIgnoreCase("ed")) {
		 WebDriverManager.edgedriver().setup();
		 cb=new EdgeDriver(); 
		 cb.get(bp);
	 }
	 else if(br.equalsIgnoreCase("cb")) {
		 WebDriverManager.chromedriver().setup();
	      cb=new ChromeDriver();
	      cb.get(bp);
	 }
  }

  @AfterMethod
  public void buildclose() {
	 cb.quit(); 
	
  }
  
  @Test(enabled=true,priority=1,groups="login")
  public void testcase1() {
	  WebElement c1=cb.findElement(By.xpath("//body[1]/center[1]/table[1]/tbody[1]/tr[2]/td[2]/form[1]/input[1]"));
	  c1.sendKeys("sadar");
	  WebElement c2=cb.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));
	  c2.sendKeys("sadar");
	  WebElement c3=cb.findElement(By.xpath("//tbody/tr[4]/td[1]/center[1]/input[1]"));
	  c3.click();
	  String ar= cb.getTitle();
	  
	  String er="MainHMR";
	  Assert.assertEquals(ar, er);
	  
  }

}
