package October13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {


    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.dice.com/");


        driver.findElement(By.id("IPGeoLocateButton")).click();

        Thread.sleep(2000);

        driver.navigate().back();

//        driver.findElement(By.id("google-location-search")).clear();

        WebElement locationBox = driver.findElement(By.id("google-location-search"));

        while(!locationBox.getAttribute("value").equals("")){
            locationBox.sendKeys(Keys.BACK_SPACE);
        }



        driver.findElement(By.id("google-location-search")).sendKeys("Raleigh, NC");


        driver.findElement(By.id("submitSearch-button")).submit();


//

        


    }
}
