package October18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTables4 {


    public static void main(String[] args) throws InterruptedException {


//        System.out.println();
//
//        LocalDate date = LocalDate.now();
//
//        System.out.println(date.toString());
//
//        System.out.println(date.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));

//        LocalDate, LocalDateTime, ZonedDateTime


         // Extract all prices (which are dynamic)  and get the average of all prices



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("https://www.livecoinwatch.com/");

        Thread.sleep(2000);

        int cols = driver.findElements(By.xpath("//table[@class='lcw-table layout-fixed']//thead//tr//th")).size();

        int rows =  driver.findElements(By.xpath("//table[@class='lcw-table layout-fixed']//tbody//tr")).size();


        for (int i = 1; i <=rows ; i++) {

            for (int j = 1; j <= cols; j++) {

                System.out.print(driver.findElement(By.xpath("//table[@class='lcw-table layout-fixed']//tbody//tr["+i+"]//td["+j+"]")).getText()+ "\t");

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
}
