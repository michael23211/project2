package fuctionLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CommonFunctions {


    public static WebDriver driver;

    public void openBrowser()throws Exception
    {
        String browser = getDataFromProperty("browser");
        String device = getDataFromProperty("device");
        switch (browser) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                switch (device)
                {
                    case "iphone7" :
                        Dimension dimension = new Dimension(  414,  768);
                        driver.manage().window().setSize(dimension);

                    case "s3" :
                        Dimension dimension1 = new Dimension(  367,  768);
                        driver.manage().window().setSize(dimension1);

                    default:
                        Dimension dimension2 = new Dimension(  414,  768);
                        driver.manage().window().setSize(dimension2);
                }
                break;
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            default:
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;

        }
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

    }

    public void  closeBrowser()

    {
        driver.quit();
    }
    public  String getDataFromProperty(String key)throws Exception {
        FileInputStream inputStream = new FileInputStream(FilePaths.configFilePath);
        Properties properties = new Properties();
        properties.load(inputStream);
        return properties.getProperty(key);
    }

     public void implicitWait(int waitTime)
     {
           driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);

     }
     public void  explicitWait(WebElement element, int maxTime)
     {
         WebDriverWait wait = new WebDriverWait(driver,maxTime);
         wait.until(ExpectedConditions.visibilityOf(element));
     }
}
