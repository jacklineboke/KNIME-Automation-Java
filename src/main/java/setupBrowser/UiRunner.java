package setupBrowser;

import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStreamReader;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class UiRunner {

    @Parameters({"browser"})
    @BeforeMethod(alwaysRun = true)
    public void SetUp(@Optional("local")String browser){
        SetupBrowser setupBrowser = new SetupBrowser();
        setupBrowser.start_browser(browser);
    }

    @Parameters({"modeRun"})
    @AfterMethod
    public void tearDown(@Optional("local")String modeRun) throws InterruptedException {
        if (modeRun.equals("local")){ closeWebDriver();}
    }

}

