package Base_Class;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {


    public WebDriver driver;
    @BeforeMethod
    public void Setup ()
    {
        //How to set up chrome driver
        WebDriverManager.chromedriver().setup();
        //Invoke the browser
        System.setProperty("web driver.chrome.driver", "chromedriver.exe");
        //Add chrome options menu
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-web-security");
        //Open the browser
        driver = new ChromeDriver(options);
        //Maximise the browser
        driver.manage().window().maximize();
        //Navigate to url
        driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @AfterMethod
    public void teardown ()
    {
        driver.quit();
    }
}
