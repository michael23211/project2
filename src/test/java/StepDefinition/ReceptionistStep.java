package StepDefinition;


import PageObjects.ReceptionistPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import org.openqa.selenium.By;

public class ReceptionistStep extends CommonFunctions {

    ReceptionistPage receptionistPage = new ReceptionistPage(driver);

    @Given("^I am in login page$")
    public void i_am_in_login_page()  {
        driver.get("http://solar.schoolnewgen.com/websolar/login");
      
    }

    @When("^I enter userName and password$")
    public void i_enter_userName_and_password()
    {
        driver.findElement(By.id("email")).sendKeys("receptionist1@gmail.com");
        driver.findElement(By.id("password")).sendKeys("secret");
      
    }

    @When("^I click on Login button$")
    public void i_click_on_Login_button()  {
        receptionistPage.clickLoginButton();
      
    }

    @Then("^I should login and get redirected to account page$")
    public void i_should_login_and_get_redirected_to_account_page()
    {
      receptionistPage.setAccountPage();
    }

    @When("^I click on user$")
    public void i_click_on_user()
    {
      receptionistPage.setUser();
    }

    @When("^I click on userList$")
    public void i_click_on_userList()
    {
      receptionistPage.setUserList();
    }

    @Then("^I should be able to modify \"(.*?)\"  user$")
    public void i_should_be_able_to_modify_user(String arg1)
    {
      receptionistPage.setModify();
    }

}
