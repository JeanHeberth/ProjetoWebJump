package br.com.webjump.basepage;

import br.com.webjump.core.BasePage;
import org.openqa.selenium.WebDriver;

import static br.com.webjump.core.DriveFactory.getDriver;


public class HomePage extends BasePage {

    private WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public QuadroButtonsPage validarCaixaButtonsDaPaginaPrincipal() {
        validarCaixaNaTela("panel_body_one");
        return new QuadroButtonsPage(getDriver());
        // return this, Verificar essa implementação.
    }

    public QuadroIframeButtonsPage validarCaixaIFrameButtonsDaPaginaPrincipal() {
        validarCaixaNaTelaIFrameButtons("//*[@id=\"iframe_panel_body\"]/iframe");
        return new QuadroIframeButtonsPage(getDriver());
    }

    public QuadroIframeFieldsPage validarCaixaIFrameFieldsDaPaginaPrincipal() {
        validarCaixaNaTelaIFrameFields("//*[@id=\"iframe_panel_body_two\"]/iframe");
        return new QuadroIframeFieldsPage(getDriver());
    }

}