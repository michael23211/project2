package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
       public UserPage(WebDriver driver)
       {
           PageFactory.initElements(driver,this);
       }

    @FindBy(xpath = "/html/body/div[1]/aside/div/div[4]/div/div/nav/ul/li[5]/a/p")
    public WebElement product;

    @FindBy(xpath = "/html/body/div/aside/div/div[4]/div/div/nav/ul/li[5]/ul/li[2]/a/p")
    public WebElement productList;

    @FindBy(xpath = "/html/body/div/div[1]/div/div/div/div[1]/h1")
    public WebElement productPage;

    @FindBy(name = "search_text")
    public WebElement searchField;

    @FindBy(xpath = "/html/body/div/div[1]/section/div/div[2]/form/div/div[3]/button")
    public WebElement filterButton;

    @FindBy(xpath = "/html/body/div/div[1]/div/div/div/div[2]/ol/li")
    public WebElement homepage;

    @FindBy(xpath = "//a[@class=\"btn btn-info btn-xs\"]")
    public WebElement edit;


    @FindBy(xpath = "/html/body/div/div[1]/div/div/div/div[1]/h1")
    public WebElement editPage;

    @FindBy(name= "warranty_details")
    public WebElement warrantyDetail;

    @FindBy(xpath = "/html/body/div/div[1]/section/div/div[2]/form/div[2]/div/input")
    public WebElement update;

    public void clickProduct()
    {
       product.click();
    }

    public void clickProductList()
    {
        productList.click();
    }

    public void setProductPage()
    {
        Assert.assertTrue(productPage.isDisplayed());
    }

    public void enterSearchField(String searchTerm)
    {
        searchField.sendKeys(searchTerm);
    }

    public void clickFilterButton()
    {
        filterButton.click();
    }

    public void setHomepage()
    {
        Assert.assertTrue(homepage.isDisplayed());
    }

    public void clickEdit()
    {
        edit.click();
    }
    public void setEditPage()
    {
        Assert.assertTrue(editPage.isDisplayed());
    }

    public void enterWarrantyDetail(String warranty)
    {
        warrantyDetail.sendKeys(warranty);
    }

    public void clickUpdate()
    {
        update.click();
    }
}
