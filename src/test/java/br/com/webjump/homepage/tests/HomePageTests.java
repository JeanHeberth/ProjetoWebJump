package br.com.webjump.homepage.tests;

import br.com.webjump.basepage.QuadroButtonsPage;
import br.com.webjump.basepage.QuadroIframeButtonsPage;
import br.com.webjump.basepage.QuadroIframeFieldsPage;
import br.com.webjump.core.BaseTests;
import org.junit.jupiter.api.RepeatedTest;


public class HomePageTests extends BaseTests {

    QuadroButtonsPage quadroButtonsPage;
    QuadroIframeButtonsPage quadroIframeButtonsPage;
    QuadroIframeFieldsPage quadroIframeFieldsPages;

    @RepeatedTest(5)
    public void clicarNoBotaoOneTwoFourDoQuadroButtons() {
        //Verificando se a janela está na pagina principal
        quadroButtonsPage = homePage.validarCaixaButtonsDaPaginaPrincipal();

        // Clicando nos botoes ONE, TWO e FOUR.
        quadroButtonsPage.clicarBotaoOne();
        quadroButtonsPage.clicarBotaoTwo();
        quadroButtonsPage.clicarBotaoFour();

        //Validações
        quadroButtonsPage.validarBotaoInexistenteDoBotaoOne();
        quadroButtonsPage.validarBotaoInexistenteDoBotaoTwo();
        quadroButtonsPage.validarBotaoInexistenteDoBotaoFour();

    }


    @RepeatedTest(5)
    public void clicarNoBotaoOneTwoFourDoQuadroIframeButtons() {


        //Verificando se a janela está na pagina principal
        quadroIframeButtonsPage = homePage.validarCaixaIFrameButtonsDaPaginaPrincipal();

        // Selecionando o Frame a ser atingido
        quadroIframeButtonsPage.selecionarFrameButtons();

        // Clicando nos botoes ONE, TWO e FOUR.
        quadroIframeButtonsPage.clicarBotaoOne();
        quadroIframeButtonsPage.clicarBotaoTwo();
        quadroIframeButtonsPage.clicarBotaoFour();


        //Validações
        quadroIframeButtonsPage.validarBotaoInexistenteDoBotaoOne();
        quadroIframeButtonsPage.validarBotaoInexistenteDoBotaoTwo();
        quadroIframeButtonsPage.validarBotaoInexistenteDoBotaoFour();

    }


    @RepeatedTest(5)
    public void preencherTourFirstName_clicarNoBotaoOne_checarOptionThree_selecionarExampleTwo() {

        //Verificando se a janela está na pagina principal
        quadroIframeFieldsPages = homePage.validarCaixaIFrameFieldsDaPaginaPrincipal();

        // Selecionando o Frame a ser atingido
        quadroIframeFieldsPages.selecionarFrameFields();

        //Escrever texto
        quadroIframeFieldsPages.escreverTexto("Você é capaz, acredite sempre em você!");

        // Selecionando o Frame a ser atingido
        quadroIframeFieldsPages.selecionarFrameButtons();

        // Clicando nos botoes ONE, TWO e FOUR.
        quadroIframeFieldsPages.clicarBotaoOne();

        //Clicar optionThree
        quadroIframeFieldsPages.clicarOptionThree();

        // Selecionando o exempleTwo
        quadroIframeFieldsPages.selecionarExemplos("ExampleTwo");


    }
}

