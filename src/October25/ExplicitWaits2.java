package October25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExplicitWaits2 {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        driver.findElement(By.xpath("//button[.='Remove1']")).click();
        //Implicit wait throws NoSuchElement exception
        // Explicit wait throws TimeOutException


        // Generally avoid mixing implicit and explicit waits
        // If you have to set implicit to 0 before using explicit and reset it afterwards


        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@id='messag']")));

        System.out.println( driver.findElement(By.xpath("//p[@id='message']")).getText());

        // Wait till the input box is enabled
        driver.findElement(By.xpath("//button[.='Enable']")).click();

        WebElement inputBox = driver.findElement(By.xpath("//input[@type='text']"));

//       while(!inputBox.isEnabled()){
//
//       }

        new WebDriverWait(driver, 10).
                until(ExpectedConditions.elementToBeClickable(inputBox));

       inputBox.sendKeys("Wait is over");






    }
}
