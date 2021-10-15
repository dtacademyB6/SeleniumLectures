package October15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingParentChildSiblings {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");



        //div[@data-w-id='6ece7d70-83a5-6ab9-85ca-d3b52d1df6a5']//div[@class='service-simple-info']

        // Locate the unique parent and from there locate the non-unique child

        System.out.println(driver.findElement(By.xpath("//div[@data-w-id='6ece7d70-83a5-6ab9-85ca-d3b52d1df6a5']//div[@class='service-simple-info']")).getText());


        // Locate the unique child first and find its immediate non-unique parent

        //h6[.='Solid Income']//parent::div

        System.out.println(driver.findElement(By.xpath("//h6[.='Solid Income']//parent::div")).getText());


        // Locate the unique child first and find its any non-unique ancestor

        //h6[.='Solid Income']//ancestor::div[@class='wrapper w-container']


        //Locate the unique sibling first and then locate its following non-unique sibling
        //div[@data-w-id='6ece7d70-83a5-6ab9-85ca-d3b52d1df6a5']/following-sibling::div


        //Locate the unique sibling first and then locate its preceding non-unique sibling
        //div[@data-w-id='c339b283-03ea-c60c-bb22-0601a49dde47']/preceding-sibling::div[1]







    }
}
