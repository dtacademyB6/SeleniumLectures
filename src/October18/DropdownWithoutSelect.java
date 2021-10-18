package October18;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropdownWithoutSelect {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");


       // Dropdown without select box is handled just like any regular element

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("au");
        Thread.sleep(2000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN,Keys.ENTER);




    }
}
