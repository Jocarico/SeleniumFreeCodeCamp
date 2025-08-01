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

    public static void dismissAlert() {
        switchTo().alert().dismiss();
    }

    public static void setAlertText(String text){
        switchTo().alert().sendKeys(text);
    }

    public static void switchToFrameString(String value) {
        switchTo().frame(value);
    }

    public static void switchToDefaultContent() {
        switchTo().defaultContent();
    }

    public static void switchToFrameIndex(int index) {
        switchTo().frame(index);
    }
}
