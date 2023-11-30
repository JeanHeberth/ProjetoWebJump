package br.com.webjump.base;

import br.com.webjump.core.BrowserConfig;
import br.com.webjump.util.ScreenShot;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import static br.com.webjump.util.ScreenShot.*;

public abstract class BaseTest {

    protected WebDriver driver;
    private BrowserConfig browserConfig;


    @BeforeEach
    public void beforeEach() {
        browserConfig = new BrowserConfig();
        driver = browserConfig.setUp();

    }

    @AfterEach
    public void afterEach() {
        browserConfig.tearDown(driver);

    }

}
