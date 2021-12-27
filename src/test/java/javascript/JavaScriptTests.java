package javascript;

import base.BaseTests;
import org.testng.annotations.Test;
import java.util.List;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){
         homepage.clickLargeAndDeepDom().scrollToTable();
    }

    @Test
    public void testScrollTToFifthParagraph(){
        homepage.clickInfiniteScroll().scrollToParagraph(5);
    }

    @Test
    public void testAddMultipleAttributeToDropdown() {

        var dropDownPage2 = homepage.clickDropDown();
        dropDownPage2.addMultipleAttribute();

        var optionsToSelect = List.of("Option 1", "Option 2");
        optionsToSelect.forEach(dropDownPage2::selectFromDropDown);

        var selectedOptions = dropDownPage2.getSelectedOptions();
        assertTrue(selectedOptions.containsAll(optionsToSelect), "All options were not selected");
        assertEquals(selectedOptions.size(), optionsToSelect.size(), "Number of selected items");
    }

}
