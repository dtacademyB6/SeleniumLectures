package October27;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassMouse {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver1.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");


        WebElement element = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));


        new Actions(driver).doubleClick(element).perform();  // double click

        driver.switchTo().alert().accept();


        new Actions(driver).contextClick(driver.findElement(By.xpath("//span[.='right click me']"))).  // right click
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();  // perform() -> build().perform();




    }
}
