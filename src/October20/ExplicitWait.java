package October20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class ExplicitWait {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get(" https://the-internet.herokuapp.com/dynamic_controls");



        driver.findElement(By.xpath(" //input[@type='checkbox']")).click();

        driver.findElement(By.xpath("//button[.='Remove']")).click();

        // Explicit wait


//        WebDriverWait wait =  new WebDriverWait(driver, 5);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));

        new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(By.id("message")));

        Assert.assertEquals(driver.findElement(By.id("message")).getText(), "It's gone!");

    }
}
