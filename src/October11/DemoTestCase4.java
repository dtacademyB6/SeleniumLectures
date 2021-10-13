package October11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DemoTestCase4 {

    public static void main(String[] args) throws InterruptedException {

//
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
       WebDriver driver = new ChromeDriver(); // creates a new browser session, opens a new browser

     // Go to
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        // Enter Tester for username
        WebElement inputBox = driver.findElement(By.id("ctl00_MainContent_username"));
        inputBox.sendKeys("Tester");
//        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
//        NoSuchElementException is thrown if the findElement emthod cannot find the lement that you are looking
        //Enter test for password

        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        // Click on Login button

        driver.findElement(By.className("button")).click();


        // Verify that the user logged in successfully
        Thread.sleep(1000);
        Assert.assertEquals( driver.getCurrentUrl(), "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");

        Thread.sleep(2000);
        driver.quit();




    }
}
