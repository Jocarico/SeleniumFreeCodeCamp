package part2.com.saucedemo.tests.products;

import com.saucedemo.pages.ProductPage;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class ProductsTest extends BaseTest {

    @Test
    public void testProductHeaderIsDisplayed() {
       ProductPage productsPage =  loginPage.
               logIntoApplication("standard_user","secret_sauce");
        assertTrue(productsPage.isProductHeaderDisplayed(),
                "\n Products Header Is Not Displayed \n");
    }
}
