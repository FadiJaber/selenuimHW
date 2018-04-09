package seleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {
	static WebDriver driver;
	public static void main(String args[])
	{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("fadi_jab@hotmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("fd480726");
		driver.findElement(By.xpath(".//*[@data-testid='royal_login_button']")).click();
		
	}
}
