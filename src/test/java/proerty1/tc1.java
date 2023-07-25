package proerty1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tc1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver cb=new ChromeDriver();
		
		FileInputStream pf=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\proerty1\\tc1.properties");
		Properties po=new Properties();
		po.load(pf);
		cb.get(po.getProperty("bpt"));
		cb.findElement(By.xpath(po.getProperty("uid"))).sendKeys(po.getProperty("uidv"));
		cb.findElement(By.xpath(po.getProperty("psw"))).sendKeys(po.getProperty("pswv"));
		cb.findElement(By.xpath(po.getProperty("lg"))).click();
        
        
        
        
        
	}

}
