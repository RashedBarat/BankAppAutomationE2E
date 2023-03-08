package AppTestDefs;

import POM.AppElementItems;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static AppTestDefs.LoginStepdefs.driver;

public class ExpenseStepdefs {

    AppElementItems expay = new AppElementItems(driver);

    @Given("user click on expense button")
    public void userClickOnExpenseButton() throws InterruptedException {

        expay.expenseReport();

    }

    @When("user click on remove text")
    public void userClickOnRemoveText() throws InterruptedException {

        expay.remReport();

    }

    @And("user click on add button")
    public void userClickOnAddButton() throws InterruptedException {
        expay.addReport();
    }

    @And("user click on back button")
    public void userClickOnBackButton() throws InterruptedException {
        expay.backHome();
    }

    @Then("logout")
    public void logout() throws InterruptedException {
        expay.logOut();
    }
}
