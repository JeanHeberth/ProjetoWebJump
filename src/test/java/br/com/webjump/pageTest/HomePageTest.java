package br.com.webjump.pageTest;

import br.com.webjump.base.BaseTest;
import br.com.webjump.core.BrowserConfig;
import br.com.webjump.page.HomePage;
import br.com.webjump.page.QuadroButtonPage;
import br.com.webjump.page.QuadroIframeButtonsPage;
import br.com.webjump.page.QuadroIframeFildesPage;
import com.smartbear.zephyrscale.junit.annotation.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class HomePageTest extends BaseTest {

    WebDriver driver;
    private BrowserConfig browserConfig;
    private HomePage homePage;

    @BeforeEach
    public void beforeEach(){
        initWebDriver();
    }

    private void initWebDriver() {
        browserConfig = new BrowserConfig();
        driver = browserConfig.setUp();
        homePage = new HomePage(driver);
    }

    @AfterEach
    public void afterEach() {
        browserConfig.tearDown(driver);
    }

    @Test
    @TestCase(key = "KAN-T1")
    @DisplayName("clicar no botao one, two, four do quadro Buttons")
    public void clicarNoBotaoOneTwoFourDoQuadroButtons() {
        QuadroButtonPage quadroButtonPage = homePage.validarFrameButtonsSeEstaPresente();
        quadroButtonPage.clicarBoaoOneTwoFour();
        assertFalse(quadroButtonPage.btnOneTwoFourExistem());

    }

    @Test
    @DisplayName("clicar no botao one, two, four do quadro IframeButtons")
    public void clicarNoBotaoOneTwoFourDoQuadroIframeButtons() {
        QuadroIframeButtonsPage quadroIframeButtonsPage = homePage.validarIframeButtonSeEstaPresente();
        quadroIframeButtonsPage.acessarIframeButton();
        quadroIframeButtonsPage.clicarBoaoOneTwoFour();
        assertFalse(quadroIframeButtonsPage.btnOneTwoFourExistem());

    }

    @Test
    @DisplayName("Preencher tour: First Name, clicar no botão One, checar Option Three, selecionar Example Two")
    public void preencherTourFirstName_clicarNoBotaoOne_checarOptionThree_selecionarExampleTwo() {
        QuadroIframeFildesPage quadroIframeFildesPage = homePage.validarFrameFieldsSeEstaPresente();
        quadroIframeFildesPage.acessarIframeFields();
        quadroIframeFildesPage.escreverTexto("Você é capaz, acredite sempre em você!");
        quadroIframeFildesPage.acessarIframeButton();
        quadroIframeFildesPage.clicarBotaOne();
        quadroIframeFildesPage.checarOptionThree();
        quadroIframeFildesPage.selecionarExampleTwo();
        quadroIframeFildesPage.validandoImagemSelenium();

    }

}
