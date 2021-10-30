package October27;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassMouse2 {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver1.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("https://javascript.info/mouse-drag-and-drop");

        // Drag And Drop from source to target

//        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/article/mouse-drag-and-drop/ball4/']")));
//
//        WebElement sourece = driver.findElement(By.id("ball"));
//
//        WebElement target = driver.findElement(By.id("gate"));
//
//
//        new Actions(driver).dragAndDrop(sourece, target).perform();

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='https://en.js.cx/article/mouse-drag-and-drop/ball3/']")));

        WebElement sourece = driver.findElement(By.id("ball"));




//        new Actions(driver).dragAndDropBy(sourece, 400, 70).perform();


        new Actions(driver).clickAndHold(sourece).moveByOffset(380, 70).release(sourece).perform();

        driver.switchTo().defaultContent();

        new Actions(driver).moveToElement(driver.findElement(By.xpath("//a[@href='/ebook']"))).perform();







    }
}
