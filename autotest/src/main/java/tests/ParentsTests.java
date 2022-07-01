package tests;

import aquality.selenium.browser.AqualityServices;
import enums.Paths;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.JsonUtils;

public class ParentsTests {
    @BeforeTest
    protected void beforeTest() {
        AqualityServices.getBrowser().goTo((String) JsonUtils.smartReadJson(Paths.CONFIG.getCode(), "url"));
    }

    @AfterTest
    protected void afterTest() {
        AqualityServices.getBrowser().quit();
    }
}
