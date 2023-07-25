package brc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Bre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// open the browser
		WebDriver cb=new ChromeDriver();
		cb.manage().window().maximize();
		 //enter url in browser address 
		   cb.get("https://www.redbus.in/");
		  // getting the title of the page 
		   String q= cb.getTitle(); 
		   System.out.println(q);
		String s1=cb.getCurrentUrl(); 
		System.out.println(s1);
		 Navigation n= cb.navigate(); 
		 n.to("https://www.facebook.com/");
	     n.back();
		 n.forward(); 
		 n.refresh(); 
		 String e=cb.getPageSource();
		 System.out.println(e);
 }
}  

