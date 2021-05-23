package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReceptionistPage {

    public ReceptionistPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }



    @FindBy(xpath="/html/body/div/div[2]/div/form/div[3]/div[2]/button")
    public WebElement loginButton ;

    @FindBy(xpath="/html/body/div[1]/div[1]/div/div/div/div[1]/h1")
    public WebElement accountPage ;

    @FindBy(xpath="/html/body/div[1]/aside/div/div[4]/div/div/nav/ul/li[2]/a/p")
    public WebElement user ;

    @FindBy(xpath="/html/body/div[1]/aside/div/div[4]/div/div/nav/ul/li[2]/ul/li/a/p")
    public WebElement userList;

    @FindBy(xpath="/html/body/div/div[1]/section/div/div[2]/div/div/table/tbody/tr[4]/td[2]")
    public WebElement modify ;



    public void clickLoginButton()
    {
        loginButton.click();
    }

    public void setAccountPage()
    {
        Assert.assertTrue(accountPage.isDisplayed());
    }

    public void setUser()
    {
        user.click();
    }
    public void setUserList()
    {
        userList.click();
    }

    public void setModify()
    {
        modify.click();
    }
}
