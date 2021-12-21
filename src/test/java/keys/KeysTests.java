package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTests {

    @Test
    public void testBaskspace(){
        var keypage = homepage.clickKeyPresses();
        keypage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keypage.getResult(),"You entered: BACK_SPACE","INCORRECT TEXT");
    }

    @Test
    public void testPi(){
        var keypage = homepage.clickKeyPresses();
        keypage.enterPi();

    }

}
