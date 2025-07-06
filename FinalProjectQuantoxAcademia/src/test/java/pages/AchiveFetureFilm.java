package pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.example.Utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

public class AchiveFetureFilm extends BaseClass {

    /**
     * Pornadji i klikni na FetureFilm link
     */

    public void pronadjiFeatureFilmIKlkni(){

        //This Element is inside 8 nested shadow DOM.
        String cssSelectorForHost1 = "app-root";
        String cssSelectorForHost2 = "collection-page";
        String cssSelectorForHost3 = "collection-browser[searchcontext='CollectionPageBeta']";
        String cssSelectorForHost4 = ".grid";
        String cssSelectorForHost5 = " section:nth-child(1) > article:nth-child(2) > tile-dispatcher:nth-child(1)";
        String cssSelectorForHost6 = "collection-tile";
        String cssSelectorForHost7 = "image-block";
        String cssSelectorForHost8 = "item-image";
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
        SearchContext shadow5 = shadow4.findElement(By.cssSelector("collection-tile")).getShadowRoot();
        waitImplicit(1000);
        SearchContext shadow6 = shadow5.findElement(By.cssSelector("image-block")).getShadowRoot();
        waitImplicit(1000);
        SearchContext shadow7 = shadow6.findElement(By.cssSelector("item-image")).getShadowRoot();
        waitImplicit(1000);
        shadow7.findElement(By.cssSelector(".contain.collection-image")).click();


    }
}
