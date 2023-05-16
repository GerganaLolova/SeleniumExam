package pages;

import core.BaseTest;
import org.testng.annotations.Test;

public class YourStorePageTest extends BaseTest {

    @Test

    public void goToStorePage() {
        YourStorePage.goToYourStorePage();
        YourStorePage.clickOnMyAccount();
        YourStorePage.clickOnRegister();
    }
}
