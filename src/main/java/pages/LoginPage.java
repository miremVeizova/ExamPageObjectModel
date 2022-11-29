package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Browser;
import utils.Wait;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//*[@class='fa fa-user']//..")
    private static WebElement myAccount;

    @FindBy(xpath= "//*[@class='dropdown-menu dropdown-menu-right']//li[1]//a/.")
    private static WebElement register;

    @FindBy(id = "input-firstname")
    private static WebElement firstname;

    @FindBy(id = "input-lastname")
    private static WebElement lastname;

    @FindBy(id = "input-email")
    private static WebElement emailAdress;

    @FindBy(id = "input-telephone")
    private static WebElement telephone;

    @FindBy(id = "input-password")
    private static WebElement password;

    @FindBy(id = "input-confirm")
    private static WebElement passwordConfirm;

    @FindBy(xpath= "//input[@name='agree']")
    private static WebElement agree;

    @FindBy(xpath= "//input[@value='Continue']")
    private static WebElement continueButton;


    private static String loginPageUrl = "http://shop.pragmatic.bg";

    static {
        PageFactory.initElements(Browser.driver, LoginPage.class);
    }

    public static void goTo() {
        Browser.driver.get(loginPageUrl);
    }

    public static void clickMyAccountButton () {
//        Wait.wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        click(myAccount);}

    public static void clickRegister () {
//        Wait.wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        click(register);}


    public static void typeInTheFirstnameField(String firstName) {
        firstname.sendKeys(firstName);
    }

    public static void typeInTheLastNameField(String lastName) {

        lastname.sendKeys(lastName);
    }
    public static void typeInTheEmailAdressField(String email) {

        emailAdress.sendKeys(email);
    }
    public static void typeInTheTelephoneInputField(String number) {
        telephone.sendKeys(number);
    }
    public static void typeInThePasswordField(String pass) {
        password.sendKeys(pass);}

        public static void typeInThePasswordConfirmField(String passConfirm) {
            passwordConfirm.sendKeys(passConfirm);
    }
            public static void clickAgreeButton () {
                click(agree);}

    public static void clickButoncheContinue () {
        click(continueButton);}



}
