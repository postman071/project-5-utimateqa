import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SingleBrowserTesting
{
    public static void main(String[] args)
    {
        String baseUrl ="https://courses.ultimateqa.com/users/sign_in";

        // Launch the Chrome Browser OR Setup Chrome Browser
        WebDriver driver = new ChromeDriver();
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
