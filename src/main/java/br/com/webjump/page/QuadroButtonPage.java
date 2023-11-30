package br.com.webjump.page;

import br.com.webjump.elementsPage.QuadroButtonsElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class QuadroButtonPage extends QuadroButtonsElements {

    private WebDriver driver;

    public QuadroButtonPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
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
