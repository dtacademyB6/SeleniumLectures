package October15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropdownBoxHandling {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        // Implicit wait -> wait applied to all elements when Selenium tries to locate them

        // Implicit wait is usually set once at the beginning of your test execution

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://cars.com");

        // Choose Van

        WebElement dropdownBoxForType = driver.findElement(By.id("body_style"));

        Select select = new Select(dropdownBoxForType);
        System.out.println(select.getFirstSelectedOption().getText());  // returns the default selected option

        select.selectByVisibleText("Van");

        select.selectByValue("suv");


        // All deselect methods could be called only on multi-select dropdowns

     //   select.deselectByIndex(1);  // throws .UnsupportedOperationException: You may only deselect options of a multi-select

        System.out.println(select.isMultiple());

        List<WebElement> options = select.getOptions();// returns all options of the dropdownbox as List

        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        System.out.println(select.getFirstSelectedOption().getText());  // returns the default selected option

        // Choose 50,000

        Select dropdownBox2 = new Select(driver.findElement(By.id("max_price")));

        System.out.println(dropdownBox2.getFirstSelectedOption().getText());  // returns the default selected option

        dropdownBox2.selectByIndex(9);  // zero-based index


        //Click next

        driver.findElement(By.xpath("//button[.='Next']")).click();


        // Select class and its methods can only be used with elements that are created with <select> tag

        // If the dropdown box is not created with <select> tag, you handle it just like every other element on the page




    }
}
