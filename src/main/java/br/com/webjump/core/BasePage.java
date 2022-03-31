package br.com.webjump.core;

import br.com.webjump.basepage.QuadroButtonsPage;
import br.com.webjump.basepage.QuadroIframeFieldsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static br.com.webjump.core.DriveFactory.getDriver;


public class BasePage {

    //Metodo para clicar em elementos utilizando Xpath
    public void clicarBotao(String botao) {
        getDriver().findElement(By.id(botao)).click();

    }

    //Metodo para selecionar Frame
    public QuadroIframeFieldsPage selecionarFrame(String selecionarFrameButtons) {
        getDriver().switchTo().parentFrame();
        getDriver().switchTo().frame(getDriver().findElement(By.xpath(selecionarFrameButtons)));
        return new QuadroIframeFieldsPage(getDriver());
    }

    //Metodo para alterar o exemplo no dropDown
    public void campoSelecionarExemplos(String id_campoSelecionado, String valor) {
        WebElement selecionaExemplo = getDriver().findElement(By.id(id_campoSelecionado));
        Select combo = new Select(selecionaExemplo);
        combo.selectByVisibleText(valor);
        getDriver().switchTo().parentFrame();

    }

    //Metodo para escrever texto
    public void escreverTextoNoIframeFields(String id_campo, String texto) {
        getDriver().findElement(By.id(id_campo)).sendKeys(texto);
    }

    // Validações


    //Metodo para validar se os IFrames estão na tela.
    public QuadroButtonsPage validarCaixaNaTela(String validarCaixaNaTela) {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), 3);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(validarCaixaNaTela)));
        return new QuadroButtonsPage(getDriver());
    }

    public QuadroIframeFieldsPage validarCaixaNaTelaIFrameButtons(String validarCaixaNaTela) {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), 3);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(validarCaixaNaTela)));
        return new QuadroIframeFieldsPage(getDriver());
    }

    public QuadroIframeFieldsPage validarCaixaNaTelaIFrameFields(String validarCaixaNaTela) {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), 3);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(validarCaixaNaTela)));
        return new QuadroIframeFieldsPage(getDriver());
    }

    //Metodo para validar a inexistência
    public void validarBotaoInexistenteDoBotao(String validarInexistencia) {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), 60);
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(validarInexistencia)));
    }

    //Metodo para validar a imagem do selenium
    public void validarImagemDoSeleniumNaTela(String validarImagem) {
        getDriver().findElement(By.xpath(validarImagem)).isDisplayed();
    }
}