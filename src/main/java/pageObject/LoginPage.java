package pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.commands.ScrollIntoView;
import com.codeborne.selenide.testng.TextReport;
import com.codeborne.selenide.testng.annotations.Report;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class LoginPage{
    private static final By ACCEPTCOOKIE_BUTTON = By.cssSelector("button.accept-button");
    private static final By WELCOMEMSSG_TEXT = By.xpath("//p[contains(text(),'Welcome to the')]");
    private static final By WELCOMEH2_TEXT = By.xpath("//h2[contains(text(),'KNIME Hub')]");
    private static final By WELCOMEH5_TEXT = By.xpath("//h5[contains(text(),'Solutions for data science: find workflows, nodes ')]");

    private static final By SIGNIN_LINK = By.xpath("//button[contains(text(),'Sign in')]");
    private static final By SIGNINH2_TEXT = By.xpath("//h2[contains(text(),'Sign in')]");
    private static final By USERNAME_FIELD = By.cssSelector("#edit-name");
    private static final By PASSWORD_FIELD = By.cssSelector("#edit-pass");
    private static final By SIGNIN_BUTTON = By.cssSelector("#edit-submit");
    private static final By AVATAR_ICON = By.cssSelector("div.avatar-placeholder");
    private static final By SPACES_LINK = By.xpath("//a[contains(text(),'Spaces')]");

    private static final By NEWPUBLICSPACE_BUTTON = By.cssSelector("main button:nth-child(2)");

    private static final By PUBLICSPACENAME_FIELD = By.cssSelector("textarea[placeholder='Enter public space name']");
    private static final By SAVE_ICON = By.xpath("//*[@id=\"__layout\"]/div/div[1]/main/section[1]/div/div/div/div[1]/h3/div/div/div/button[1]");

    private static final By EDITSPACEMORE_ICON = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/main[1]/section[2]/div[1]/div[2]/div[2]/div[3]/div[1]/button[1]/*[1]");
    private static final By DELETESPACE_BUTTON = By.xpath("//button[contains(text(),'Delete space')]");
    private static final By SPACENAMEDELETE_FIELD = By.cssSelector("input[placeholder='space name']");
    private static final By SPACEDELETECONFIRM_BUTTON = By.xpath("//*[name()='div' and contains(@class,'controls')]//*[name()='button' and contains(@type,'submit')]");

    private static final Logger logger = LogManager.getLogger(BasePage.class);

    @Step("Accept Cookie click")
    public void acceptCookieButton(){
        $(ACCEPTCOOKIE_BUTTON).click();
    }

    @Step("Welcome Message")
    public void welcomeMessage(){
        $(WELCOMEMSSG_TEXT).isDisplayed();
        $(WELCOMEMSSG_TEXT).shouldHave(Condition.text("Welcome to the"));
        $(WELCOMEH2_TEXT).shouldHave(Condition.text("KNIME Hub"));
        $(WELCOMEH5_TEXT).shouldHave(Condition.text("Solutions for data science: find workflows, nodes and components, and collaborate in spaces."));
    }
    @Step("Click on Signin Link")
    public void signinLink(){
        $(SIGNIN_LINK).click();
        $(SIGNINH2_TEXT).isDisplayed();
            }

    @Step("Username field input value")
    public void usernameFieldInput(String username) {
        $(USERNAME_FIELD).sendKeys(username);
    }

    @Step("Password field input value")
    public void passwordFieldInput(String password) {
        //  $(FORGOT_PASSWORD_BUTTON).should(Condition.visible);
        $(PASSWORD_FIELD).sendKeys(password);
    }

    @Step(value = "Click signin")
    public void signinButtonClick() {
        $(SIGNIN_BUTTON).click();
    }

    @Step(value = "Click avatar icon")
    public void avatarIconClick() {
        $(AVATAR_ICON).isDisplayed();
        $(AVATAR_ICON).click();
    }

    @Step(value = "Click spaces")
    public void spacesLinkClick() {
        $(SPACES_LINK).click();
    }
/*
    @Step(value = "Click New Public space button")
    public void newPublicSpaceButtonClick() {
        //$(NEWPUBLICSPACE_BUTTON).scrollIntoView("{block: \"end\"}");
        $(NEWPUBLICSPACE_BUTTON).click();
    }

    @Step("Public Space  field input value")
    public void publicspacenameFieldInput(String spacename) {
        $(PUBLICSPACENAME_FIELD).sendKeys(spacename);
    }

    @Step("Save icon click")
    public void saveIconClick() {
        $(SAVE_ICON).click();
    }
    @Step("Public Space  field input value")
    public void editspacemoreIconClick() {
        $(EDITSPACEMORE_ICON).click();
    }

    @Step("Public Space  field input value")
    public void deleteSpaceButtonClick() { $(DELETESPACE_BUTTON).click();    }

    @Step("Space Name Delete field input")
    public void spacenamedeleteFieldInput(String spacename) {
        $(SPACENAMEDELETE_FIELD).sendKeys(spacename);
    }

    @Step("Confirm space deletion")
    public void spacedeleteconfirmButton() { $(SPACEDELETECONFIRM_BUTTON).click();    }

    @Step("Positive login")
    public void login_to_KNIME_Hub(String username, String password) {
        acceptCookieButton();
        signinLink();
        usernameFieldInput(username);
        passwordFieldInput(password);
        signinButtonClick();
       // avatarIconClick();
        //spacesLinkClick();
        //newPublicSpaceButtonClick();
    }
    @Step("Navigate to Space page")
    public void navigatetoSpaces() {
        avatarIconClick();
        spacesLinkClick();
    }
    @Step("Enter Space details")
    public void enterSpaceDetails(String spacename) {
        publicspacenameFieldInput(spacename);
        saveIconClick();
    }
    @Step("Delete Space")
    public void deleteSpace() {
        editspacemoreIconClick();
        deleteSpaceButtonClick();
    }

    @Step("Confirm Deletion space to Delete")
    public void enterDeleteSpace(String spacename) {
        spacenamedeleteFieldInput(spacename);
         spacedeleteconfirmButton();
    }

    public void change_active_focus_browser_tab(int number_tab){
        step("Change active focus browser tab - " + number_tab);
        logger.info("Change active focus browser tab - " + number_tab);
        switchTo().window(number_tab);
    }

 */

    @Step("Positive login")
    public void login_to_KNIME_Hub(String username, String password) {
        acceptCookieButton();
        signinLink();
        usernameFieldInput(username);
        passwordFieldInput(password);
        signinButtonClick();
    }

    @Step("Navigate to Space page")
    public void navigatetoSpaces() {
        avatarIconClick();
        spacesLinkClick();
    }

}