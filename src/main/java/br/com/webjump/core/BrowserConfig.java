package br.com.webjump.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static br.com.webjump.util.Constantes.BASE_URI;
import static java.time.Duration.ofSeconds;

public class BrowserConfig {

    private WebDriver driver;


    public void configSelenium() {
        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--headless");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(ofSeconds(30));
    }

    public WebDriver setUp() {
        configSelenium();
        driver.get(BASE_URI);
        return driver;
    }

    public void tearDown(WebDriver driver) {
        driver.manage().deleteAllCookies();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
