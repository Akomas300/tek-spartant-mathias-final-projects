package tekFinalProject.bdd.pages;

import org.openqa.selenium.By;
import tekFinalProject.bdd.utility.SeleniumUtility;

public class SignInPage extends SeleniumUtility {
    public static final String GET_USERNAME_INPUT=
            waitForVisibility(By.xpath("//label[@for='username']/following-sibling::input"))
                    .getText();
}
