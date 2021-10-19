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

//4. Click on Order link

        driver.findElement(By.linkText("Order")).click();

// 5. Enter a random product quantity between 1 and 100

        int random = (1 + (int) (Math.random() * 100));
        String str = new String(String.valueOf(random));
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys(str);
        driver.findElement(By.className("btn_dark")).click();

//6.  Click on Calculate and verify that the Total value is correct.

        if ( random < 10 ) {
            int totalValue = random * 100;
            String str1 = new String(String.valueOf(totalValue));
            driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtTotal")).equals(str1);

        } else {
            int totalValue = (int) (random * 100 * 0.08);
            String str1 = new String(String.valueOf(totalValue));
            driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtTotal")).equals(str1);
        }

// 7. Generate and enter random first name and last name.
        String[] firstName = new String[]{"Adam", "Alex", "Aaron", "Ben", " Paul", "Anna", "Betty", "Emilia", "Natalia", "Carlina"};
        String[] lastName = new String[]{"Smith", "Novak", "Rudy", "Vo", "Nixon", "Obama", "Clinton", "Trump", "Walesa", "Biden"};
        String firstName1 = firstName[new Random().nextInt(firstName.length)];
        String lastName1 = lastName[new Random().nextInt(lastName.length)];
        String fullName = firstName1 + " " + lastName1;

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys(fullName);

// 8. Generate and Enter random street address

        String num1 = "0123456789";
        Random random1 = new Random();
        String str2 = "";
        for (int i = 0; i < 4; i++) {
            int randomIndex1 = random1.nextInt(num1.length());
            str2 += (num1.charAt(randomIndex1));
        }

        String[] street = new String[]{"New York Ave", "Dayspring", "18th Street NW", "14th Street", "U street", "Beach Drive", "H Street", "Minnesota Ave", "Salem Street", "Memorial Drive"};
        String streetName = street[new Random().nextInt(lastName.length)];
        String address = str2 + " " + streetName;
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys(address);

//9. Generate and Enter random city

        String[] city = new String[]{"Washington DC", "Los Angeles", "New York", "Boston", "Newark", "Chicago", "Denver", "Houston", "Seattle", "Detroit"};
        String cityName = city[new Random().nextInt(lastName.length)];
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys(cityName);

//10. Generate and Enter random state

        String[] state = new String[]{"DC", "VA", "NY", "MA", "NJ", "IL", "CA", "CO", "AZ", "TX"};
        String stateName = city[new Random().nextInt(lastName.length)];
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys(stateName);

//11.Generate and Enter a random 5 digit zip code
        String num = "0123456789";
        Random random3 = new Random();
        String str4 = "";
        for (int i = 0; i < 5; i++) {
            int randomIndex1 = random3.nextInt(num.length());
            str4 += (num.charAt(randomIndex1));
        }
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys(str4);

//12.Select the card type randomly. On each run your script should select a random type.

        List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[type='radio']"));

        int randomNo = (int) (Math.random() * radioButtons.size());

        radioButtons.get(randomNo).click();

// 13. Generate and enter the random card number
        String num2 = "0123456789";
        String MasterCard = "";
        String Visa = "";
        String AMEX = "";
        if ( randomNo == 0 ) {
            for (int i = 0; i < 16; i++) {
                Random random5 = new Random();
                int randomIndex1 = random5.nextInt(num.length());
                Visa += (num.charAt(randomIndex1));}
            String cardVisa = "4" + Visa;
            driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys(cardVisa);
        } else if ( randomNo == 1 ) {
            for (int i = 0; i < 16; i++) {
                Random random6 = new Random();
                int randomIndex1 = random6.nextInt(num.length());
                MasterCard += (num.charAt(randomIndex1));}
            String cardMaterCard = "5" + MasterCard;
            driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys(cardMaterCard );
        } else if ( randomNo == 2 ) {
            for (int i = 0; i < 14; i++) {
                Random random7 = new Random();
                int randomIndex1 = random7.nextInt(num.length());
                AMEX += (num.charAt(randomIndex1));}
            String cardAMEX = "3" + AMEX;
            driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys(cardAMEX);
        }

// 14. Enter a valid expiration date (newer than the current date)

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("11/22");

//15.Click on Process

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
//16.Verify that “New order has been successfully added” message appeared on the page.

        String expectedText = "New order has been successfully added";

        String pageSource = driver.getPageSource();

        assertTrue(pageSource.contains(expectedText));




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
