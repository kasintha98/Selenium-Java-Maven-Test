package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {

    private  By inputGoogleTextBox = By.name("q");
    private  By btnGoogleSearch = By.name("btnK");

    WebDriver driver;

    public GoogleSearchPage(WebDriver driver){
        this.driver = driver;
    }

    public void typeGoogleSearchKey(String key){
        driver.findElement(inputGoogleTextBox).sendKeys(key);
    }

    public void clickGoogleSearchBtn(){
        driver.findElements(btnGoogleSearch).get(1).click();
    }
}
