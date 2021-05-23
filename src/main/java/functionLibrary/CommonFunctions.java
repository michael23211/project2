package functionLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CommonFunctions {
    public static   WebDriver driver;

    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
    }
    public void closeBrowser()
    {
        driver.quit();
    }

    public void implicitWait(int waitTime)
    {
        driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
    }

    public void explicitWait(WebElement element,int maxTime )
    {
        WebDriverWait wait = new WebDriverWait(driver,maxTime);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
