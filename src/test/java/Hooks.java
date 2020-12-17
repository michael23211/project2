import cucumber.api.java.After;
import cucumber.api.java.Before;
import fuctionLibrary.CommonFunctions;

public class Hooks {
    CommonFunctions commonFunctions =  new CommonFunctions();

    @Before
    public  void beforeTest()throws Exception
    {
        commonFunctions.openBrowser();
    }

    @After
    public  void afterTest()
    {
        commonFunctions.closeBrowser();
    }



}
