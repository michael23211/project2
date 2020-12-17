package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage {

    public WebDriver driver;

    public BasketPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

   @FindBy(xpath = "//*[@id=\"chrome-search\"]")
    public  WebElement searchTerm;



    @FindBy(xpath = "//*[@id=\"product-7900502\"]/a/div[1]")
    public WebElement productName;

    @FindBy(xpath = "//*[@id=\"main-size-select-0\"]")
    public WebElement size;

    @FindBy(xpath = "//*[@id=\"product-add\"]/div/a/span[2]")
    public WebElement addToBag;

    @FindBy(xpath = "//*[@id=\"bagApp\"]/div/div/div[1]/div[1]/div/h2")
    public WebElement productInTheBag;


    public void enterSearchTerm() {
        Assert.assertTrue(searchTerm.isDisplayed());

    }

}