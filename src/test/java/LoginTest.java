import com.codeborne.selenide.testng.TextReport;
import com.codeborne.selenide.testng.annotations.Report;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObject.BasePage;

import java.util.ResourceBundle;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertTrue;

@Report
@Listeners(TextReport.class)
public class LoginTest extends BasePage {

    private static ResourceBundle env = ResourceBundle.getBundle("envs");
    private static ResourceBundle creds = ResourceBundle.getBundle("creds");

       String spacename = faker.name().name();

    @BeforeMethod
    public static void start(){
        open(env.getString("qa_env"));
        loginPage.welcomeMessage();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Simple login")
    @Test
    public void test_login_positive() throws InterruptedException {
        loginPage.login_to_KNIME_Hub(creds.getString("username"), creds.getString("password"));
    }

}
