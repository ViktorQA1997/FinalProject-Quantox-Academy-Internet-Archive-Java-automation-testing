package pages;

import org.example.Utils.BaseClass;
import org.example.Utils.WebElementLocator;
import org.example.Utils.WebElementLocatorFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AchiveSignIn extends BaseClass {

    //Pages

    /**
     * Pronadji emailTextBox i unesi Email
     */

    @WebElementLocator(webDesktop = "//input[contains(@class, 'input-email')]\n")
    private WebElement emailTextBox() {
        return driver.findElement(By.xpath(new WebElementLocatorFactory().getLocator(AchiveSignIn.class, "emailTextBox")));
    }

    /**
     * Pronadji userTextBox i kliknuti
     */
    @WebElementLocator(webDesktop = "//input[@name='screenname']")
    private WebElement userTextBox() {
        return driver.findElement(By.xpath(new WebElementLocatorFactory().getLocator(AchiveSignIn.class, "userTextBox")));
    }


    //Actions

    /**
     * unesi Email
     */

    public void emailIzaberIUpisi(String email) {


        scrollToElementCenter(emailTextBox());
        emailTextBox().clear();
        emailTextBox().click();
        emailTextBox().sendKeys(email);
        waitImplicit(300);

        scrollToElementCenter(userTextBox());
        userTextBox().click();
        waitImplicit(300);


    }


    /**
     * Pronadji usernameTextBox i unesi ga, nije u funkciji
     */


    public void userNameIzaberIUpisi(String userName) {

        WebElement element = driver.findElement(By.xpath("//input[contains(@class, 'input-screenname')]\n"));
        //  SearchContext shadow1 = element.getShadowRoot();
        waitImplicit(3000);

        scrollToElementCenter(element);
        element.clear();
        element.click();
        element.sendKeys(userName);
        waitImplicit(300);


    }

    /**
     * Pronadji passwordTextBox i unesi ga, nije u funkciji
     */

    public void passWordIUpisi(String pass) {

        WebElement element = driver.findElement(By.xpath("//input[contains(@class, 'input-password')]\n"));
        //  SearchContext shadow1 = element.getShadowRoot();
        waitImplicit(500);

        scrollToElementCenter(element);
        element.clear();
        element.click();
        element.sendKeys(pass);
        waitImplicit(300);


    }







        }