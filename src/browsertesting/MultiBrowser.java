package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {
    static String browser = "Chrome";

    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if(browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new FirefoxDriver();
        }else{
            System.out.println("Wrong Browser name");
        }
        String baseUrl = "http://the-internet.herokuapp.com/login";

        //Launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        //Open the URL into browser
        driver.get(baseUrl);
        //maximize the window
        driver.manage().window().maximize();
        //We give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of page
        String title = driver.getTitle();
        //printing statement
        System.out.println(title);

        //Get the current url
        System.out.println("Current URL:" +driver.getCurrentUrl());

        //Get page source
        System.out.println("Page source:" + driver.getPageSource());

        //Find username field element
        driver.findElement(By.id("username")).sendKeys("saishina");

        //Find password field element
        driver.findElement(By.id("password")).sendKeys("123patel");

        driver.close();

    }

}
