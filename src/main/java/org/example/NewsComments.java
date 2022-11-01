package org.example;
//importing org.openqa.selenium to use method by
import org.openqa.selenium.By;
//importing org.openqa.selenium.WebDriver Package
import org.openqa.selenium.WebDriver;
//importing org.openqa.selenium.chrome.ChromeDriver Package
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsComments
{   //imported selenium WebDriver interface using  Maven dependency to perform automation task
    protected static WebDriver driver;
    //main method
    public static void main(String[] args)
    {   //set the driver path for Chrome browser
        System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/chromedriver.exe");
        //create driver object for Chrome browser
        driver = new ChromeDriver();
        //to maximize window interface of the driver class
        driver.manage() . window() .maximize();
        //get the URL of the page
        driver.get("https://demo.nopcommerce.com/");
        //finding a location of news button by xpath click on the news button
        driver.findElement(By.xpath("//div[@class=\"news-items\"]/div[2]/div[3]/a")).click();
        //finding a location of Tittle Text field by id and send value
        driver.findElement(By.id("AddNewComment_CommentTitle")).sendKeys("New products");
        //finding a location of Comment Text field  by id and send value
        driver.findElement(By.id("AddNewComment_CommentText")).sendKeys("New products will be added");
        //click on NEW COMMENT button
        driver.findElement(By.className("buttons")).click();
        //returns text of the element
        String newsMsg= driver.findElement(By.className("result")).getText();
        //Print news message
        System.out.println(newsMsg);
        //closing the opened URL page
        driver.quit();
    }
}