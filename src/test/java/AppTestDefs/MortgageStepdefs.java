package AppTestDefs;

import POM.AppElementItems;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static AppTestDefs.LoginStepdefs.driver;
public class MortgageStepdefs {

    AppElementItems mpay = new AppElementItems(driver);
    @Given("user click mortgage req button")
    public void userClickMortgageReqButton() throws InterruptedException {
                mpay.mortgagePayment();
    }

    @When("user enters {string}and {string} and {string} and {string} and {string}")
    public void userEntersFnameAndLnameAndAgeAndAddAndAdd(String arg0, String arg1,String arg2,String arg3, String arg4) throws InterruptedException {
            mpay.mortgagePayment2(arg0,arg1,arg2,arg3,arg4);
    }

    @And("user click select country button")
    public void userClickSelectCountryButton() throws InterruptedException {

        mpay.mortgageselectCountry();
    }

    @And("select country")
    public void selectCountry() throws InterruptedException {
        mpay.mortgagesendPayment();

    }

    @And("mortgage alert")
    public void mortgageAlert() throws InterruptedException {

        mpay.mortgageacceptAlert();
    }

    @Then("accept alertt")
    public void acceptAlertt() throws InterruptedException {

        mpay.mortgageacceptAlertSave();
    }
}
