package pages;

import org.example.Utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class AchiveUpload extends BaseClass {


    //Pages
    /**
     * Klikni na UpoloadBtn
     */

    public void UpoloadBtnClick(){

      String cssSelectorForHost1 = "app-root";
      String cssSelectorForHost2 = "ia-topnav[locallinks='true']";
      String cssSelectorForHost3 = "primary-nav";
      waitImplicit(1000);
      SearchContext shadow0 = driver.findElement(By.cssSelector("app-root")).getShadowRoot();
      waitImplicit(1000);
      SearchContext shadow1 = shadow0.findElement(By.cssSelector("ia-topnav[locallinks='true']")).getShadowRoot();
      waitImplicit(1000);
      SearchContext shadow2 = shadow1.findElement(By.cssSelector("primary-nav")).getShadowRoot();
      waitImplicit(1000);
      shadow2.findElement(By.cssSelector(" nav:nth-child(1) > div:nth-child(2) > a:nth-child(2) > span:nth-child(2)")).click();
  }


    /**
     * Klikni na video button
     */
    public void nKLIKVIDEO(){


        //This Element is inside 4 nested shadow DOM.
        String cssSelectorForHost1 = "app-root";
        String cssSelectorForHost2 = "home-page";
        String cssSelectorForHost3 = "home-page-hero-block";
        String cssSelectorForHost4 = "home-page-hero-block-icon-bar";
        waitImplicit(1000);
        SearchContext shadow0 = driver.findElement(By.cssSelector("app-root")).getShadowRoot();
        waitImplicit(1000);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("home-page")).getShadowRoot();
        waitImplicit(1000);
        SearchContext shadow2 = shadow1.findElement(By.cssSelector("home-page-hero-block")).getShadowRoot();
        waitImplicit(1000);
        SearchContext shadow3 = shadow2.findElement(By.cssSelector("home-page-hero-block-icon-bar")).getShadowRoot();
        waitImplicit(1000);

        shadow3.findElement(By.cssSelector("img[alt='Videos Image']")).click();

    }

    /**
     * Klikni na movies button
     */

    public void nklikniMovies(){

        //This Element is inside 6 nested shadow DOM.
        String cssSelectorForHost1 = "app-root";
        String cssSelectorForHost2 = "collection-page";
        String cssSelectorForHost3 = "collection-browser[searchcontext='CollectionPageBeta']";
        String cssSelectorForHost4 = ".grid";
        String cssSelectorForHost5 = " section:nth-child(1) > article:nth-child(7) > tile-dispatcher:nth-child(1)";
        String cssSelectorForHost6 = "collection-tile";
        waitImplicit(1000);
        SearchContext shadow0 = driver.findElement(By.cssSelector("app-root")).getShadowRoot();
        waitImplicit(1000);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("collection-page")).getShadowRoot();
        waitImplicit(1000);
        SearchContext shadow2 = shadow1.findElement(By.cssSelector("collection-browser[searchcontext='CollectionPageBeta']")).getShadowRoot();
        waitImplicit(1000);
        SearchContext shadow3 = shadow2.findElement(By.cssSelector(".grid")).getShadowRoot();
        waitImplicit(1000);
        SearchContext shadow4 = shadow3.findElement(By.cssSelector(" section:nth-child(1) > article:nth-child(7) > tile-dispatcher:nth-child(1)")).getShadowRoot();
        waitImplicit(1000);
        SearchContext shadow5 = shadow4.findElement(By.cssSelector("collection-tile")).getShadowRoot();
        waitImplicit(1000);
        shadow5.findElement(By.cssSelector(".tile-details")).click();


    }

    /**
     * Klikni na video button, nije u funckiji!
     */
public void klikniNaVideo(){

    JavascriptExecutor js = (JavascriptExecutor) driver;

    // Navigating through multiple shadow roots

    // First shadow host
    SearchContext shadow0 = driver.findElement(By.cssSelector("app-root")).getShadowRoot();
    waitImplicit(1000);

    // Second shadow host
    SearchContext shadow1 = shadow0.findElement(By.cssSelector("home-page")).getShadowRoot();
    waitImplicit(1000);

    // Third shadow host
    SearchContext shadow2 = shadow1.findElement(By.cssSelector("home-page-hero-block")).getShadowRoot();
    waitImplicit(1000);

    // Fourth shadow host
    SearchContext shadow3 = shadow2.findElement(By.cssSelector("home-page-hero-block-icon-bar")).getShadowRoot();
    waitImplicit(1000);

    // Locate and click the final element inside shadow DOM
    WebElement finalElement = shadow3.findElement(By.cssSelector("home-page-hero-block-icon-bar"));

    // Execute a click using JavaScriptExecutor, as regular click may fail in shadow DOM
    js.executeScript("arguments[0].click();", finalElement);;
}

    /**
     * Klikni na movies button, nije u funckiji!
     */

public void klikniNaMoives(){

    //This Element is inside 4 nested shadow DOM.
    String cssSelectorForHost1 = "app-root";
    String cssSelectorForHost2 = "ia-topnav[locallinks='true']";
    String cssSelectorForHost3 = "media-slider";
    String cssSelectorForHost4 = "media-subnav[menu='video']";
    waitImplicit(1000);
    SearchContext shadow0 = driver.findElement(By.cssSelector("app-root")).getShadowRoot();
    waitImplicit(1000);
    SearchContext shadow1 = shadow0.findElement(By.cssSelector("ia-topnav[locallinks='true']")).getShadowRoot();
    waitImplicit(1000);
    SearchContext shadow2 = shadow1.findElement(By.cssSelector("media-slider")).getShadowRoot();
    waitImplicit(1000);
    SearchContext shadow3 = shadow2.findElement(By.cssSelector("media-subnav[menu='video']")).getShadowRoot();
    waitImplicit(1000);
    shadow3.findElement(By.cssSelector("a[href='/details/moviesandfilms']")).click();
}





}
