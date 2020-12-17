package stepDefinitions;

import PageObjects.BasketPage;
import PageObjects.Header;
import PageObjects.SavedListsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fuctionLibrary.CommonFunctions;

public class SaveListsSteps extends CommonFunctions {

    Header header = new Header(driver);
    SavedListsPage savedListsPage = new SavedListsPage(driver);
    BasketPage basketPage = new BasketPage(driver);

    @Given("^I'm on Homepage$")
    public void i_m_on_Homepage() throws Exception {
        driver.get(getDataFromProperty("url"));
     
    }

    @When("^I click SavedList Icon$")
    public void i_click_SavedList_Icon()  {
        implicitWait(2);
        header.clickSavedLists();
     
    }

    @Then("^I should redirected to the saved lists with text as \"([^\"]*)\"$")
    public void i_should_redirected_to_the_saved_lists_with_text_as(String expectedText) {
        explicitWait(savedListsPage.noSavedItemText, 3);
        savedListsPage.validateNoSavedItems(expectedText);

    }
}
