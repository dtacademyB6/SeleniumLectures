package October27;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class WindowSize {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.duotech.io/");

        List<WebElement> links = driver.findElements(By.xpath("//nav[@class='nav-menu w-nav-menu']//a"));


        for (WebElement link : links) {
            Assert.assertFalse(link.isDisplayed());
        }


        Dimension size = driver.manage().window().getSize();

        System.out.println(size);

        driver.manage().window().setSize(new Dimension(1020, 1020));

        Assert.assertTrue(driver.findElement(By.xpath("//nav[@class='nav-menu w-nav-menu']//a")).isDisplayed());





    }


}
