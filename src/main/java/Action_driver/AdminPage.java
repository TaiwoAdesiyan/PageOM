package Action_driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class AdminPage {

     WebDriver driver;
    //using the basic approach (By)
    //click admin
    By admin  = By.xpath("//ul[@class=\"oxd-main-menu\"]/li[1]/a/span");
    //input user name in admin menu
    By username = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input");
    //click user role dp menu
    By select = By.xpath("//body/div[@id='app']" +
            "/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]");
    //user select admin in the dropdown
    By admindp = By.xpath("//div[@class='oxd-select-text-input'][normalize-space()='Admin']");
    //inspect employe name
    By employname = By.xpath("//input[@placeholder='Type for hints...']");
    //click select status
    By status = By.xpath("//div[contains(text(),'-- Select --')]");
    //user select enable in the drop down menu
    By enable = By.xpath("//div[@class='oxd-select-text-input'][normalize-space()='Enabled']");
    //user clicks search button
    By search = By.xpath("//button[normalize-space()='Search']");

    //add constructor
    public AdminPage(WebDriver driver)
    {
        this.driver=driver;
    }

    //validate admin page
    public void admin_pages () throws InterruptedException, AWTException {
        Thread.sleep(5000);
        driver.findElement(admin).click();
        Thread.sleep(3000);
        driver.findElement(username).sendKeys("arron.mills");
        driver.findElement(select).click();
        Thread.sleep(5000);
        driver.findElement(admindp).click();
       //driver.findElement(admindp).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(4000);
        driver.findElement(admindp).sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        driver.findElement(employname).sendKeys("Jonathan Wiza");
        driver.findElement(status).click();
        driver.findElement(enable).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(enable).sendKeys(Keys.ENTER);
        driver.findElement(search).click();

    }




}
