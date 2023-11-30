package br.com.webjump.page;

import br.com.webjump.elementsPage.QuadroIframeButtonsElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class QuadroIframeButtonsPage extends QuadroIframeButtonsElements {
    private WebDriver driver;


    public QuadroIframeButtonsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void acessarIframeButton() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(escolheIframeButtons);

    }

    public void clicarBoaoOneTwoFour() {
        btnOne.click();
        btnTwo.click();
        linkFour.click();
    }

    public boolean btnOneTwoFourExistem() {
        btnOne.isDisplayed();
        btnTwo.isDisplayed();
        linkFour.isDisplayed();
        return false;
    }
}
