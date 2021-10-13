package October13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class FindingByTagName {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.duotech.io/");


        String text = driver.findElement(By.tagName("h1")).getText();

        System.out.println(text);
        Assert.assertEquals(text, "Start New IT Career");

        System.out.println(driver.findElement(By.tagName("h2")).getText());
        // findElement() method returns the first occurrence of the matching elements










    }



}
