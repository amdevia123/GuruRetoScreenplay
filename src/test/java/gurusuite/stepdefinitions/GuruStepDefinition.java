package gurusuite.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gurusuite.models.Data;
import gurusuite.tasks.ConfirmTheBannerOn;
import gurusuite.tasks.LogIn;
import gurusuite.tasks.OpenTheBrowser;
import gurusuite.tasks.RegisterIn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class GuruStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    private Actor andres = Actor.named("Andres");

    @Before
    public void setUp() {

        andres.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that andres enters the Guru page$")
    public void openGuru() {
        //Precondiciones
        andres.wasAbleTo(OpenTheBrowser.On());
    }

    @When("^andres signs up$")
    public void registerInGuru(List<Data> dataList) {

        andres.attemptsTo(RegisterIn.GuruPage(dataList));

    }

    @And("^logs in$")
    public void logInGuru(List<Data> dataList) {

        andres.attemptsTo(LogIn.GuruPage(dataList));

    }

    @Then("^andres can validate that the login and therefore the registration were successful with the banner (.*)$")
    public void verifyInGuru(String banner) {
        andres.attemptsTo(ConfirmTheBannerOn.GuruPage(banner));
    }
}

