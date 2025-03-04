package part3_4.com.demoqa.test.part3.widgets;

import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class SelectDropDownTests extends BaseTest {

    @Test
    public void testMultiSelectDropDown(){
      var selectMenuPage = homePage.goToWidgets().clickSelectMenu();
      selectMenuPage.selectStandardMulti("Volvo");
      selectMenuPage.selectStandardMulti(1);
      selectMenuPage.selectStandardMulti(3);
      selectMenuPage.selectStandardMulti("Opel");
    }
}
