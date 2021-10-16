package October15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocatorsDynamicElements {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");


        //CSS Also supports handling dynamic elements


        //Starts-with  ->   ^=
       // input[data-ved^='0ahUKE'][name='q']

        // Ends-with  ->  $=
//        input[data-ved$='Q39UDCAY']

      // Contains  ->  *=
//        input[data-ved*='Q39UDCAY']

        driver.findElement(By.cssSelector("input[data-ved$='Q39UDCAY']")).sendKeys("CSS Selector vs Xpath" + Keys.ENTER);





    }
}
