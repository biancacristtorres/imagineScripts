package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static String separator = System.getProperty("file.separator");
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fileInp = new FileInputStream(
					"src" + separator + "test" + separator + "java" + separator + "config" + separator + "config.properties");
			prop.load(fileInp);
		} catch (IOException error) {
			error.getMessage();
		}
	}
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "src" + separator + "test" + separator + "java" + separator + "resources" + separator + "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("urlSignIn"));
		driver.findElement(By.id("id_username")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.id("id_password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@class='fluid ui teal submit large button']")).click();
	}
	
	public static void close() {
		driver.quit();
	}
}
