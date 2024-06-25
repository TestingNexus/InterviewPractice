package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageInitializer.PageInitializer;
import utils.WebDriverUtils;

public class Hooks {

    @Before
    public void start() {
        WebDriverUtils.setup();
        PageInitializer.initializeAllPages();
    }

    @After
    public void end() {
        WebDriverUtils.tearDown();
    }
}
