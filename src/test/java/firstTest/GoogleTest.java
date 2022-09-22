package firstTest;

import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
    public static void main(String[] args) {
        //Set the properties
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kasintha Kalhara\\IdeaProjects\\chromedriver.exe");

        //initiate driver
        ChromeDriver driver = new ChromeDriver();

        //variables
        String baseUrl = "https://www.google.com/";
        String expectedResult = "Google";
        String actualResult = "";

        //open browser
        driver.get(baseUrl);

        //get actual result
        actualResult = driver.getTitle();

        //compare
        String status = actualResult.contentEquals(expectedResult) ? "TEST PASS" : "TEST FAIL";

        System.out.println(status);

        driver.quit();

    }
}
