import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTesting
{
    static String browser = "Chrome";

    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

    static WebDriver driver;          // Driver Declaration or Global Declaration

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();

        } else {
            System.out.println("Wrong Browser name");
        }

        // Open URL into Browser
        driver.get(baseUrl);
        // Maximise Browser
        driver.manage().window().maximize();
        // We give Implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Print the Current URl
        System.out.println("Current URL :" +driver.getCurrentUrl());
        //Print the Title of the page
        String Title= driver.getTitle();
        System.out.println("Print The Title :" +Title);
        //Print the page source
        String pageSource= driver.getPageSource();
        System.out.println("Page Source" +driver.getPageSource());
        // Enter the Email to Email Field
        driver.findElement(By.name("user[email]")).sendKeys("Prime123@gmail.com");
        // Enter the Password to PasswordField
        driver.findElement(By.id("user[password]")).sendKeys("prime1234");
        //Close the Browser
        driver.close();
    }
}
