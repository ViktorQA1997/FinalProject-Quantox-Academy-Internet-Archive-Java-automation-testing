package pages;

import org.example.Utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class AchiveAdvanceSearch extends BaseClass {

    /**
     *
     * Ukucaj knjigu u Title textBox-u
     */

    public void ukucajGravity(String book){

        WebElement el = driver.findElement(By.xpath("//input[@name='title_query']"));
        el.sendKeys(book);
        waitImplicit(1000);

        WebElement el2 =driver.findElement(By.xpath("//form[@id='searchForm']//input[@value='Search']"));
        el2.click();
        waitImplicit(1000);
    }

    /**
     *
     * Proveri da li ima rezultata na stranici
     */

    public int daLiImaRezultata(){

        String cssSelectorForHost1 = "app-root";
        String cssSelectorForHost2 = "search-page";
        String cssSelectorForHost3 = "collection-browser[searchcontext='collection-browser']";
        waitImplicit(500);
        SearchContext shadow0 = driver.findElement(By.cssSelector("app-root")).getShadowRoot();
        waitImplicit(500);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("search-page")).getShadowRoot();
        waitImplicit(500);
        SearchContext shadow2 = shadow1.findElement(By.cssSelector("collection-browser[searchcontext='collection-browser']")).getShadowRoot();
        waitImplicit(500);

        String resultsText = shadow2.findElement(By.cssSelector("#big-results-count")).getText();

        //konvertovanje String elementa u int
        String numericText = resultsText.replaceAll("[^0-9]", "");  // This removes everything except digits

        int resultCount = Integer.parseInt(numericText);


        return resultCount;
    }


    }




