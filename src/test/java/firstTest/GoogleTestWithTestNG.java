package firstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.GoogleSearchPage;

public class GoogleTestWithTestNG {

    ChromeDriver driver;
    GoogleSearchPage googleSearchPage;

    @BeforeTest
    public void setup(){
        //Set the properties
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kasintha Kalhara\\IdeaProjects\\chromedriver.exe");

        //variables
        String baseUrl = "https://www.google.com/";

        //initiate driver
        driver = new ChromeDriver();
        googleSearchPage = new GoogleSearchPage(driver);
        driver.get(baseUrl);
    }

    @Test
    public void verifyGoogleTabTitle(){

        //variables
        String expectedResult = "Google";
        String actualResult = "";

        //get actual result
        actualResult = driver.getTitle();

        //compare
        String status = actualResult.contentEquals(expectedResult) ? "TEST PASS" : "TEST FAIL";

        System.out.println(status);
    }

    @Test
    public void verifyGoogleSearch(){

        googleSearchPage.typeGoogleSearchKey("Department of Industrial Management");
        googleSearchPage.clickGoogleSearchBtn();

        //WebElement inputGoogleSearch = driver.findElement(By.name("q"));
        //WebElement searchButton = driver.findElements(By.name("btnK")).get(1);

        //inputGoogleSearch.sendKeys("Department of Industrial Management");
        //searchButton.click();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
