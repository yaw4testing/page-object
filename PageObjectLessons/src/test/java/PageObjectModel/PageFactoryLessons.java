package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PageFactoryLessons {
    WebDriver driver;
    @FindBy(xpath = "//div[@class=\"header_secondary_container\"]/span[@class=\"title\"]")
    WebElement title;
    @FindBy(id="item_4_title_link")
    WebElement back_pack;

    public PageFactoryLessons(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void getTitle(){
        String get_title = title.getText();
        Assert.assertEquals(get_title,"Products");
    }
    public void add_back_pack(){
        back_pack.click();
    }
}
