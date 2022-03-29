package br.com.webjump.basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static br.com.webjump.core.DriveFactory.getDriver;

public class QuadroIframeButtonsPage {

    private WebDriver driver;

    private By frame = By.xpath("//*[@id=\"iframe_panel_body\"]/iframe");
    private By botaoOne = By.id("btn_one");
    private By botaoTwo = By.id("btn_two");
    private By botaoFour = By.id("btn_link");


    public QuadroIframeButtonsPage(WebDriver driver) {
        this.driver = driver;
    }

    public QuadroIframeButtonsPage selecionarFrame() {
        driver.switchTo().frame(driver.findElement(frame));
        return new QuadroIframeButtonsPage(getDriver());
    }


    public void clicarNoBotaoOneDoQuadroIFrameButtons() {
        getDriver().findElement(botaoOne).click();
    }

    public void clicarNoBotaoTwoDoQuadroIFrameButtons() {
        getDriver().findElement(botaoTwo).click();
    }

    public void clicarNoBotaoFourDoQuadroIFrameButtons() {
        getDriver().findElement(botaoFour).click();
    }

    public void validarBotaoInexistenteDoBotaoOneDoQuadroIframeButtons() {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), 10);
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("btn_one")));
    }

    public void validarBotaoInexistenteDoBotaoTwoDoQuadroIframeButtons() {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), 10);
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("btn_Two")));
    }

    public void validarBotaoInexistenteDoBotaoFourDoQuadroIframeButtons() {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), 10);
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("btn_link")));

    }


}
