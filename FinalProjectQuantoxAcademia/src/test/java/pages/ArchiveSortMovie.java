package pages;

import org.example.Utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ArchiveSortMovie extends BaseClass {


    public void sortirajFilmove() {

        //This Element is inside 4 nested shadow DOM.
        String cssSelectorForHost1 = "app-root";
        String cssSelectorForHost2 = "collection-page";
        String cssSelectorForHost3 = "collection-browser[searchcontext='CollectionPageBeta']";
        String cssSelectorForHost4 = "sort-filter-bar";
        waitImplicit(1000);
        SearchContext shadow0 = driver.findElement(By.cssSelector("app-root")).getShadowRoot();
        waitImplicit(1000);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("collection-page")).getShadowRoot();
        waitImplicit(1000);
        SearchContext shadow2 = shadow1.findElement(By.cssSelector("collection-browser[searchcontext='CollectionPageBeta']")).getShadowRoot();
        waitImplicit(1000);
        SearchContext shadow3 = shadow2.findElement(By.cssSelector("sort-filter-bar")).getShadowRoot();
        waitImplicit(1000);
        shadow3.findElement(By.cssSelector("button[data-title='Title']")).click();

    }

    /**
     * Provera metode sa list, nije u funkciji
     * @return
     */

    public List<String> getMovieTitlesFromShadowDOM() {


        By movieItemLocator = By.cssSelector(".tile-details");

        JavascriptExecutor js = (JavascriptExecutor) driver;

//This Element is inside 6 nested shadow DOM.
        String cssSelectorForHost1 = "app-root";
        String cssSelectorForHost2 = "collection-page";
        String cssSelectorForHost3 = "collection-browser[searchcontext='CollectionPageBeta']";
        String cssSelectorForHost4 = ".grid";
        String cssSelectorForHost5 = " section:nth-child(1) > article:nth-child(2) > tile-dispatcher:nth-child(1)";
        String cssSelectorForHost6 = "item-tile";
        waitImplicit(1000);

        SearchContext shadow0 = driver.findElement(By.cssSelector("app-root")).getShadowRoot();
        waitImplicit(1000);

        SearchContext shadow1 = shadow0.findElement(By.cssSelector("collection-page")).getShadowRoot();
        waitImplicit(1000);

        SearchContext shadow2 = shadow1.findElement(By.cssSelector("collection-browser[searchcontext='CollectionPageBeta']")).getShadowRoot();
        waitImplicit(1000);

        SearchContext shadow3 = shadow2.findElement(By.cssSelector(".grid")).getShadowRoot();
        waitImplicit(1000);

        SearchContext shadow4 = shadow3.findElement(By.cssSelector(" section:nth-child(1) > article:nth-child(2) > tile-dispatcher:nth-child(1)")).getShadowRoot();
        waitImplicit(1000);

        SearchContext shadow5 = shadow4.findElement(By.cssSelector("item-tile")).getShadowRoot();
        waitImplicit(1000);

        //shadow5.findElement(By.cssSelector("h4[title='12 to the Moon (1960) colorized (Ken Clark)']"));

        // Dohvatiti sve filmove unutar Shadow DOM-a
        List<WebElement> movieElements = (List<WebElement>) shadow5.findElement(By.cssSelector("h4[title='12 to the Moon (1960) colorized (Ken Clark)']"));

        // Lista za smeštanje naslova filmova
        List<String> movieTitles = new ArrayList<>();

        // Iterirati kroz filmove i dodati naslove u listu
        for (WebElement movie : movieElements) {
            movieTitles.add(movie.getText().trim());
        }

        return movieTitles;
    }


    /**
     * Provera liste, nije u funkciji
     * @return
     */
    public List<String> getMovieTitlesProvera() {


        By movieItemLocator = By.cssSelector(".tile-details");

        JavascriptExecutor js = (JavascriptExecutor) driver;

//This Element is inside 6 nested shadow DOM.
        String cssSelectorForHost1 = "app-root";
        String cssSelectorForHost2 = "collection-page";
        String cssSelectorForHost3 = "collection-browser[searchcontext='CollectionPageBeta']";
        String cssSelectorForHost4 = ".grid";
        String cssSelectorForHost5 = " section:nth-child(1) > article:nth-child(2) > tile-dispatcher:nth-child(1)";
        String cssSelectorForHost6 = "item-tile";
        waitImplicit(1000);

        SearchContext shadow0 = driver.findElement(By.cssSelector("app-root")).getShadowRoot();
        waitImplicit(1000);

        SearchContext shadow1 = shadow0.findElement(By.cssSelector("collection-page")).getShadowRoot();
        waitImplicit(1000);

        SearchContext shadow2 = shadow1.findElement(By.cssSelector("collection-browser[searchcontext='CollectionPageBeta']")).getShadowRoot();
        waitImplicit(1000);

        SearchContext shadow3 = shadow2.findElement(By.cssSelector(".grid")).getShadowRoot();
        waitImplicit(1000);

        SearchContext shadow4 = shadow3.findElement(By.cssSelector(" section:nth-child(1) > article:nth-child(2) > tile-dispatcher:nth-child(1)")).getShadowRoot();
        waitImplicit(1000);

        SearchContext shadow5 = shadow4.findElement(By.cssSelector("item-tile")).getShadowRoot();
        waitImplicit(1000);

        //shadow5.findElement(By.cssSelector("h4[title='12 to the Moon (1960) colorized (Ken Clark)']"));

        // Dohvatiti sve filmove unutar Shadow DOM-a
        List<WebElement> movieElements = (List<WebElement>) shadow5.findElement(By.cssSelector("h4[title='12 to the Moon (1960) colorized (Ken Clark)']"));

        // Lista za smeštanje naslova filmova
        List<String> movieTitles = new ArrayList<>();

        // Iterirati kroz filmove i dodati naslove u listu
        for (WebElement movie : movieElements) {
            movieTitles.add(movie.getText().trim());
        }

        return movieTitles;
    }



}

