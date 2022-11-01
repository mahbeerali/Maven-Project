package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailAFriend
{   //imported inbuilt class through object
    protected static WebDriver driver;
    //main method
    public static void main(String[] args)
    {   //set the driver path for Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        //create driver object for Chrome browser
        driver = new ChromeDriver();
        // to maximize window interface of the driver class
        driver.manage().window().maximize();
        //get the URL of the page
        driver.get("https://demo.nopcommerce.com/");
        //finding a location of Apple MacBook Pro 13-inch by Xpath through clicking on picture of Apple MacBook Pro 13-inch
        driver.findElement(By.xpath("//img[@alt=\"Picture of Apple MacBook Pro 13-inch\"]")).click();
        //finding a location of Email a friend by className through clicking on Email a friend button
        driver.findElement(By.className("email-a-friend")).click();
        //enter Friend's email,finding a location of  Friend's email through inspected text field and send value
        driver.findElement(By.id("FriendEmail")).sendKeys("ami_ash@hotmail.co.uk");
        //enter your email address finding a location of  your email address through inspected text field and send value
        driver.findElement(By.id("YourEmailAddress")).sendKeys("amna333@hotmail.co.uk");
        //enter personal message,finding a location of  personal message through inspected text field and send value
        driver.findElement(By.id("PersonalMessage")).sendKeys("Pls ensure that this is right Product");
        //click on the send email button
        driver.findElement(By.className("buttons")).click();
        //returns text of the element
        String errorMsg = driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]/ul/li")).getText();
        //print error message
        System.out.println(errorMsg);
        //closing the opened URL page
        driver.quit();
    }
}