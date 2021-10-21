package October18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTables3 {


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


        List<WebElement> prices = driver.findElements(By.xpath("//table[@class='lcw-table layout-fixed']//tbody//tr//td[3]"));


        List<String> text = getText(prices);


        double total = 0;
        for (String s : text) {
            s = s.replace("$", "");
           total += Double.parseDouble(s);
            System.out.println(s);
        }

        System.out.println("Average price of top 50 coins: " + total/text.size());


        // Find the top performer (with top percent gain) and print its name

        List<WebElement> percentages = driver.findElements(By.xpath("//table[@class='lcw-table layout-fixed']//tbody//tr//td[8]"));

        // Extract the text and add to a list of doubles

        List<Double> percentagesDouble = new ArrayList<>();

        for (WebElement element : percentages) {
            String percentage = element.getText().replace("%", "");
            percentagesDouble.add(Double.parseDouble(percentage)) ;


        }


        System.out.println(percentagesDouble);

        Collections.sort(percentagesDouble);

        System.out.println("The top performing percentage: "  + Collections.max(percentagesDouble));

        // The top 3 performers

        System.out.println("The top 3  performing percentage: "  +percentagesDouble.subList(percentagesDouble.size()-3, percentagesDouble.size()));




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
