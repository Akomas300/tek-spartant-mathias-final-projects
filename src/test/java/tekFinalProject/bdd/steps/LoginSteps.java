package tekFinalProject.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tekFinalProject.bdd.pages.HomePage;
import tekFinalProject.bdd.pages.SignInPage;
import tekFinalProject.bdd.pages.SignUpPage;
import tekFinalProject.bdd.utility.SeleniumUtility;

public class LoginSteps extends SeleniumUtility {
    @When("user click on login link")
    public void userClickOnLoginLink() {

        clickOnElement(HomePage.LOGIN_LINK);
    }
    @Then("validate error message {string} is displayed as expected")
    public void validateErrorMessageAsExpected(String message) {
        String text= gettingText(By.xpath("//div[@role='alert']"))
                .replace("ERROR","").trim();
        Assert.assertEquals(message,text);
    }

    @Then("validate wrong username error")
    public void validateErrorMessageAsExpected() {
        String text= gettingText(By.xpath("//div[@role='alert']")).replace("ERROR","").trim();
        String input= waitForVisibility(By.id("username")).getAttribute("value");
        String message="User "+input+" not found";
        Assert.assertEquals(message,text);
        //System.out.println(message);
    }

}
