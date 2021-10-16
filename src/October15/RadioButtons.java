package October15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {


    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");


        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();


        driver.findElement(By.linkText("Order")).click();

//        driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_cardList_1")).click();


        // Grab all radio buttons on the page and click randomly on one of them

        List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[type='radio']"));

        int randomNo = (int)(Math.random()*radioButtons.size());

        radioButtons.get(randomNo).click();




    }
}
