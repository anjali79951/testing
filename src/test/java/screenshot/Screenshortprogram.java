package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshortprogram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver cb=new ChromeDriver();
		cb.get("https://www.redbus.in/");
		
		File f=((TakesScreenshot)cb).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\ksaik\\Pictures.png"));

	}

}
