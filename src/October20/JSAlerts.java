package October20;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JSAlerts {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();


        Alert alert = driver.switchTo().alert(); // Alert is an interface
        // Select is a class
        // WebDriver is an interface
        // WebElement is an interface

        alert.accept();


        //When there is a JS Alert and you try to interact with the page without handling that alert,
        // UnhandledAlertException: unexpected alert open: {Alert text : I am a JS Alert}
        driver.findElement(By.linkText("Elemental Selenium")).click();



    }
}
