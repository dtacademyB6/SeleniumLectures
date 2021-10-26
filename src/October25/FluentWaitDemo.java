package October25;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class FluentWaitDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");


        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2)) // default  polling frequency  - 500ms/0.5 seconds
                .ignoring(NoSuchElementException.class) // ignore the given exceptions while waiting
                .ignoring(StaleElementReferenceException.class);

        wait.until(ExpectedConditions.elementToBeClickable(By.id("message")));





    }
}
