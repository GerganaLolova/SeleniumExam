package pages;

import core.BaseTest;
import org.testng.annotations.Test;

import java.util.UUID;

public class RegisterAccountTest extends BaseTest {

    @Test

    public void registerAccountTest() {
        YourStorePage.goToYourStorePage();
        YourStorePage.clickOnMyAccount();
        YourStorePage.clickOnRegister();

        RegisterAccountPage.writeInFirstNameField("Gergana");
        RegisterAccountPage.writeInLastNameField("Lolova");
        UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();
        RegisterAccountPage.writeInEmailField(uuidAsString+"@gmail.com");
        RegisterAccountPage.writeInTelephoneField("0888888111");
        RegisterAccountPage.writeInPasswordField("1234");
        RegisterAccountPage.writeInPasswordConfirmField("1234");
        RegisterAccountPage.clickPrivacyPolicyCheckBox();
        RegisterAccountPage.clickContinueButton();
        RegisterAccountPage.verifyRegisterAccountText("Your Account Has Been Created!");
    }

}
