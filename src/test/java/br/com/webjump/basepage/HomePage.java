package br.com.webjump.basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static br.com.webjump.core.DriveFactory.getDriver;

public class HomePage {

    private WebDriver driver;


    private By textoParaValidarQuadroButtons = By.id("panel_heading_one");
    private By textoParaValidarQuadroIFrameButtons = By.id("heading_iframe");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }



    public QuadroButtonsPage obter_textoDaPaginaPrincipalDoQuadroButtons(){
        getDriver().findElement(textoParaValidarQuadroButtons).getText();
        return new QuadroButtonsPage(getDriver());
    }

    public QuadroIframeButtonsPage obter_textoDaPaginaPrincipalDoIFrameButtons(){
        getDriver().findElement(textoParaValidarQuadroButtons).getText();
        return new QuadroIframeButtonsPage(getDriver());
    }

}