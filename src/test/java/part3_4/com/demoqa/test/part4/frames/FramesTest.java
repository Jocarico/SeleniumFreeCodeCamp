package part3_4.com.demoqa.test.part4.frames;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class FramesTest extends BaseTest {

    @Test
    public void testFramesBigBox() {
        var framesPage = homePage.goToAlertsFramesWindowsCard().clickFrames();
        String actualBigBoxText = framesPage.getTextInBigFrame();
        String expectedBigBoxText = "This is a sample page";
        Assert.assertEquals(actualBigBoxText, expectedBigBoxText,
                "\n Actual & Expected do not match \n");
        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText, expectedHeaderText,
                "\n Actual & Expected Header Text do not match \n");

    }

    @Test
    public void testFrameSmallBox() {
       var framesPage = homePage.goToAlertsFramesWindowsCard().clickFrames();
       String actualSmallBoxText = framesPage.getTextInSmallFrame();
       String expectedSmallBoxText = "This is a sample page";
       Assert.assertEquals(actualSmallBoxText, expectedSmallBoxText,
               "\n Expected & Actual texts do not match \n");
       String actualHeaderText = framesPage.getHeaderFramesText();
       String expectedHeaderText = "Frames";
       Assert.assertEquals(actualHeaderText, expectedHeaderText,
               "\n Expected & Actual texts do not match \n");
    }
}
