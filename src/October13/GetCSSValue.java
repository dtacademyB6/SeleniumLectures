package October13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GetCSSValue {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");


        System.out.println( driver.findElement(By.name("ctl00$MainContent$login_button")).getCssValue("text-align"));

        // verify the error message content is "Invalid Login or Password."  and color is FF0000

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("dbsfjfdsfds");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("dfsfsdfds");
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();


        WebElement errorMessage = driver.findElement(By.id("ctl00_MainContent_status"));

        Assert.assertEquals(errorMessage.getText(), "Invalid Login or Password.");

        Assert.assertEquals(errorMessage.getCssValue("color"), "rgba(255, 0, 0, 1)");


        System.out.println(driver.findElement(By.name("ctl00$MainContent$login_button")).getLocation());
        // returns the location of the element in x,y format in relation to the top left corner

        System.out.println(driver.findElement(By.name("ctl00$MainContent$login_button")).getSize());


        System.out.println(driver.findElement(By.name("ctl00$MainContent$login_button")).getTagName());


    }
}
