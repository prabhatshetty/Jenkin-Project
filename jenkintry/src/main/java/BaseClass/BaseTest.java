package BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
public static WebDriver driver;
@BeforeClass
public void launchbrowser(){
	/*System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
Reporter.log("Browser launched sucessfully",true);*/
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	Reporter.log("Browser launched sucessfully",true);
}
@BeforeMethod
public void navigate() {
	driver.get("https://www.news18.com/");
	//Assert.assertEquals(expected,actual"")
}
@AfterMethod
public void close(){
	driver.quit();
}
}
