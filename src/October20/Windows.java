package October20;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Windows {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        driver.get("https://the-internet.herokuapp.com/frames");

        driver.findElement(By.linkText("Elemental Selenium")).click();
        // opens the link in a new tab

//        driver.findElement(By.linkText("Elemental Selenium")).sendKeys(Keys.SHIFT,Keys.ENTER);
        // opens the link in a new window

        // To switch to a window Selenium uses window's handle

        String windowHandle1 = driver.getWindowHandle();  //returns current window's handle

        System.out.println(windowHandle1);

        Set<String> windowHandles = driver.getWindowHandles();

        System.out.println(windowHandles);


        for (String windowHandle : windowHandles) {
            if(!windowHandle.equals(windowHandle1)){
                driver.switchTo().window(windowHandle);
            }
        }



        System.out.println( driver.getCurrentUrl());
        System.out.println( driver.getTitle());


        driver.findElement(By.linkText("Sauce Labs")).click();

        String windowHandle2 = driver.getWindowHandle();

       windowHandles = driver.getWindowHandles();


        for (String windowHandle : windowHandles) {
            if(!windowHandle.equals(windowHandle1) && !windowHandle.equals(windowHandle2)){
                driver.switchTo().window(windowHandle);
            }
        }

        System.out.println(driver.getTitle());

        // Switch back to 1st window

        driver.switchTo().window(windowHandle1);

        System.out.println(driver.getTitle());

        driver.get("https://saucelabs.com/");


        driver.close(); //closes the current active window
//        driver.quit(); // quits the entire session by closing all windows opened by the driver object

        // When you call any driver methods after quit() :

//        NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?

        // When you call driver.get() after close():
//        NoSuchWindowException: no such window: target window already closed

        driver.switchTo().window(windowHandle2);
        // When multiple windows are open and you close one of them, the context is not switched to any window
        // unless you switch it manually with switchTo().window(windowHandle2) method
        driver.get("https://duotech.talentlms.com/");


    }
}
