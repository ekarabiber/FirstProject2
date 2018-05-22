package com.sahabt.testmaster;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BuyTheProduct {

    WebDriver webDriver;
    WebDriverWait webDriverWait;

    public BuyTheProduct(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.webDriverWait= new WebDriverWait(webDriver, 30, 150);
    }



    public void LogIn(String username, String password, String product){

        webDriver.get("https://www.hepsiburada.com/");
        webDriver.findElement(By.cssSelector(".insider-opt-in-notification-button.insider-opt-in-disallow-button")).click();
        openLoginMenu();

        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("login"))).click();
        webDriver.findElement(By.id("email")).sendKeys(username);
        webDriver.findElement(By.id("password")).sendKeys(password);
        webDriver.findElement(By.cssSelector(".btn.full.btn-login-submit")).click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("productSearch"))).click();

        Search(product);

    }

    private void openLoginMenu() {
        WebElement LogInButton = webDriver.findElement(By.id("myAccount"));
        LogInButton.click();
        Actions actions = new Actions(webDriver);
        actions.moveToElement(LogInButton).build().perform();
    }

    public void Search (String product){

        webDriver.findElement(By.id("productSearch")).sendKeys(product);
        webDriver.findElement(By.id("buttonProductSearch")).click();
        webDriver.findElement(By.cssSelector(".product-image.owl-lazy")).click();

        String productValue= webDriver.findElement(By.id("offering-price")).getText();

        webDriver.findElement(By.id("addToCart")).click();
        webDriver.findElements(By.cssSelector(".btn.btn-primary.full")).get(0).click();
 //       List<WebElement> price = webDriver.findElements(By.cssSelector(".total-price"));
  //      String realValue = price.get(0).getText();

//        String realValue = webDriver.findElement(By.xpath("//*[@id='short-summary']/div[1]/div[1]/div")).getText();
       // webDriver.findElements(By.cssSelector(".btn.btn-primary.full")).get(0).click();



/*

        if (productValue.equals(realValue)){
            System.out.println("Values are equal.");
        }
        else {
            System.out.println("Values are unequal");
            System.out.println(productValue);
            System.out.println(realValue);
        }
*/
    }
}
