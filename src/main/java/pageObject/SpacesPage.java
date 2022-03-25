package pageObject;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
import static io.qameta.allure.Allure.step;


public class SpacesPage {
    private static final By YOURSPACEH2_TEXT = By.xpath("//h2[@class='title']");
    private static final By NEWPUBLICSPACE_BUTTON = By.cssSelector("main button:nth-child(2)");
    private static final By PUBLICSPACENAME_FIELD = By.cssSelector("textarea[placeholder='Enter public space name']");
    private static final By SYSTEM_MESSAGE = By.xpath("//span[@class='message']");
    private static final By SAVE_ICON = By.xpath("//*[@id=\"__layout\"]/div/div[1]/main/section[1]/div/div/div/div[1]/h3/div/div/div/button[1]");
    private static final By LASTEDITED_DATE = By.cssSelector(".grid-item-9.version-date");

    private static final By EDITSPACEMORE_ICON = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/main[1]/section[2]/div[1]/div[2]/div[2]/div[3]/div[1]/button[1]/*[1]");
    private static final By DELETESPACE_BUTTON = By.xpath("//button[contains(text(),'Delete space')]");
    private static final By SPACENAMEDELETE_FIELD = By.cssSelector("input[placeholder='space name']");
    private static final By SPACEDELETECONFIRM_BUTTON = By.xpath("//button[contains(text(),'I understand the consequenc')]");

    private static final Logger logger = LogManager.getLogger(BasePage.class);

    @Step("Your Space Header Confirmation")
    public void yourspaceh2Text(){
        $(YOURSPACEH2_TEXT).shouldHave(Condition.text("Your space"));
    }

    @Step(value = "Click New Public space button")
    public void newPublicSpaceButtonClick() {  $(NEWPUBLICSPACE_BUTTON).click();    }

    @Step(value = "System message")
    public void systemMessage(String messageText) {
        $(SYSTEM_MESSAGE).shouldHave(Condition.text(messageText));
     //   $(SYSTEM_MESSAGE).click();
    }

    @Step(value = "Last edited date")
    public void lasteditedDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMM yyyy");
        LocalDateTime now = LocalDateTime.now();
        $(LASTEDITED_DATE).shouldHave(Condition.text("Last edited: " + dtf.format(now)));
    }

    @Step("Public Space  field value")
    public void publicspacenameDefaultValue() {
        $(PUBLICSPACENAME_FIELD).getText().contains("New space");
    }
    @Step("Public Space  field input value")
    public void publicspacenameFieldInput(String spacename) {
        $(PUBLICSPACENAME_FIELD).clear();
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

    @Step("Create New Space")
    public void createNewPublicSpace(String spacename) {
        yourspaceh2Text();
        newPublicSpaceButtonClick();
        systemMessage("Your new space was created successfully!");
        publicspacenameDefaultValue();
        publicspacenameFieldInput(spacename);
        saveIconClick();
        systemMessage("Space was renamed successfully!");
        lasteditedDate();
        try {
            Thread.sleep(450);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step("Delete Space")
    public void deleteCreatedSpace(String spacename) {
        editspacemoreIconClick();
        deleteSpaceButtonClick();
        enterDeleteSpace(spacename);
        try {
            Thread.sleep(450);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        systemMessage("Space was deleted successfully!");
    }

    @Step("UI Verification Space")
    public void uiverification() {
        $(YOURSPACEH2_TEXT).shouldHave(Condition.exactTextCaseSensitive("Your space"));
      //  $(SYSTEM_MESSAGE).shouldHave(Condition.text(messageText));
    }



}