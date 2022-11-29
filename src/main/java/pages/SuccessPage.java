package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utils.Browser;
import utils.Wait;

public class SuccessPage extends BasePage{


    @FindBy(xpath = "//*[@id=\"common-success\"]//li[3]//a")
    private static WebElement success;




    static {
        PageFactory.initElements(Browser.driver, BasePage.class);
    }

    public static void verifySuccessPage(String expectedText) {
        Wait.wait.until(ExpectedConditions.visibilityOf(success));
        Assert.assertEquals(success.getText(), expectedText);
    }
}
