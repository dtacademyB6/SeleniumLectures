package October13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class FindElementsMethod2 {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();


        // Grab all links to a list

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        // Print out all links text


        List<String> actaualLinkTexts = new ArrayList<>();

        for (WebElement link : allLinks) {
            actaualLinkTexts.add(link.getText());
        }

        List<String> expectedLinkTexts = Arrays.asList( "View all products",  "Order", "View all orders", "Logout", "Uncheck All","Check All" );

        // Sort 2 lists to have the correct order
        Collections.sort(actaualLinkTexts);
        Collections.sort(expectedLinkTexts);

        Assert.assertEquals(actaualLinkTexts, expectedLinkTexts);

    }



}
