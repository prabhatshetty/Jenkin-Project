package Test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import BaseClass.BaseTest;
import PomRepositry.HomePage;

/**
 * Hello world!
 *
 */
public class App extends BaseTest
{
	@Test
    public void simple()
    {
		HomePage homepage=new HomePage(driver);
		homepage.getHomeLINK().click();
        Reporter.log( "Hello World!",true);
    }
}
