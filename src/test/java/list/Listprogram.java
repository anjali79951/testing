package list;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver cb=new ChromeDriver();
		cb.get("https://www.redbus.in/");
		List<WebElement> l=cb.findElements(By.tagName("a"));
		System.out.println(l.size());
		List<WebElement> list=cb.findElements(By.tagName("input"));
		System.out.println(list.size());		

	}

}
