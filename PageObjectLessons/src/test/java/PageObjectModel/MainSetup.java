package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class MainSetup {
    private WebDriver driver;
    LandingPage landingPage;
    @BeforeTest
    public void setUpThings(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
    }
    @Test(priority = 1)
    public void submitDetails(){
        landingPage = new LandingPage(driver);
        landingPage.gettingHeader();
        landingPage.enterUserna();
        landingPage.enterPasswd();
        landingPage.clickOnLogin();
    }
}
