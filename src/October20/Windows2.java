package October20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Windows2 {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        driver.get("https://the-internet.herokuapp.com/frames");

        driver.findElement(By.linkText("Elemental Selenium")).click();

        switchToWindow("Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro", driver);

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.findElement(By.linkText("Sauce Labs")).click();


        switchToWindow("Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs", driver);

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());






    }

    public static void switchToWindow(String windowTitle, WebDriver driver){
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
            if(driver.getTitle().equals(windowTitle)){
                break;
            }
        }
    }
}
