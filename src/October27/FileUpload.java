package October27;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver1.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("https://duonotary.com/online");

        WebElement element = driver.findElement(By.xpath("//div[.='Schedule']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);

        driver.findElement(By.id("documentOnline")).sendKeys("C:\\Users\\Nuclues\\Documents\\StepsNotes.pdf");



        driver.get("https://www.filemail.com/share/upload-file");

        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Nuclues\\Documents\\StepsNotes.pdf");


        driver.get(" https://easyupload.io/");


//        WebElement element1 = driver.findElement(By.xpath("//input[@type='file']"));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].click()", element1);

//        .sendKeys("C:\\Users\\Nuclues\\Documents\\StepsNotes.pdf");


        driver.get("https://unsplash.com/images");

        WebElement element2 = driver.findElement(By.xpath("//a[@href='https://unsplash.com/photos/bj5-MDtfNy8/download?force=true']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()", element2);



    }


}
