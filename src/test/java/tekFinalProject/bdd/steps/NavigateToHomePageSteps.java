package tekFinalProject.bdd.steps;

import io.cucumber.java.en.When;
import org.junit.Assert;
import tekFinalProject.bdd.pages.HomePage;
import tekFinalProject.bdd.utility.SeleniumUtility;

public class NavigateToHomePageSteps extends SeleniumUtility {
    @When("validate user in home page")
    public void validateUserInHomePage(){
        Assert.assertEquals(HomePage.TITLE,"TEK Insurance UI");
       Assert.assertTrue(isDisplayed(HomePage.CREATE_PRIMARY_ACCOUNT_LINK));

    }
}
