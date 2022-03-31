package br.com.webjump.basepage;

import br.com.webjump.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QuadroButtonsPage extends BasePage {

    private WebDriver driver;

    private By frame = By.xpath("//*[@id=\"iframe_panel_body\"]/iframe");


    public QuadroButtonsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clicarBotaoOne() {
        clicarBotao("btn_one");
    }

    public void clicarBotaoTwo() {
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


}
