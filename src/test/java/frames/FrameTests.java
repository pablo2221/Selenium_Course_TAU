package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwyg(){
        var editorPage = homepage.clickWysiwygEditor();
        editorPage.clearTextArea();

        String text1 = "Hello";
        String text2 = "Pablo";

        editorPage.setTextArea(text1);
        editorPage.decreaseIndention();
        editorPage.setTextArea(text2);

        assertEquals(editorPage.getTextFromEditor(),text1+text2,"Text from editor is incorrect");
    }
}
