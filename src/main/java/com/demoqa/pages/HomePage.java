package com.demoqa.pages;

import com.demoqa.pages.alerts_frames_windows.Alerts_Frames_WindowsPage;
import com.demoqa.pages.elements.ElementsPage;
import com.demoqa.pages.forms.FormsPage;
import com.base.BasePage;
import com.demoqa.pages.widgets.WidgetsPage;
import org.openqa.selenium.By;

import static utilities.JavaScripUtility.scrollToElementJS;

public class HomePage extends BasePage {

    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private By elementsCard = By.xpath("//div[@id='app']//h5[text()='Elements']");
    private By widgetCard = By.xpath("//div[@id='app']//h5[text()='Widgets']");
    private By alertsFrameWindowsCard = By.xpath("//div[@id='app']//h5[text()='Alerts, Frame & Windows']");

    public FormsPage goToForms(){
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }

    public ElementsPage goToElements () {
        scrollToElementJS(elementsCard);
        click(elementsCard);
        return new ElementsPage();
    }

    public WidgetsPage goToWidgets(){
        scrollToElementJS(widgetCard);
        click(widgetCard);
        return new WidgetsPage();
    }

    public Alerts_Frames_WindowsPage goToAlertsFramesWindowsCard() {
        scrollToElementJS(alertsFrameWindowsCard);
        click(alertsFrameWindowsCard);
        return new Alerts_Frames_WindowsPage();
    }

}
