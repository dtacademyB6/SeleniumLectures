package October15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");



        // Example of absolute CSS Selector path
       // html>body>form>div.login>input[type='submit']
//        or
    //html body form div.login input[type='submit']


//      Xpath:   //input[@type='submit']
//      CSS:     input[type='submit']

//        multiple attributes -> input[type='submit'][name='ctl00$MainContent$login_button']

        // input element with class 'button'  -> input.button
        // any element with class 'button'  -> .button

        // span element with id 'ctl00_MainContent_status' -> span#ctl00_MainContent_status
        // element with id 'ctl00_MainContent_status'  ->   #ctl00_MainContent_status

//        driver.findElement(By.cssSelector("input[type='submit']")).click();

        driver.findElement(By.cssSelector(".button")).click();


        // 2 Disadvantages of CSS Selectors over Xpath:
           // 1. CSS can only traverse forward within DOM hierarchy, cannot go backwards like Xpath
            // for example, with xpath we can locate a parent by first locating its child then traverse backwards
           // 2. CSS cannot locate an element by its visible text like Xpath

          // But CSS has 2 advantages over Xpath:
            // 1. It is faster than Xpath because it is native to browser
            // 2. Not all browsers might support Xpath fully or some of the Xpath methods might not work in
             // certain browsers (ends with() method did not work in Chrome) whereas all CSS Selector mechanisms work in all browsers




    }
}
