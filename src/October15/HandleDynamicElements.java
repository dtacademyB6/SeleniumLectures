package October15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicElements {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

         // To handle dynamic elements, we need to figure out which part of the attribute value is changing

        //div[@class='FPdoLc lJ9FBc']//input[starts-with(@data-ved, '0ahUKEw')][not( @id )]


        //Input element whose data-ved attribute ends with 'QnRsIDg' string

        //input[ends-with(@data-ved, 'QnRsIDg')]



        //Input element whose data-ved attribute contains 'QnRsIDg' string

        //input[contains(@data-ved, 'QnRsIDg')]



        // If nothing else works absolute xpath could be used as a last resort

        //     /html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[2]


        // Predicates in Xpath

        //div[@class='L3eUgb']/div[5]  -> will locate the 5th div out of matching 5


    //    (//input[@class='gNO89b'])[2] -> will locate the second element matching that entire xpath expression









    }
}
