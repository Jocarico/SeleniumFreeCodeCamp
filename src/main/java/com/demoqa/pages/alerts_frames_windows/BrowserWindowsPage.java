package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import java.util.Set;

import static utilities.SwitchToUtility.switchToWindow;

public class BrowserWindowsPage extends Alerts_Frames_WindowsPage {

    private By newWindowButton = By.id("windowButton");

    public void clickNewWindowButton() {
        click(newWindowButton);
    }

    public void switchToNewWindow() {
        //Step 1: Get the current name of window handle
        String currentHandle = driver.getWindowHandle();
        System.out.println(String.format("Main Window ID: %s ", currentHandle));
        //Step 2: Get all window handle
        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("# of Open windows: " + allHandles.size());

        for (String handle : allHandles) {
            if (currentHandle.equals(handle)){
                System.out.println("1st window ID: " + handle);
            } else {
                switchToWindow(handle);
                System.out.println("2nd Window ID: " + handle);
            }
        }


        //Step 3: Switch to the new window using the window handle
    }


}
