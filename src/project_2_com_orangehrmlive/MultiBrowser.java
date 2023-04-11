package project_2_com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {

    static String browser="FireFox";
    static String baseUrl ="https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")){
            driver= new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver= new EdgeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver= new FirefoxDriver();
        }else {
            System.out.println("Wrong Browser name");
        }

        driver.get(baseUrl);// open the URL
        // Get the title of the page
        driver.manage().window().maximize();// Maximise the browser
        // give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title= driver.getTitle();
        System.out.println(title);
        //Get and print the Current Url
        System.out.println("Current URL : " + driver.getCurrentUrl());
        // Get and Print page source
        System.out.println("Page source: " + driver.getPageSource());
        // find the email element and enter the email to email field
        driver.findElement(By.name("username")).sendKeys("prime123@gmail.com");
        // find and enter the password to password field
        driver.findElement(By.name("password")).sendKeys("Prime123");

        //close the Browser
        driver.close();

    }


}
