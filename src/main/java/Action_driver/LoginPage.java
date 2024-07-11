package Action_driver;

import Base_Class.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage  {
    WebDriver driver;
    //Using the basic approach to locate element
    //enter username
    By username = By.name("username");
    //enter password
    By password = By.name("password");
    //click login
    By login = By.xpath("//button[normalize-space()='Login']");
    // orange hrm Logo
    By logo = By.xpath("//img[@alt='company-branding']");
    // add constructor
    public LoginPage(WebDriver driver)
    {
    this.driver=driver;
    }
    //user action methods
    public boolean validate_logo()
    {
        driver.findElement(logo).isDisplayed();
        return true;
    }
    //validate login
    public void  login() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(username).sendKeys("admin");
        driver.findElement(password).sendKeys("admin123");
        driver.findElement(login).click();

    }

}
