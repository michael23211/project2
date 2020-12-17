import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import fuctionLibrary.FilePaths;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = {},dryRun = false,
        plugin = "com.cucumber.listener.ExtentCucumberFormatter:target/TSR/tsr.html")

public class Run {

@AfterClass
public static void writeTSR()
{
    Reporter.loadXMLConfig(FilePaths.reportXmlFilepath);
}

}
