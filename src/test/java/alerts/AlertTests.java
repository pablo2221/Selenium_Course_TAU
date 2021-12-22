package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertPage = homepage.clickJavaScriptAlerts();
        alertPage.triggerAlert();
        alertPage.alert_ClickToAccept();
        assertEquals(alertPage.getResult(),"You successfully clicked an alert","Incorrect result text");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertPage = homepage.clickJavaScriptAlerts();
        alertPage.triggerConfirm();
        String text = alertPage.alert_getText();
        alertPage.alert_ClickToDismiss();
        assertEquals(text,"I am a JS Confirm","Alext text incorrect");
    }

    @Test
    public void testSetInputInAlert(){
        var alertPage = homepage.clickJavaScriptAlerts();
        alertPage.triggerPrompt();
        String text = "Pablo is learning in TAU";
        alertPage.alert_setInput(text);
        alertPage.alert_ClickToAccept();
        assertEquals(alertPage.getResult(),"You entered: "+text,"Results text incorrect");
    }
}
