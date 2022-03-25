import com.codeborne.selenide.testng.TextReport;
import com.codeborne.selenide.testng.annotations.Report;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObject.*;

import java.util.ResourceBundle;

import static com.codeborne.selenide.Selenide.open;

@Report
@Listeners(TextReport.class)
public class SpacesTest extends BasePage {

    private static ResourceBundle env = ResourceBundle.getBundle("envs");
    private static ResourceBundle creds = ResourceBundle.getBundle("creds");

       String spacename = faker.name().name();

    @BeforeMethod
    public static void start(){
        open(env.getString("qa_env"));
        loginPage.welcomeMessage();
        loginPage.login_to_KNIME_Hub(creds.getString("username"), creds.getString("password"));
        loginPage.navigatetoSpaces();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Create New Space and Delete Space E2E")
    @Test
    public void TC_001_create_n_DeleteSpaceE2E(){
        spacesPage.createNewPublicSpace(spacename);
        spacesPage.deleteCreatedSpace(spacename);
    }
    @Severity(SeverityLevel.CRITICAL)
    @Description("Create New Space and Delete Space E2E")
    @Test
    public void TC_002_uiVerification(){
      //  spacesPage.
        spacesPage.uiverification();
    }
}
