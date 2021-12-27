package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import java.util.concurrent.TimeUnit;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homepage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        /*LINEA DE ARRIBA BASICAMENTE BUSCA EL ELEMENTO PERO SI NO APARECE LUEGO DE 30 SEGUNGOS SE SALE
        * NO SUCH ELEMENT EXCEPTION SALE SI NO SE ENCUENTRA EL ELEMENTO
        * IMPLICIT WAIT IS FOR THE ENTIRE APP*/
        goHome();
        homepage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}
