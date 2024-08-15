package PageObjectModel;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LandingPage
{
    private WebDriver driver;

    public LandingPage(WebDriver driver){
        this.driver = driver;
    }
    By header = By.className("login_logo");
    By userName = By.id("user-name");
    By password = By.cssSelector("input[type=\"password\" i]");
    By submitButton = By.id("login-button");
    @Test
    public void gettingHeader()
    {
       String getHeader = driver.findElement(header).getText();
        Assert.assertEquals("Swag Labs",getHeader);
    }

    public void enterUserna(){
        driver.findElement(userName).sendKeys("standard_user");
    }
    public void enterPasswd(){
        driver.findElement(password).sendKeys("secret_sauce");
    }
    public void clickOnLogin(){
        driver.findElement(submitButton).click();
    }
}
