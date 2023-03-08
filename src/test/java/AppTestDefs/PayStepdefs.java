package AppTestDefs;

import POM.AppElementItems;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_lol.AN;
import org.openqa.selenium.Alert;

import static AppTestDefs.LoginStepdefs.driver;


public class PayStepdefs{

    AppElementItems pay = new AppElementItems(driver);


    @Given("user click make payment button")
    public void userClickMakePaymentButton() throws InterruptedException {

        pay.makePayment();
    }

    @When("user enters {string}and {string} and {string}")
    public void userEntersPhoneAndNameAndAmount(String phone, String name, String amount) throws InterruptedException {
        pay.makePayment2(phone,name,amount);
    }

    @And("user click select button")
    public void userClickSelectButton() throws InterruptedException {

        pay.selectCountry();
        
    }

    @And("user will navigate to home")
    public void userWillNavigateToHome() throws InterruptedException {

        pay.sendPayment();
        
    }

    @Then("accept alert")
    public void acceptAlert() throws InterruptedException {

        pay.acceptAlert();
    }
}
