package org.example;
//importing org.openqa.selenium to use method by
import org.openqa.selenium.By;
//importing org.openqa.selenium.WebDriver Package
import org.openqa.selenium.WebDriver;
//importing org.openqa.selenium.chrome.ChromeDriver Package
import org.openqa.selenium.chrome.ChromeDriver;

public class Products
{   //imported selenium WebDriver interface using  Maven dependency to perform automation task
    protected static WebDriver driver;
    //main method
    public static void main(String[] args)
    {    //set the driver path for Chrome browser
        System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/chromedriver.exe");
         //create driver object for Chrome browser
        driver = new ChromeDriver();
         //to maximize window interface of the driver class
        driver.manage() . window() .maximize();
         //get the URL of the page
        driver.get("https://demo.nopcommerce.com/");
        //finding a location of Computer by Xpath through clicking on Computer
        driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[1]/a")).click();
        //finding a location of Computer by Xpath through clicking on Desktops
        driver.findElement(By.xpath("//ul[@class=\"sublist\"]/li[1]/a")).click();
        //returns text 1 of the element
        String textMsg1 = driver.findElement(By.xpath("//div[@class=\"details\"]/h2/a[@href=\"/build-your-own-computer\"]")).getText();
        //Print Text message 1
        System.out.println(" Product 1 " + textMsg1);
        //returns text 2 of the element
        String textMsg2= driver.findElement(By.xpath("//div[@class=\"details\"]/h2/a[@href=\"/digital-storm-vanquish-3-custom-performance-pc\"]")).getText();
        //Print Text message 2
        System.out.println(" Product 2 " + textMsg2);
        //returns text 3 of the element
        String textMsg3= driver.findElement(By.xpath("//div[@class=\"details\"]/h2/a[@href=\"/lenovo-ideacentre-600-all-in-one-pc\"]")).getText();
        //Print Text message 3
        System.out.println(" Product 3 " + textMsg3);
        //closing the opened URL page
        driver.quit();
    }
}

