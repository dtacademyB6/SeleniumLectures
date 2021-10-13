package October13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;


public class FindElementsMEthod {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.duotech.io/");

        List<WebElement> webElementList = driver.findElements(By.tagName("h2"));

        // findElements() method returns all matching elements according to the given locator

        for (WebElement webElement : webElementList) {
            System.out.println(webElement.getText());
        }

        System.out.println(webElementList.size());

       List<WebElement> list =  driver.findElements(By.tagName("iframe")); // findElements() method returns empty List if matching elements are not found

        System.out.println(list.size());










    }



}
