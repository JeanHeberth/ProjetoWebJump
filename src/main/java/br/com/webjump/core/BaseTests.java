package br.com.webjump.core;

import br.com.webjump.basepage.HomePage;
import br.com.webjump.basepage.QuadroIframeFieldsPage;
import br.com.webjump.util.ScreenShot;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static br.com.webjump.core.DriveFactory.getDriver;
import static br.com.webjump.core.DriveFactory.killDriver;


public class BaseTests {

    protected HomePage homePage;
    protected QuadroIframeFieldsPage quadroIframeFieldsPages;

    @BeforeEach
    public void carregarPaginaInicial() {
        homePage = new HomePage(getDriver());

    }


    @AfterEach
    public void finaliza() {
        ScreenShot.takeScreenShot(getDriver());
        killDriver();
    }

}
