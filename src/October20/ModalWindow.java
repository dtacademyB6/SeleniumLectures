package October20;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class ModalWindow {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        driver.get("https://duotech.talentlms.com/");


         driver.findElement(By.id("tl-cms-nav-login")).click();

         //ElementNotInteractableException: element not interactable
        // This exception is thrown when an element is on the HTML code,
        // but not interactable due to being hidden, not visible, covered by other

        Thread.sleep(1000);

         driver.findElement(By.xpath("//div[@id='tl-cms-login-modal']//a[@class='close']")).click();


         // Modal windows and pop-ups are inspectable and
        // you handle them like any regular element by locating the x or cancel button or link and click
         driver.get("https://www.volvo.com/en/");

         driver.findElement(By.id("onetrust-reject-all-handler")).click();






    }
}
