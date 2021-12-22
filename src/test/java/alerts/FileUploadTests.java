package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homepage.clickFileUpload();
        uploadPage.uploadFile("/Users/pablomac/Downloads/UCreativa/webdriver_java/resources/chromedriver");
        assertEquals(uploadPage.getUploadedFiles(),"chromedriver","Upload name incorrect");
    }
}
