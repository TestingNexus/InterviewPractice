package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

public class PracticeSitePage {

    /**
     * SELECT DROP DOWN
     */
    @FindBy(xpath="//select[@id='dropdown-class-example']")
    public WebElement dropDown;

    public PracticeSitePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
