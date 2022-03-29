package br.com.webjump.basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static br.com.webjump.core.DriveFactory.getDriver;

public class QuadroButtonsPage {

    private WebDriver driver;

    private By frame = By.xpath("//*[@id=\"iframe_panel_body\"]/iframe");
    private By botaoOne = By.id("btn_one");
    private By botaoTwo = By.id("btn_two");
    private By botaoFour = By.id("btn_link");

    public QuadroButtonsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clicarNoBotaoOneDoQuadroButtons() {
        getDriver().findElement(botaoOne).click();
    }

    public void clicarNoBotaoTwoDoQuadroButtons() {
        getDriver().findElement(botaoTwo).click();
    }

    public void clicarNoBotaoFourDoQuadroButtons() {
        getDriver().findElement(botaoFour).click();
    }

    public void validarBotaoInexistenteDoBotaoOne() {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), 10);
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("btn_one")));
    }

    public void validarBotaoInexistenteDoBotaoTwo() {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), 10);
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("btn_Two")));
    }

    public void validarBotaoInexistenteDoBotaoFour() {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), 10);
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("btn_link")));

    }

    public QuadroIframeButtonsPage selecionarFrame() {
        driver.switchTo().frame(driver.findElement(frame));
        return new QuadroIframeButtonsPage(getDriver());
    }


}
