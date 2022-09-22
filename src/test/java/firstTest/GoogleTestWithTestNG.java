package firstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTestWithTestNG {

    ChromeDriver driver;

    @BeforeTest
    public void setup(){
        //Set the properties
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kasintha Kalhara\\IdeaProjects\\chromedriver.exe");

        //variables
        String baseUrl = "https://www.google.com/";

        //initiate driver
        driver = new ChromeDriver();
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

        WebElement inputGoogleSearch = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.name("btnK"));

        inputGoogleSearch.sendKeys("Department of Industrial Management");
        searchButton.click();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
