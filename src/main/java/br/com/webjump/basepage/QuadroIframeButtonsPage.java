package br.com.webjump.basepage;

import br.com.webjump.core.BasePage;
import org.openqa.selenium.WebDriver;

public class QuadroIframeButtonsPage extends BasePage {

    private WebDriver driver;


    public QuadroIframeButtonsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clicarBotaoOne(){
        clicarBotao("btn_one");
    }

    public void clicarBotaoTwo(){
        clicarBotao("btn_two");
    }

    public void clicarBotaoFour() {
        clicarBotao("btn_link");
    }

    public void validarBotaoInexistenteDoBotaoOne() {
        validarBotaoInexistenteDoBotao("btn_one");
    }

    public void validarBotaoInexistenteDoBotaoTwo() {
        validarBotaoInexistenteDoBotao("btn_two");
    }

    public void validarBotaoInexistenteDoBotaoFour() {
        validarBotaoInexistenteDoBotao("btn_link");
    }

    public void selecionarFrameButtons(){
        selecionarFrame("//*[@id=\"iframe_panel_body\"]/iframe");
    }
    public void selecionarFrameFields(){
        selecionarFrame("//*[@id=\"iframe_panel_body_two\"]/iframe");
    }

    public void selecionarExemplos(String exemploEscolhido){
        campoSelecionarExemplos("select_box",exemploEscolhido);
    }

    public void escreverTexto(String texto) {
       escreverTextoNoIframeFields("first_name", texto);
    }

}
