package POM;

import POM.Pages.homePage;
import POM.Utility.baseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class bookTicketTest extends baseTest {
    homePage page;
    WebDriver driver;

    public bookTicketTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        baseTest obj = new baseTest();
        driver = obj.getBrowserInstance();
        page = new homePage(driver);
        System.out.println("Starting Test \n");

    }

    @Test
    public void bookTicket(){
        page.acceptCokies();
        page.enterDestinationFrom("London");
        page.enterDestinationTo("Manchester");
        page.selectTwoWay();
        page.selectOutDate();
        page.selectReturnDate();
        page.getTimeTicket();
        page.clickcontinue();
        System.out.println("\nNumber of passenger = "+page.getNumOfPassenger()+"\n"+"Total Cost of ticket "+page.getPrice());
        Assert.assertEquals("1 Adult",page.getNumOfPassenger());
        Assert.assertEquals("$136.80",page.getPrice());


    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
        System.out.println("Test Ended");

    }

}
