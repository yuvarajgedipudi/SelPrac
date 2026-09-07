package com.selenium.practice;

import org.testng.annotations.Test;

public class LoginTest {

    @Test(priority = 1)
    public void loginTestone() {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Yuvar\\IdeaProjects\\Chromedriver\\chromedriver-win32");
    }

    @Test(priority = 2)
    public void loginTesttwo() {

        System.out.println("My first TestNG test 222");
    }

    @Test(priority = 3)
    public void loginTestthree() {

        System.out.println("My first TestNG test 333");
    }


}
