package br.com.webjump.page;

import br.com.webjump.elementsPage.HomeElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends HomeElements {

    private WebDriver driver;


    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public QuadroButtonPage validarFrameButtonsSeEstaPresente(){
        boxButton.getText();
        return new QuadroButtonPage(driver);
    }

    public QuadroIframeButtonsPage validarIframeButtonSeEstaPresente(){
      iframeButton.getText();
      return new QuadroIframeButtonsPage(driver);
    }

    public QuadroIframeFildesPage validarFrameFieldsSeEstaPresente(){
        iframeFields.getText();
        return new QuadroIframeFildesPage(driver);
    }

}