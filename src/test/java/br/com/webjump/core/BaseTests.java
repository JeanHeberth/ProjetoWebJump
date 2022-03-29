package br.com.webjump.core;

import br.com.webjump.basepage.HomePage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;

import static br.com.webjump.core.DriveFactory.getDriver;
import static br.com.webjump.core.DriveFactory.killDriver;


public class BaseTests {


    protected HomePage homePage;


    @BeforeEach
    public void carregarPaginaInicial() {
        homePage = new HomePage(getDriver());

    }

    @AfterAll
    public static void finaliza() {
        killDriver();
    }


}
