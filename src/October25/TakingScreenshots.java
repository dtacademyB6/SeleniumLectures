package October25;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TakingScreenshots {

    static WebDriver driver ;

    public static void main(String[] args) throws IOException {




        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
       driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.11.0");
        JavascriptExecutor js = (JavascriptExecutor) driver;  // Created by casting Webdriver object into JavascriptExecutor interface

        takeScreenshot("screenshots/image" + System.currentTimeMillis()+ ".png");
//        try{
//            Assert.assertEquals(driver.findElement(By.xpath("//h2[.='Epic Daily Deal']")).getText(),"Epic Daily Deals" );
//        }catch(AssertionError er){
//
////           takeScreenshot("C:\\Users\\Nuclues\\Desktop\\image.png");
//            takeScreenshot("image.png");
//           throw er;
//        }


        /// To take a screenshot Selenium has  TakesScreenshot interface



    }

    public static void takeScreenshot(String path) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotAs, new File(path));
    }
}
