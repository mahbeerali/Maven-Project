package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class BasePage
{
    protected static WebDriver driver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/chromedriver.exe");
       String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        driver = new ChromeDriver();
        driver.manage() . window() .maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("FirstName")) . sendKeys("Rajesh");
        driver.findElement(By.id("LastName")) . sendKeys("Shurma");
        String mail= "Raj"+timeStamp+"@gmail.com";
        driver.findElement(By.id("Email")) . sendKeys("amna333@hotmail.co.uk");
        driver.findElement(By.id("Password")) . sendKeys("London123@");
        driver.findElement(By.id("ConfirmPassword")) . sendKeys("London123@");
        driver.findElement(By.id("register-buton")) . click();
        String regMsg = driver. findElement(By.className("result")).getText();
        System.out.println(regMsg);
        driver.quit();
    }
}
