package October11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;

public class DemoTestCase2 {

    public static void main(String[] args) {

//
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
       WebDriver driver = new ChromeDriver(); // creates a new browser session, opens a new browser

        // 1. Navigate to homepage
        driver.get("https://www.duotech.io/");


        //2. Verify the url is https://www.duotech.io/
        String expectedURL = "https://www.duotech.io/";
        String actualURL = driver.getCurrentUrl();

       assertEquals(actualURL, expectedURL);

        //3. Verify that the Homepage contains "Start New IT" text

         String expectedText = "Start New IT";

         String pageSource = driver.getPageSource();

         assertTrue(pageSource.contains(expectedText));

//         driver.close();
         driver.quit();





    }
}
