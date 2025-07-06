package pages;

import org.example.Utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class AchiveAllBooks extends BaseClass {

    //Pages
    /**
     * Pronadji i klikni na Advance search metoda
     */


    public  void kliniNaAdvanceSearch(){

        String cssSelectorForHost1 = "app-root";
        String cssSelectorForHost2 = "collection-page";
        String cssSelectorForHost3 = "collection-search-input";
        waitImplicit(300);
        SearchContext shadow0 = driver.findElement(By.cssSelector("app-root")).getShadowRoot();
        waitImplicit(300);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("collection-page")).getShadowRoot();
        waitImplicit(300);
        SearchContext shadow2 = shadow1.findElement(By.cssSelector("collection-search-input")).getShadowRoot();
        waitImplicit(300);
        shadow2.findElement(By.cssSelector("#advanced-search-link")).click();
    }




}
