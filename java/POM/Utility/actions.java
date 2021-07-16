package POM.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class actions {
    public void clickElement(WebElement ele){
        System.out.println("Clicking element ");
        ele.click();
    }

    public void enterInput(WebElement ele, String input){
        System.out.println("Entering input ");
        ele.sendKeys(input);
    }

}
