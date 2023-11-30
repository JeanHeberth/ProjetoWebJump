package br.com.webjump.page;

import br.com.webjump.elementsPage.QuadoFrameFieldsElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class QuadroIframeFildesPage extends QuadoFrameFieldsElements {

    private WebDriver driver;

    public QuadroIframeFildesPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void acessarIframeFields() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(escolheIframeFields);

    }

    public void acessarIframeButton() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(escolheIframeButtons);

    }

    public void escreverTexto(String texto) {
        txtNome.sendKeys(texto);
    }

    public void clicarBotaOne() {
        btnOne.click();
    }

    public void checarOptionThree() {
        checkOption.click();
    }

    public void selecionarExampleTwo() {
        WebElement selecionaExemplo = dropDownExample;
        Select combo = new Select(selecionaExemplo);
        combo.selectByVisibleText("ExampleTwo");
        driver.switchTo().parentFrame();
    }

    public boolean validandoImagemSelenium() {
        imgSelenium.isDisplayed();
        return true;
    }
}
