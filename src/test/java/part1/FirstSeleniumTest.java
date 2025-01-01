package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testLoggingIntoApplication() throws InterruptedException {
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.name("login"));
        username.sendKeys("Jocarico12");

        var password = driver.findElement(By.name("password"));
        password.sendKeys("Sp1derman!");

        driver.findElement(By.className("btn-content-container__2HVS")).click();


    }
}
