package October13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        WebElement usernameInputField = driver.findElement(By.id("ctl00_MainContent_username"));

        System.out.println(usernameInputField.getAttribute("name"));
        System.out.println(usernameInputField.getAttribute("style"));

         usernameInputField.sendKeys("Hello");

        System.out.println(usernameInputField.getAttribute("value"));
        // value attribute returns the text of the input Box




    }
}
