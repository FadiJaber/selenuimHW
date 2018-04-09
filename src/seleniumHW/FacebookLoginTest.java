package seleniumHW;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {
	static WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@After
	public void tearDown() throws Exception {
	//	driver.close();
	}

	@Test 
	public void test() {
		//fail("Not yet implemented");
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("email@hotmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("********");
		driver.findElement(By.xpath(".//*[@data-testid=\"royal_login_button\"]")).click();
	}

}
