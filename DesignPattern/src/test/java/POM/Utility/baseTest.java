package POM.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;
public class baseTest extends propertyReader {
    private WebDriver driver;
    propertyReader prop = new propertyReader();
    String website = prop.getConfig("url");
    public WebDriver getBrowserInstance(){
        if (prop.getConfig("browser").equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get(website);
            driver.manage().window().maximize();
        } else if (prop.getConfig("browser").equalsIgnoreCase("FireFox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get(website);
            driver.manage().window().maximize();
        }
        else {
            System.out.println("Browser defined except chrome and firefox \n");
        }

        return driver;
    }

}
