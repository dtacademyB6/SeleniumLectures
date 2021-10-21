package October20;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class JSAlerts3 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();


        Alert alert = driver.switchTo().alert();
        // When you call switchTo().alert() method when thre is no alert on the page, NoAlertPresentException: no such alert is thrown
        String alertText = alert.getText();  // returns the text of the alert box
        Assert.assertEquals(alertText, "I am a JS prompt");
        alert.sendKeys("SDET");
        alert.accept();

        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You entered: SDET");






    }
}
