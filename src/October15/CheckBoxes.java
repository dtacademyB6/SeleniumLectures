package October15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {


    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");


        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();


        // Grab all checkboxes and click on them
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();

        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

        for (WebElement checkbox : checkboxes) {
            if(!checkbox.isSelected()){
                checkbox.click();
            }

        }


        // Click delete selected

        driver.findElement(By.cssSelector("input[value='Delete Selected']")).click();


    }
}
