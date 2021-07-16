package POM.Pages;

import POM.Utility.actions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage extends actions {
    public static WebDriver driver;
    public homePage(WebDriver driver){
    PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#onetrust-accept-btn-handler")
    private WebElement acceptCokies;

    @FindBy(css = "[name='from.search']")
    private WebElement destinationFrom;

    @FindBy(css = "[name='to.search']")
   private WebElement destinationTo;

    @FindBy(xpath = "//input[@id='return']")
    private WebElement twoWay;

    @FindBy(xpath = "//input[@id='page.journeySearchForm.outbound.title']")
    private WebElement outDateField;

    @FindBy(css = "[title='July 28, 2021']")
    private WebElement outdate;

    @FindBy(css = "[name='page.journeySearchForm.inbound.title']")
    private WebElement returnDateField;

    @FindBy(css = "[title='July 30, 2021']")
    private WebElement returndate;

    @FindBy(xpath = "//button[@class='_nsi73u8']")
    private WebElement getTimeTicketBtn;

    @FindBy(css = "._eu1pe2 > span")
    private WebElement continueBtn;

    @FindBy(css = "[data-test='cjs-price'] > span")
    private WebElement totalPriceHolder;

    @FindBy(css = "._9ouot9 > span")
    private WebElement numberofPassenger;

    public void acceptCokies(){
        clickElement(acceptCokies);
    }

    public void enterDestinationFrom(String input){

        enterInput(destinationFrom,input);
    }

    public void enterDestinationTo(String input){

        enterInput(destinationTo,input);
        destinationTo.sendKeys(Keys.ENTER);
    }

    public void selectTwoWay(){
        clickElement(twoWay);
    }

    public void selectOutDate(){
        clickElement(outDateField);
        clickElement(outdate);
    }

    public void selectReturnDate(){
        clickElement(returnDateField);
        clickElement(returndate);
    }

    public void getTimeTicket(){
        clickElement(getTimeTicketBtn);
    }

    public void clickcontinue(){
        clickElement(continueBtn);
    }
    public String getPrice(){
       return totalPriceHolder.getText();
    }

    public String getNumOfPassenger(){
        return numberofPassenger.getText();
    }
}
