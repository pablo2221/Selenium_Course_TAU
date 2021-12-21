package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption(){
        var dropDownPage = homepage.clickDropDown();
        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        dropDownPage.getSelectedOptions();
        var selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1,"Incorrect number of selections");
        assertTrue(selectedOptions.contains(option),"Option not selected");
    }
}
