package pages;

import org.example.Utils.BaseClass;
import org.testng.Reporter;

public class NavigationPage extends BaseClass {


    /**
     *Skracuje vreme pisanja
     */

    public void webPretrazivac(String url){

        driver.get(url);
        driver.manage().window().maximize();
        waitImplicit(1000);
    }
}
