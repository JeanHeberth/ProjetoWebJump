package br.com.webjump.homepage;

import br.com.webjump.basepage.QuadroButtonsPage;
import br.com.webjump.basepage.QuadroIframeButtonsPage;
import br.com.webjump.core.BaseTests;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class HomePageTests extends BaseTests {

    @Test
    public void validarTelaPrincipal() {
        assertThat(homePage.obter_textoDaPaginaPrincipalDoQuadroButtons(), is("Buttons"));
    }

    QuadroButtonsPage quadroButtonsPage;

    @Test
    public void clicarNoBotaoOneTwoFourDoQuadroButtons() {
        //Verificando se a janela está na pagina principal
        quadroButtonsPage = homePage.obter_textoDaPaginaPrincipalDoQuadroButtons();

        // Clicando nos botoes ONE, TWO e FOUR.
        quadroButtonsPage.clicarNoBotaoOneDoQuadroButtons();
        quadroButtonsPage.clicarNoBotaoTwoDoQuadroButtons();
        quadroButtonsPage.clicarNoBotaoFourDoQuadroButtons();

        //Validações
        quadroButtonsPage.validarBotaoInexistenteDoBotaoOne();
        quadroButtonsPage.validarBotaoInexistenteDoBotaoTwo();
        quadroButtonsPage.validarBotaoInexistenteDoBotaoFour();

    }

    QuadroIframeButtonsPage quadroIframeButtonsPage;

    @Test
    public void clicarNoBotaoOneTwoFourDoQuadroIframeButtons() {


        //Verificando se a janela está na pagina principal
        quadroIframeButtonsPage = homePage.obter_textoDaPaginaPrincipalDoIFrameButtons();

        // Selecionando o Frame a ser atingido
        quadroIframeButtonsPage.selecionarFrame();

        // Clicando nos botoes ONE, TWO e FOUR.
        quadroIframeButtonsPage.clicarNoBotaoOneDoQuadroIFrameButtons();
        quadroIframeButtonsPage.clicarNoBotaoTwoDoQuadroIFrameButtons();
        quadroIframeButtonsPage.clicarNoBotaoFourDoQuadroIFrameButtons();


        //Validações
        quadroIframeButtonsPage.validarBotaoInexistenteDoBotaoOneDoQuadroIframeButtons();
        quadroIframeButtonsPage.validarBotaoInexistenteDoBotaoTwoDoQuadroIframeButtons();
        quadroIframeButtonsPage.validarBotaoInexistenteDoBotaoFourDoQuadroIframeButtons();
    }
}
