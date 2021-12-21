package forgotPassword;

import base.BaseTests;
import org.testng.annotations.Test;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testSuccessfulEmail(){
        var forgotPasswordPage = homepage.clickForgotPassword();
        forgotPasswordPage.setEmail("pablo.2221@hotmail.com");
        forgotPasswordPage.clickRetrievePasswordButton();
    }
}
