package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginStep extends CommonFunctions {


    @Given("^I'm on login page$")
    public void i_m_on_login_page() {
        driver.get("http://solar.schoolnewgen.com/websolar/login");
       
    }

    @When("^I enter username and password$")
    public void i_enter_username_and_password() {
        driver.findElement(By.id("email")).sendKeys("admin1@gmail.com");
        driver.findElement(By.id("password")).sendKeys("secret");
    }

    @When("^I click on login$")
    public void i_click_on_login() {
        driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div[3]/div[2]/button")).click();
       
    }

    @Then("^I should be able to login successfully$")
    public void i_should_be_able_to_login_successfully() {
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/h1")).isDisplayed());
       
    }


}
