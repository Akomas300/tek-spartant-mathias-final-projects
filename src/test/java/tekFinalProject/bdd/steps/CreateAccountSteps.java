package tekFinalProject.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tekFinalProject.bdd.pages.SignUpPage;
import tekFinalProject.bdd.utility.SeleniumUtility;

public class CreateAccountSteps extends SeleniumUtility {
   public String username;
@When("validate user in {string} page")
    public void validateUserInAPage(String text){
    String xpath="//h2[text()='"+text+"']";
    Assert.assertEquals(gettingText(By.xpath(xpath))
            ,text);
}

    @Then("validate error message {string} is displayed as expected")
    public void validateErrorMessageAsExpected(String message) {
    String text= gettingText(By.xpath("//div[@role='alert']")).replace("ERROR","").trim();
    Assert.assertEquals(message,text);
    }

    @Then("user click on profile icon")
    public void userClickOnProfileIcon() {
    clickOnElement(By.xpath("//button[@aria-label='profile']"));
    }

    @Then("validate full name display at profile section")
    public void validateFullNameDisplayAtProfileSection() {
    String expectedFullName="Mathias Akowanou";
    String fullName=gettingText(By.xpath("//p[text()='Mathias Akowanou']"));
    Assert.assertEquals(expectedFullName,fullName);
    }

    @When("user enter signUp information")
    public void userEnterSignUpInformation() {
    username=RandomUsername();
    sendText(SignUpPage.USER_NAME_INPUT,username);
    sendText(SignUpPage.PASSWORD_INPUT,"Akomas21");
    sendText(SignUpPage.CONFIRM_PASSWORD_INPUT,"Akomas21");
    }

    @When("user enter signIn information")
    public void userEnterSignInInformation() {
        sendText(SignUpPage.USER_NAME_INPUT,username);
        sendText(SignUpPage.PASSWORD_INPUT,"Akomas21");
    }
}

