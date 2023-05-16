package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.Browser;

public class RegisterAccountPage extends BasePage {
    private static final By FIRST_NAME_FIELD = By.id("input-firstname");
    private static final By LAST_NAME_FIELD = By.id("input-lastname");
    private static final By EMAIL_FIELD = By.id("input-email");
    private static final By TELEPHONE_FIELD = By.id("input-telephone");
    private static final By PASSWORD_FIELD = By.id("input-password");
    private static final By PASSWORD_CONFIRM_FIELD = By.id("input-confirm");

    private static final By PRIVACY_POLICY_CHECK_BOX = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");

    private static final By CONTINUE_BUTTON = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");

    private static final By REGISTER_ACCOUNT_TEXT = By.xpath("//*[@id=\"content\"]/h1");

    public static void writeInFirstNameField(String firstName) {
        Browser.driver.findElement(FIRST_NAME_FIELD).sendKeys(firstName);
    }

    public static void writeInLastNameField(String lastName) {
        Browser.driver.findElement(LAST_NAME_FIELD).sendKeys(lastName);
    }

    public static void writeInEmailField(String email) {
        Browser.driver.findElement(EMAIL_FIELD).sendKeys(email);
    }

    public static void writeInTelephoneField(String phone) {
        Browser.driver.findElement(TELEPHONE_FIELD).sendKeys(phone);
    }

    public static void writeInPasswordField(String pass) {
        Browser.driver.findElement(PASSWORD_FIELD).sendKeys(pass);
    }

    public static void writeInPasswordConfirmField(String confirmPass) {
        Browser.driver.findElement(PASSWORD_CONFIRM_FIELD).sendKeys(confirmPass);
    }

    public static void clickPrivacyPolicyCheckBox() {
        WebElement checkBox = Browser.driver.findElement(PRIVACY_POLICY_CHECK_BOX);
        if (!checkBox.isSelected()) {
            checkBox.click();
        }
    }

    public static void clickContinueButton() {
        Browser.driver.findElement(CONTINUE_BUTTON).click();
    }

    public static void verifyRegisterAccountText(String expectedRegisterAccountText) {
        String actualRegisterAccountText = Browser.driver.findElement(REGISTER_ACCOUNT_TEXT).getText();
        Assert.assertEquals(actualRegisterAccountText, expectedRegisterAccountText);
    }
}
