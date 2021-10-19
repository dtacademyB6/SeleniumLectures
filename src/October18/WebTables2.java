package October18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class WebTables2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //
// 2. Navigate to http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
//3. Login using username Tester and password test

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();

         // Logic to create an order here...



        driver.findElement(By.linkText("View all orders")).click();

        List<WebElement> tds = driver.findElements(By.xpath("//table[@id]//tbody//tr[2]//td"));

        List<String> actualList = getText(tds);

        System.out.println(actualList);


        System.out.println(getTableData(3, 5, driver));


        // Get the table row size and column size
        // Access the header row and grab its elements in a list and get the size of the list
        int columnNo = driver.findElements(By.xpath("//table[@id]//tbody//tr[1]//th")).size();
        System.out.println(columnNo);

        int rowNo = driver.findElements(By.xpath("//table[@id]//tbody//tr")).size();
        System.out.println(rowNo);


        for (int i = 2; i <= rowNo; i++) {
            for (int j = 1; j <= columnNo; j++) {
                String xpath = "//table[@id]//tbody//tr["+i+"]//td["+j+"]";

                System.out.print(driver.findElement(By.xpath(xpath)).getText() + "\t");
            }

            System.out.println();

        }


    }


    public static List<String> getText(List<WebElement> list){
        List<String> actual = new ArrayList<>();

        for (WebElement element : list) {
            String text = element.getText();
            if(!text.isEmpty()){
                actual.add(text) ;
            }

        }

        return actual;
    }



    public static String getTableData(int tableRow, int colNo, WebDriver driver ){

        String xpath = "//table[@id]//tbody//tr["+tableRow+"]//td["+colNo+"]";
        WebElement element = driver.findElement(By.xpath(xpath));

         return element.getText();
    }
}
