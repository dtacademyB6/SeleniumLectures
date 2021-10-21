package October18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumBot {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://calendly.com/springfielddmv/select?month=2021-10");

        //Put the logic of finding the available date
        // Check for an available date
        while(driver.getPageSource().contains("No times in")){
             driver.navigate().refresh();
             Thread.sleep(1000);
        }






//        driver.findElement(By.xpath("//button[@class='calendar-no-dates-button Uf1MKh1Q3O1Uzwrqh6Oy Yx8izD25pNAoNG8f4x5s hMiAmnd8_2LxqhtwE6su _pLSoeS2RcFZJ80Juxld']")).click();


        driver.findElement(By.xpath("//button[@class='dORcH76IWOcaq0zJjqqN CZsCj9L7B9FuntoTiyQI GITQRzvyzVQV8MXGcE5F Uf1MKh1Q3O1Uzwrqh6Oy Yx8izD25pNAoNG8f4x5s hMiAmnd8_2LxqhtwE6su _pLSoeS2RcFZJ80Juxld']")).click();

        driver.findElement(By.xpath("//div[@class='M_m3xxlyPSNgpGbYq0tJ CAhnIEr6_hAUIvxQL5SK']//div")).click();

        driver.findElement(By.xpath("//button[.='Confirm']")).click();


        driver.findElement(By.name("first_name")).sendKeys("Donald");
        driver.findElement(By.name("last_name")).sendKeys("Duck");
        driver.findElement(By.name("email")).sendKeys("donaldduck@gmail.com");
        driver.findElement(By.name("question_0")).sendKeys("2021112345");
        driver.findElement(By.name("question_1")).sendKeys("Registration renewal");

        driver.findElement(By.xpath("//div[.='Schedule Event']")).click();




    }
}
