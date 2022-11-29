import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SuccessPage;

public class LoginTest extends BaseTest {
    @Test
    public void testLogin() {
        LoginPage.goTo();
        LoginPage.clickMyAccountButton();
        LoginPage.clickRegister();
        LoginPage.typeInTheFirstnameField("Mirem");
        LoginPage.typeInTheLastNameField("Veizova");
        LoginPage.typeInTheEmailAdressField("vgts@abv.bg");
        LoginPage.typeInTheTelephoneInputField("3468342");
        LoginPage.typeInThePasswordField("123456");
        LoginPage.typeInThePasswordConfirmField("123456");
        LoginPage.clickAgreeButton();
        LoginPage.clickButoncheContinue();
        SuccessPage.verifySuccessPage("Success");

}
}
