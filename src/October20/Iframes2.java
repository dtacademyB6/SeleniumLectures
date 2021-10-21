package October20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Iframes2 {


    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();




        driver.get("https://www.duotech.io/enroll-sqae2");

        WebElement iframe2 = driver.findElement(By.xpath("//iframe[starts-with(@id, '163477')]"));

        driver.switchTo().frame(iframe2);

        driver.findElement(By.xpath("//input[@placeholder='First']")).sendKeys("Johnny");


        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));


        System.out.println(driver.findElement(By.id("recaptcha-anchor-label")).getText());

        // When you have a nested iframe, and you need to work with the innermost iframe, you need to switch to the outer iframe first,
        // then from ther to inner one

        driver.switchTo().parentFrame(); // switches from inner frame to its parent frame

        driver.switchTo().defaultContent(); // switches from inner frame to the main window regardless of more parent frames existing

//        driver.findElement(By.xpath("//input[@placeholder='First']")).sendKeys(" Cage");

        driver.findElement(By.linkText("LMS")).click();





    }
}
