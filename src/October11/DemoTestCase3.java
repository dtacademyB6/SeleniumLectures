package October11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DemoTestCase3 {

    public static void main(String[] args) throws InterruptedException {

//
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
       WebDriver driver = new ChromeDriver(); // creates a new browser session, opens a new browser

        // 1. Navigate to homepage
        driver.get("https://www.duotech.io/");
        Thread.sleep(2000);

        //2. Navigate to https://www.duotech.io/about-us

        driver.navigate().to("https://www.duotech.io/about-us");
        Thread.sleep(2000);

        //3. Navigate to https://www.duotech.io/faq

        driver.navigate().to("https://www.duotech.io/faq");
        Thread.sleep(2000);

        //4. Navigate back to previous page

        driver.navigate().back();
        Thread.sleep(2000);

        //5. Navigate forward again

        driver.navigate().forward();
        Thread.sleep(2000);

        //6. Refresh the page

        driver.navigate().refresh();
        Thread.sleep(2000);


        driver.quit();




    }
}
