package October27;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver1.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");


        WebElement inputBox = driver.findElement(By.id("twotabsearchtextbox"));


        Actions actions = new Actions(driver);

        actions.keyDown(Keys.SHIFT).sendKeys(inputBox,"high heel shoes").sendKeys(inputBox, Keys.ENTER).keyUp(Keys.SHIFT).build().perform();
        actions.sendKeys(inputBox," leather").sendKeys(inputBox, Keys.ENTER).build().perform();

//        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
//        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();


        // Builder Design Pattern
        // purpose => more readable and concise code
        MyActions myActions = new MyActions();

        myActions.keyDown().sendKeys().keyUp();


        WebElement computers = driver.findElement(By.xpath("//a[.='Computers']"));

        actions.click(computers).build().perform();


    }
}
