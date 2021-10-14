package October13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {


    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");


        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester", Keys.TAB, "test");

        Thread.sleep(2000);
        driver.findElement(By.name("ctl00$MainContent$login_button")).submit();
    }
}
