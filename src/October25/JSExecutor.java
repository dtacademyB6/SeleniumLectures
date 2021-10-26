package October25;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JSExecutor {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get(" https://www.carmax.com/");




        driver.findElement(By.id("header-search-button")).click();
        driver.findElement(By.xpath("//button[@aria-label='Make']")).click();

//        driver.findElement(By.xpath("//input[@aria-label='Audi (84)']")).click();

        WebElement audi = driver.findElement(By.xpath("//input[@aria-label='Audi (85)']"));
        WebElement bmw = driver.findElement(By.xpath("//input[@aria-label='BMW (131)']"));
        //    ElementClickInterceptedException: element click intercepted: Element <input class="mdc-checkbox> is not clickable at point (239, 472). Other element would receive the click: <li tabindex="0">...</li>

        JavascriptExecutor js = (JavascriptExecutor) driver;  // Created by casting Webdriver object into JavascriptExecutor interface

        js.executeScript("arguments[0].click();", audi);

        js.executeScript("arguments[0].click();", bmw);

//        WebElement searchBox = driver.findElement(By.id("search-bar-input"));

        js.executeScript("document.getElementById('search-bar-input').value='Lamborghini';" );


        js.executeScript("history.go(0)");


        js.executeScript("window.scrollBy(0,500)");














    }
}
