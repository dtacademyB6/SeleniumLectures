package October25;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JSExecutor2 {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("https://www.carmax.com/");




       JavascriptExecutor js = (JavascriptExecutor) driver;  // Created by casting Webdriver object into JavascriptExecutor interface




        js.executeScript("history.go(0)");


        js.executeScript("window.scrollBy(0,2000)");

        js.executeScript("window.scrollBy(0,-500)");


        driver.get("https://www.amazon.com/");


        WebElement link = driver.findElement(By.xpath("//a[.='Music Library']"));

//        link.click();

        js.executeScript("arguments[0].click();", link);




    }
}
