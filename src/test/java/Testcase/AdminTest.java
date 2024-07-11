package Testcase;

import Action_driver.AdminPage;
import Action_driver.LoginPage;
import Base_Class.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.awt.*;

public class AdminTest extends BaseClass {
//    public AdminTest(WebDriver driver) {
//        super();
//    }

    @Test
    public void admin_test() throws InterruptedException, AWTException {
        AdminPage at = new AdminPage(driver);
        LoginPage lp = new LoginPage(driver);
        Thread.sleep(4000);
        lp.login();
       Thread.sleep(4000);
        at.admin_pages();
       // Thread.sleep(3000);

    }

}
