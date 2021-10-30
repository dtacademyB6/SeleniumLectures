package October27;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class SessionCookies {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("https://www.bestbuy.com/");

        System.out.println(driver.manage().getCookies());

        driver.findElement(By.xpath("(//button[@aria-label='Close'])[2]")).click();

        driver.findElement(By.xpath("(//a[@href='/site/insignia-32-class-n10-series-led-hd-tv/6395127.p?skuId=6395127'])[2]")).click();

        driver.findElement(By.xpath("//button[@data-sku-id='6395127']")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@class='c-button-link continue-shopping']")).click();

        Thread.sleep(1000);


        driver.manage().deleteAllCookies();

        driver.navigate().refresh();






//        driver.manage().


    }


}
