package pages;

import core.BasePage;
import org.openqa.selenium.By;
import utils.Browser;

public class YourStorePage extends BasePage {

    private static final String url = "http://shop.pragmatic.bg/";
    private static final By MY_ACCOUNT = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");
    private static final By REGISTER = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");

    public static void goToYourStorePage() {
        Browser.driver.get(url);
    }

    public static void clickOnMyAccount (){
        Browser.driver.findElement(MY_ACCOUNT).click();
    }

    public static void clickOnRegister (){
        Browser.driver.findElement(REGISTER).click();
    }
}
