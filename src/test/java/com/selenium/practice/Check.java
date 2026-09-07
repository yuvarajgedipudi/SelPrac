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
        Thread.sleep(300);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);");
        Thread.sleep(500);
        driver.findElement(By.linkText("Forgot password?")).click();
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0, 500);");
        Thread.sleep(500);
        driver.findElement(By.xpath("//input[@placeholder='Enter your registered email']")).sendKeys("user@premiumbank.com");
        Thread.sleep(500);
        driver.findElement(By.xpath("//button[contains(text(),'Con')]")).click();
        Thread.sleep(500);
        driver.findElement(By.id("forgot-code")).sendKeys("BANK1234");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Code')]")).click();

        WebElement rst = driver.findElement(By.xpath("//button[contains(text(),'Reset')]"));
        if(rst.isDisplayed())
        {
            Thread.sleep(1000);
            System.out.println("We are in the reset pwd page");
            Thread.sleep(1000);
            js.executeScript("arguments[0].scrollIntoView({block: 'center'});", rst);
            Thread.sleep(1000);

                if(rst.isDisplayed())
                {
                rst.click();
                Thread.sleep(1000);
                System.out.println("Clicked the reset password button successfully");

                   WebElement errMsg = driver.findElement(By.xpath("//div[contains(text(),'fields')]"));
                   if(errMsg.isDisplayed())
                   {
                       System.out.println("User clicked the reset password button without providing mandatory details");
                       js.executeScript("arguments[0].scrollIntoView({block: 'center'});", errMsg);
                   }
                }

        }
        else
        {
            System.out.println("We are not in the reset pwd page");
        }

    }
}
