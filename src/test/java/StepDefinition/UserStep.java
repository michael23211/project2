package StepDefinition;

import PageObjects.UserPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;

import java.util.concurrent.TimeUnit;

public class UserStep extends CommonFunctions {

    UserPage userPage= new UserPage(driver);
    
    
    @When("^I click on product$")
    public void i_click_on_product() {
        userPage.clickProduct();
    
    }

    @When("^I click on productList$")
    public void i_click_on_productList() {
        implicitWait(5);
        explicitWait(userPage.productList,10);
        userPage.clickProductList();
    
    }

    @Then("^I should be  redirected to product page$")
    public void i_should_be_redirected_to_product_page() {
        userPage.setProductPage();


    }

    @When("^I enter into search field \"(.*?)\"$")
    public void i_enter_into_search_field(String searchTerm) {
        userPage.enterSearchField(searchTerm);
    
    }

    @When("^I click on filter button$")
    public void i_click_on_filter_button() {
        userPage.clickFilterButton();
    
    }

    @Then("^i should be seeing only product (\\d+) in the home page$")
    public void i_should_be_seeing_only_product_in_the_home_page(int arg1) {
        userPage.setHomepage();
    
    }

    @When("^I click on edit in \"(.*?)\"$")
    public void i_click_on_edit_in(String arg1)
    {
        userPage.clickEdit();
    
    }

    @Then("^I should be  redirected to edit \"(.*?)\" page$")
    public void i_should_be_redirected_to_edit_page(String arg1)
    {
     userPage.setEditPage();
    }

    @When("^I enter new data \"(.*?)\" in Product Warranty Details field$")
    public void i_enter_new_data_in_Product_Warranty_Details_field(String warranty)
    {
     userPage.enterWarrantyDetail(warranty);
    }

    @Then("^I should be able to update it successfully$")
    public void i_should_be_able_to_update_it_successfully()
    {
    userPage.clickUpdate();
        implicitWait(2);
    }
}
