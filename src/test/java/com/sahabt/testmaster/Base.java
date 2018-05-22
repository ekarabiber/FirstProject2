package com.sahabt.testmaster;

import org.openqa.selenium.WebDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Base {


    public WebDriver webDriver;


        @Before
        public void beforeCreateDriver(){
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            System.setProperty("webdriver.chrome.webDriver",
                    "/Users/edakarabiber/FirstProject/chromedriver"); // chromedriver.exe nin yolunu belirttik


            webDriver = new ChromeDriver();

            webDriver.manage().window().maximize();
        }



        @After
        public void afterCreateDriver(){

            //driver.quit();
        }
    }
