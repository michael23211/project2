package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {

    public  WebDriver driver;

    public  Header(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,  this);
    }

    @FindBy(xpath="//span[@type=\"heartUnfilled\"]")
    public WebElement saveLists;

    public void  clickSavedLists()
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(saveLists).click().build().perform();
        saveLists.click();
    }


}
