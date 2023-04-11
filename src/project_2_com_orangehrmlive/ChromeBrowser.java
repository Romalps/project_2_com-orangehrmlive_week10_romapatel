package project_2_com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/*
Project-2 - Project Name: com-orangehrmlive
BaseUrl = https://opensource-demo.orangehrmlive.com/
1. Setup Chrome browser
2. Open URL
3. Print the title of the page
4. Print the current url
5. Print the page source
6. Enter the email to email field
7. Enter the password to password field
8. Close the browser
 */
public class ChromeBrowser {
    public static void main(String[] args) {

        String baseUrl= "https://opensource-demo.orangehrmlive.com/";
        // launch the Chrome browser
        WebDriver driver=new ChromeDriver();
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
