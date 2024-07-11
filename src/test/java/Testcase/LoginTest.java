package Testcase;

import Action_driver.LoginPage;
import Base_Class.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

    @Test
    public void login_test() throws InterruptedException {
        LoginPage lp = new LoginPage(driver);
        Thread.sleep(4000);
        lp.validate_logo();
        Thread.sleep(3000);
        lp.login();
        if (driver.getTitle().equals("OrangeHRM"))
        {
            Assert.assertTrue(true);
        }
        else
        {
            Assert.assertTrue(false);
        }
        //get the url
       String url = driver.getCurrentUrl();
        System.out.println("url of the page"+url);
    }
}
