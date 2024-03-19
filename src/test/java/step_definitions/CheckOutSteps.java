package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObject.CheckOutPage;
import pageObject.InventoryPage;
import pageObject.LoginPage;

public class CheckOutSteps {

    private final WebDriver driver = Hooks.driver;
    LoginPage loginPage = new LoginPage(driver);
    InventoryPage inventoryPage = new InventoryPage(driver);
    CheckOutPage checkoutPage = new CheckOutPage(driver);



    @And("user clicks on the cart icon in the top right corner")
    public void userClickCartButton(){
        checkoutPage.clickCartButton();
    }

    @And("user removes the Sauce Labs Bike Light from the shopping list")
    public void userRemoveSauce(){
        checkoutPage.clickRemoveSauce();
    }

    @And("user clicks the checkout button")
    public void userClicksTheCheckoutButton() {
        checkoutPage.clickRemoveButton();
    }

    @Then("user redirected to checkone step")
    public void userRedirectedToCheckoneStep() {
        Assert.assertTrue(checkoutPage.verifyCheckoutStepOne());
    }


    @And("user inputs {string} as the first name, {string} as the last name, and {string} as the Zip Code")
    public void userInputsAsTheFirstNameAsTheLastNameAndAsTheZipCode(String firstname, String lastname, String zipcode) {
        checkoutPage.inputFirstName(firstname,lastname,zipcode);
    }


    @And("The user clicks the continue button")
    public void theUserClicksTheContinueButton() {
        checkoutPage.clickContinueButton();
    }


    @Then("user proceeds to the checkout overview page")
    public void userProceedsToTheCheckoutOverviewPage() {
        Assert.assertTrue(checkoutPage.verifyCheckoutOverview());
    }

    @And("user clicks the finish button")
    public void userClicksTheFinishButton() {
        checkoutPage.clickFinishButton();
    }


    @And("The user is redirected to the complete page")
    public void theUserIsRedirectedToTheCompletePage() {
        checkoutPage.verifyComplete();
    }

    @And("user can see the summary total")
    public void userCanSeeTheSummaryTotal() {
        Assert.assertTrue(checkoutPage.verifySummaryTotal());
    }
}
