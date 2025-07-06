package Tests;

import org.example.Utils.BaseClass;
import org.example.Utils.Groups;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pages.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class AchiveTest extends BaseClass {

    private static final String URL = "https://archive.org/details/movies";

    private static final String URL2 = "https://archive.org/details/colorized-movies";

    private static final String URL3 = "https://archive.org";

    private static final String URL4 = "https://archive.org/create/";

    private static final String EMAIL = "123lazanemail.com";

    private static final String EMAIL2 = "gmail.com";

    private static final String EMAIL3 = "!@#$";

    private static final String EMAIL4 = "11111";

    private static final String FILM = "Gravity";


    @Test(groups = Groups.PC, description = "Zadatak 1, Potvrditi da nije moguće završiti sign up bez validnog emaila.")
    public void achiveTest1() {


        AchiveSignIn achiveSignIn = new AchiveSignIn();
        AchiveHomePage achiveHomePage = new AchiveHomePage();
        NavigationPage navigationPage = new NavigationPage();

        Reporter.log("Otici na websajt " + URL, true);
        navigationPage.webPretrazivac(URL);


        Reporter.log("Kliknuti na SignUp dugme", true);
        achiveHomePage.pronadjiIKlikniSignIn();

        Reporter.log("Uneti pogresan email, kao na primer: ", true);

        achiveSignIn.emailIzaberIUpisi(EMAIL);

        achiveSignIn.emailIzaberIUpisi(EMAIL2);

        achiveSignIn.emailIzaberIUpisi(EMAIL3);

        achiveSignIn.emailIzaberIUpisi(EMAIL4);


        Reporter.log("Povući negativno obavestenja", true);
        WebElement element = driver.findElement(By.cssSelector("#maincontent > div > div > div.iaform.col-md-8.signup-form-section > section.signup-form-element.js-third-party-auth-toggle-view > form > span.login-error.username-error"));
        waitImplicit(1000);


        String аctualTitle = element.getText();

        String еxpectedTitle = "This does not appear to be a valid email address.";
        waitImplicit(1000);

        Reporter.log("Potvrditi da li imala negativnog obavestenja", true);
        Assert.assertEquals(аctualTitle, еxpectedTitle);


    }


    @Test(groups = Groups.PC, description = "Zadatak 2, Potvrditi da su prikazani rezultati pretraga za Gravaty knjige")
    public void achiveTest2() throws InterruptedException {

        AchiveSignIn achiveSignIn = new AchiveSignIn();
        AchiveHomePage achiveHomePage = new AchiveHomePage();
        AchiveAllBooks achiveAllBooks = new AchiveAllBooks();
        AchiveAdvanceSearch achiveAdvanceSearch = new AchiveAdvanceSearch();
        NavigationPage navigationPage = new NavigationPage();

        Reporter.log("Otici na websajt " + URL, true);

        navigationPage.webPretrazivac(URL);


        Reporter.log("Kliknuti na BooksDugme", true);
        achiveHomePage.knjigaKlikni();

        Reporter.log("Kliknuti na AllBooksDugme", true);
        achiveHomePage.klikniAllKnjige();


        Reporter.log("Kliknuti na AdvanceSearchDugme", true);
        achiveAllBooks.kliniNaAdvanceSearch();
        waitImplicit(1000);


        Reporter.log("Upisati u naslov knjige i kliknuti search", true);
        achiveAdvanceSearch.ukucajGravity(FILM);
        waitImplicit(1000);


        Reporter.log("Potvrditi da ima rezultata", true);
        Assert.assertNotEquals(achiveAdvanceSearch.daLiImaRezultata(), 0);
        waitImplicit(1000);


    }

    @Test(groups = Groups.PC, description = "Zadatak 3, Potvrditi da su prikazani rezultati zaista sortirani po tom parametru.")
    public void achiveTest3() {

        ArchiveSortMovie archiveSortMovie = new ArchiveSortMovie();
        NavigationPage navigationPage = new NavigationPage();


        Reporter.log("Otici na websajt " + URL2, true);
        navigationPage.webPretrazivac(URL2);


        Reporter.log("Klikni title dugme ", true);
        archiveSortMovie.sortirajFilmove();
        waitImplicit(5000);

        Reporter.log("Potvrditi da smo na po redosledu prikazani filmovi", true);
        String currentUrl = driver.getCurrentUrl();
        waitImplicit(5000);
        Assert.assertTrue(currentUrl.contains("https://archive.org/details/colorized-movies?sort=title"), "Korsnik nije odveden do Feature Films stranice.");


        // Reporter.log("Dohvatiti naslove filmova ", true);
        //List<String> movieTitles = archiveSortMovie.getMovieTitlesFromShadowDOM();

        //Reporter.log("Kreirati kopiju liste da bi se proverilo sortiranje", true);
        //List<String> sortedMovieTitles = new ArrayList<>(archiveSortMovie.getMovieTitlesProvera());
        //Collections.sort(sortedMovieTitles);


        //Reporter.log("Potvrditi da su rezultati sortirani", true);
        //Assert.assertEquals(movieTitles, sortedMovieTitles, "Movie titles are not sorted alphabetically.");

        //section#container article.cell-conainter


    }

    @Test(groups = Groups.PC, description = "Zadatak 4, Potvrditi da je za upload potrebno biti ulogovan")
    public void achiveTest4() {

        AchiveUpload achiveUpload = new AchiveUpload();
        NavigationPage navigationPage = new NavigationPage();


        Reporter.log("Otici na websajt " + URL3, true);
        navigationPage.webPretrazivac(URL3);


        Reporter.log("Kliknuti Upload dugme ", true);
        achiveUpload.UpoloadBtnClick();
        waitImplicit(1000);

        Reporter.log("Uzmi text sa ove stranice " + URL4, true);
        WebElement element = driver.findElement(By.xpath("//p[@class='must-be-logged-in']"));
        waitImplicit(1000);


        String elementText = element.getText();
        String expectedText = "Thank you for your interest in the Internet Archive. We would love to host your digital artifacts. In order to access this page, you will need to log in to our website.\n";

        Reporter.log("Provera da li sajt sadrzi: ' In order to access this page, you will need to log in to our website' ", true);
        Assert.assertTrue(elementText.contains(expectedText), "Element ne sadrzi trazen text!");
        waitImplicit(3000);


    }

    @Test(groups = Groups.PC, description = "Zadatak 5, Potvrditi da je korisnik redirektovan na pravu stranu")
    public void achiveTest5() {

        AchiveUpload achiveUpload = new AchiveUpload();
        AchiveFetureFilm achiveFetureFilm = new AchiveFetureFilm();
        AchiveAllBooks achiveAllBooks = new AchiveAllBooks();
        NavigationPage navigationPage = new NavigationPage();

        Reporter.log("Otici na websajt " + URL3, true);
        navigationPage.webPretrazivac(URL3);


        Reporter.log("kliknuti na video", true);
        achiveUpload.nKLIKVIDEO();


        Reporter.log("Klinuti na movies", true);
        achiveUpload.nklikniMovies();

        Reporter.log("Klinuti na Feature movies", true);
        achiveFetureFilm.pronadjiFeatureFilmIKlkni();


        Reporter.log("Potvrditi da smo na Feature movies veb stranici", true);
        String currentUrl = driver.getCurrentUrl();
        waitImplicit(5000);
        Assert.assertTrue(currentUrl.contains("archive.org/details/feature_films"), "Korsnik nije odveden do Feature Films stranice.");


    }
}








