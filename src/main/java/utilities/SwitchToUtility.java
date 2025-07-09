package utilities;

import org.openqa.selenium.WebDriver;

public class SwitchToUtility extends Utility {

    private static WebDriver.TargetLocator switchTo() {
        return driver.switchTo();
    }

    public static String getAlertText() {
        return switchTo().alert().getText();
    }

    //Hit okay button of alert
    public static void acceptAlert() {
        switchTo().alert().accept();
    }
}
