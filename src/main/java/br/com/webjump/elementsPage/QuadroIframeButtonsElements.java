package br.com.webjump.elementsPage;

import br.com.webjump.elementsBase.BaseElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuadroIframeButtonsElements extends BaseElements {


    public QuadroIframeButtonsElements(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"iframe_panel_body\"]/iframe")
    protected WebElement escolheIframeButtons;



}
