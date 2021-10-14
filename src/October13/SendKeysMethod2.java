package October13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod2 {


    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");


//        driver.findElement(By.name("q")).sendKeys( "hello");
//        driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN,Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
//        driver.findElement(By.name("q")).sendKeys(Keys.chord(Keys.SHIFT, "hello"), Keys.ARROW_DOWN, Keys.ARROW_DOWN,Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER );

         driver.findElement(By.linkText("Store")).sendKeys(Keys.SHIFT, Keys.ENTER); // opens the link in a new window
         Thread.sleep(2000);
//        driver.close();  // close() closes only the current active window
        driver.quit(); // quit() closes all windows associated with current session





    }
}
