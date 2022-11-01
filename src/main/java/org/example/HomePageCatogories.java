package org.example;
//importing org.openqa.selenium to use method by
import org.openqa.selenium.By;
//importing org.openqa.selenium.WebDriver Package
import org.openqa.selenium.WebDriver;
//importing org.openqa.selenium.chrome.ChromeDriver Package
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageCatogories
{
    //imported selenium WebDriver interface using  Maven dependency to perform automation task
    protected static WebDriver driver;
    //main method
    public static void main(String[] args)
    {   //set the driver path for Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        //create driver object for Chrome browser
        driver = new ChromeDriver();
        //to maximize window interface of the driver class
        driver.manage().window().maximize();
        //get the URL of the page
        driver.get("https://demo.nopcommerce.com/");
        //returns Category 1 of the element
        String category1 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[1]/a[@href=\"/computers\"]")).getText();
        //returns Category 2 of the element
        String category2 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[2]/a")).getText();
        //returns Category 3 of the element
        String category3 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[3]/a")).getText();
        //returns Category 4 of the element
        String category4 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[4]/a")).getText();
        //returns Category 5 of the element
        String category5 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[5]/a")).getText();
        //returns Category 6 of the element
        String category6 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[6]/a")).getText();
        //returns Category 7 of the element
        String category7 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[7]/a")).getText();
        //Print Category 1
        System.out.println(" Product 1 "+ category1);
        ////Print Category 2
        System.out.println(" Product 2 " + category2);
        //Print Category 3
        System.out.println(" Product 3 " + category3);
        //Print Category 4
        System.out.println(" Product 4 " + category4);
        //Print Category 5
        System.out.println(" Product 5 " + category5);
        //Print Category 6
        System.out.println(" Product 6 " + category6);
        //Print Category 7
        System.out.println(" Product 7 " + category7);
        driver.quit();
    }
}


