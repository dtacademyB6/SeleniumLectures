package October18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WebTables1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();


        driver.findElement(By.linkText("View all products")).click();

        // Verify column names

        List<String> expectedNames = Arrays.asList("Product name", "Price", "Discount");

        List<WebElement> elements = driver.findElements(By.xpath("//table[@class='ProductsTable']//tbody//tr[1]//th"));

        List<String> actualNames = getText(elements);



        Assert.assertEquals(actualNames, expectedNames);

        List<String> expectedProducts = Arrays.asList("MyMoney", "FamilyAlbum", "ScreenSaver");

        // Verify Product names in first column

        List<WebElement> elements1 = driver.findElements(By.xpath("//table[@class='ProductsTable']//tbody//tr//td[1]"));


        List<String> actualProducts = getText(elements1);


        Assert.assertEquals(actualProducts, expectedProducts);


    }


    public static List<String> getText(List<WebElement> list){
        List<String> actual = new ArrayList<>();

        for (WebElement element : list) {
            actual.add(element.getText()) ;
        }

        return actual;
    }
}
