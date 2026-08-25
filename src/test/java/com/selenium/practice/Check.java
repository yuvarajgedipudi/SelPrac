package com.selenium.practice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class Check {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Checking");
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\ChromeDriver\\chromedriver-win64");
//        driver.get("https://www.redbus.in/");
//        driver.manage().window().maximize();
//        Thread.sleep(3000);
//        //driver.close();
//        driver.findElement(By.xpath("//input[@id='srcinput']")).sendKeys("Chennai");
//        Thread.sleep(2000);
//        Actions actions = new Actions(driver);
//        Thread.sleep(2000);
//        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
//        driver.findElement(By.id("destinput")).sendKeys("Bangalore");
//        Thread.sleep(2000);
//        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
//        Thread.sleep(2000);
//        driver.close();
//
        driver.get("https://www.qapractice.com/practice-login-form");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("login-email")).sendKeys("user@premiumbank.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Bank@123");
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);");
        Thread.sleep(1000);
        driver.findElement(By.linkText("Forgot password?")).click();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, 500);");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your registered email']")).sendKeys("user@premiumbank.com");

    }
}
