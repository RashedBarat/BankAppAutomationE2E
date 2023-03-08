package AppTestDefs;

import Core.Helper;
import POM.AppElementItems;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class LoginStepdefs{

    public static AndroidDriver driver;

    AppElementItems elements;
    Helper help = new Helper();

    @Given("app apk is there")
    public void appApkIsThere() throws MalformedURLException, InterruptedException {

        driver =  help.apkLaunch();
    }

    @When("user enters {string}and {string}")
    public void userEntersUsernameAndPass(String username, String pass) throws InterruptedException {

       // AppElementItems element = new AppElementItems();
        elements = new AppElementItems(driver);
        elements.inputField(username,pass);
    }

    @Then("user will navigate to home screen")
    public void userWillNavigateToHomeScreen() throws InterruptedException {

        System.out.println("Login Success!");
    }
}
