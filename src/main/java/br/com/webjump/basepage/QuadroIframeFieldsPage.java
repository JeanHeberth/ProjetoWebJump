package br.com.webjump.basepage;

import br.com.webjump.core.BasePage;
import org.openqa.selenium.WebDriver;

public class QuadroIframeFieldsPage extends BasePage {

    private WebDriver driver;


    public QuadroIframeFieldsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clicarBotaoOne(){

        clicarBotao("btn_one");
    }

    public void clicarOptionThree(){
        clicarBotao("opt_three");
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
