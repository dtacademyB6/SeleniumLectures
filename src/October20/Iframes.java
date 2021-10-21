package October20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Iframes {


    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        driver.get("https://the-internet.herokuapp.com/iframe");


        System.out.println(driver.findElement(By.linkText("Elemental Selenium")).getText());

        // If your locator is correct but you are still getting NoSuchElement exception, it probably means that the lement is within an iframe

//        driver.switchTo().frame(0);  // index is zero based

//        driver.switchTo().frame("mce_0_ifr");  // you can use either id or name attribute of an iframe

        WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Rich Text Area. Press ALT-0 for help.']"));

        driver.switchTo().frame(iframe);


        System.out.println(driver.findElement(By.id("tinymce")).getText());


        driver.get("https://www.duotech.io/enroll-sqae2");

        WebElement iframe2 = driver.findElement(By.xpath("//iframe[starts-with(@id, '163477')]"));

        driver.switchTo().frame(iframe2);

        driver.findElement(By.xpath("//input[@placeholder='First']")).sendKeys("Johnny");

        driver.switchTo().defaultContent(); // switch back to the main window

        driver.findElement(By.linkText("LMS")).click();

    }
}
