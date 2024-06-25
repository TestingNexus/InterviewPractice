package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pageInitializer.PageInitializer;
import utils.ConfigReader;
import utils.WebDriverUtils;

public class InterviewSessionSteps extends PageInitializer {


    @Given("user is on the Chromatech practice site")
    public void user_is_on_the_chromatech_practice_site() {
        WebDriverUtils.driver.get(ConfigReader.getPropertyValue("url"));
    }

    @When("the user selects {string} from the drop down")
    public void the_user_selects_from_the_drop_down(String optionText) {
        Select select = new Select(practiceSitePage.dropDown);
        select.selectByVisibleText(optionText);
    }
}
