package October20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Waits {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        driver.get("https://the-internet.herokuapp.com/frames");

//        Thread.sleep(10000);  // Static wait, not recommended, but in practice everybody uses
        // Waits 10 seconds no matter what

        WebElement elemental_selenium = driver.findElement(By.linkText("Elemental Seleniu"));

        elemental_selenium.click();
    }
}
