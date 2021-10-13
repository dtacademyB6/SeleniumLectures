package October11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTestCase1 {

    public static void main(String[] args) {

//

//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
//        driver.get("https://www.google.com/");

//        System.setProperty("webdriver.edge.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\msedgedriver.exe");
//        WebDriver driver = new EdgeDriver();
//        driver.get("https://www.google.com/");


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
       WebDriver driver = new ChromeDriver(); // creates a new browser session, opens a new browser

        // 1. Navigate to homepage
        driver.get("https://www.duotech.io/");


       String URL = driver.getCurrentUrl();  // gets the current url
        System.out.println(URL);

        // 2. Get the title
        String expectedTitle = "Software QA Automation Engineer program | SDET | QA School | Software Testing1";
        String actualTitle = driver.getTitle();
       // 3. Compare and verify the expected title with the actual title
        Assert.assertEquals(actualTitle, expectedTitle);



    }


}
