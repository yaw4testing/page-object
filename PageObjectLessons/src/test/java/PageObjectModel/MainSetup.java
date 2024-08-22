package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class MainSetup {
    private WebDriver driver;
    LandingPage landingPage;
    PageFactoryLessons pageFactoryLessons;

    @BeforeTest
    public void setUpThings() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
    }

    @Test // pageobject implementation
    public void submitDetails() {
        landingPage = new LandingPage(driver);
        landingPage.gettingHeader();
        landingPage.enterUsername();
        landingPage.enterPasswd();
        landingPage.clickOnLogin();
    }

    @Test(priority = 1) // pagefactory implementation
    public void buyStuff() {
        pageFactoryLessons = new PageFactoryLessons(driver);
        pageFactoryLessons.getTitle();
        pageFactoryLessons.add_back_pack();
        driver.close();
    }

}
