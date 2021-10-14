package October13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XpathExamples {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");


//        driver.findElement(By.xpath("/html/body/form/div[3]/input[1]")).sendKeys("Tester");

//        /html/body/form/div[3]/input[1]    - > absolute Xpath is not recommended since it can break easily

        //input[@type='text'] -> using a single attribute

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Tester");


        //input[@class='txt'][@name='ctl00$MainContent$username']  -> using multiple attributes when a single one cannot locate it uniquely

        driver.findElement(By.xpath(" //input[@class='txt'][@name='ctl00$MainContent$username']")).sendKeys("Tester");


        //input[@class]  -> matches all input elements that have an attribute called class

        //*[@id]  -> matches all elements(regardless of tag name) that have an id attribute

        List<WebElement> elementsWithID = driver.findElements(By.xpath("//*[@id]"));

        for (WebElement webElement : elementsWithID) {
            System.out.println(webElement.getAttribute("id"));
        }


        // //span[.='Invalid Login or Password.']  -> matches the span element with the exact text "Invalid Login or Password."

        //p[ contains ( text(), 'Orders sample' )] -> matches the p element that contains text "Orders sample"

        System.out.println( driver.findElement(By.xpath(" //p[ contains ( text(), 'Orders sample' )] ")).getText());

    }
}
