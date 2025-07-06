package pages;

import org.example.Utils.BaseClass;
import org.openqa.selenium.*;

public class AchiveHomePage extends BaseClass {


//Pages+Actions

    /**
     * Pronadji i klikni na SignUP button
     *
     */

    public void pronadjiIKlikniSignIn() {


        WebElement element = driver.findElement(By.cssSelector("body > app-root"));
        SearchContext shadow1 = element.getShadowRoot();
        waitImplicit(300);

        WebElement element2 = shadow1.findElement(By.cssSelector("header > ia-topnav"));
        SearchContext shadow2 = element2.getShadowRoot();
        waitImplicit(300);


        WebElement element3 = shadow2.findElement(By.cssSelector("div.topnav > primary-nav"));
        SearchContext shadow3 = element3.getShadowRoot();
        waitImplicit(300);


        WebElement element4 = shadow3.findElement(By.cssSelector("nav > div.right-side-section > div > login-button"));
        SearchContext shadow4 = element4.getShadowRoot();
        waitImplicit(300);


        WebElement element5 = shadow4.findElement(By.cssSelector("div > span > a:nth-child(1)"));
        element5.click();
        waitImplicit(300);

    }

    /**
     * Pronadji i klikni na Books, nije u funkciji
     *
     */



    public  void knjigaKlikni(){

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Navigating through multiple shadow roots

        // First shadow host
        SearchContext shadow0 = driver.findElement(By.cssSelector("app-root")).getShadowRoot();
        waitImplicit(1000);

        // Second shadow host
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("ia-topnav[locallinks='true']")).getShadowRoot();
        waitImplicit(1000);

        // Third shadow host
        SearchContext shadow2 = shadow1.findElement(By.cssSelector("primary-nav")).getShadowRoot();
        waitImplicit(1000);

        // Fourth shadow host
        SearchContext shadow3 = shadow2.findElement(By.cssSelector("media-menu[tabindex='-1']")).getShadowRoot();
        waitImplicit(1000);

        // Fifth shadow host
        SearchContext shadow4 = shadow3.findElement(By.cssSelector("media-button[data-mediatype='texts']")).getShadowRoot();
        waitImplicit(1000);

        // Locate and click the final element inside shadow DOM
        WebElement finalElement = shadow4.findElement(By.cssSelector(".menu-item.texts"));

        // Execute a click using JavaScriptExecutor, as regular click may fail in shadow DOM
        js.executeScript("arguments[0].click();", finalElement);


    }

    /**
     * Pronadji i klikni na AllBooks, nije u funkciji
     *
     */


    public void klikniAllKnjige(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Navigating through multiple shadow roots

        // First shadow host
        SearchContext shadow0 = driver.findElement(By.cssSelector("app-root")).getShadowRoot();
        waitImplicit(1000);

        // Second shadow host
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("ia-topnav[locallinks='true']")).getShadowRoot();
        waitImplicit(1000);

        // Third shadow host
        SearchContext shadow2 = shadow1.findElement(By.cssSelector("media-slider")).getShadowRoot();
        waitImplicit(1000);

        // Fourth shadow host
        SearchContext shadow3 = shadow2.findElement(By.cssSelector("media-subnav[menu='texts']")).getShadowRoot();
        waitImplicit(1000);


        // Locate and click the final element inside shadow DOM
        WebElement finalElement = shadow3.findElement(By.cssSelector("a[href='/details/books']"));
        waitImplicit(1000);


        // Execute a click using JavaScriptExecutor, as regular click may fail in shadow DOM
        js.executeScript("arguments[0].click();", finalElement);

    }

}








