package October25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits3 {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        driver.findElement(By.xpath("//button[.='Start']")).click();


        WebElement text = driver.findElement(By.xpath("//h4[.='Hello World!']"));

        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(text));

//        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[.='Hello World!']")));

        System.out.println(text.getText());








    }
}
