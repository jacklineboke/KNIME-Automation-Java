package setupBrowser;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;

public class SetupBrowser {

    public void start_browser(String browser) {
   if (browser.equals("local")){
            Configuration.browser = "chrome";
            Configuration.timeout = 15000;
            Configuration.startMaximized = true;
            Configuration.headless = false;
            Selenide.clearBrowserCookies();
            SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true).
                    includeSelenideSteps(false));
        }
    }

}
