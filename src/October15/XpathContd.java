package October15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContd {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");


        System.out.println(driver.findElement(By.xpath("//label[.='Username:']")).getText());
        System.out.println(driver.findElement(By.xpath("//label[contains( text(), 'word')]")).getText());






    }
}
