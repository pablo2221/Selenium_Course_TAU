package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By sliderValue = By.id("range");
    private By slider = By.cssSelector(".sliderContainer input");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void setSliderValue(String value){
        while(!getSliderValue().equals(value)){//mientras sea diferente al valor de value
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getSliderValue(){
        var value=  driver.findElement(sliderValue).getText();
        System.out.println(value);
        return driver.findElement(sliderValue).getText();

    }

}
