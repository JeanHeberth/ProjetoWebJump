package br.com.webjump.elementsPage;

import br.com.webjump.elementsBase.BaseElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuadoFrameFieldsElements extends BaseElements {

    public QuadoFrameFieldsElements(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"iframe_panel_body_two\"]/iframe")
    protected WebElement escolheIframeFields;
    @FindBy(xpath = "//*[@id=\"iframe_panel_body\"]/iframe")
    protected WebElement escolheIframeButtons;

    @FindBy(xpath = "//*[@id=\"panel_body_three\"]/img[4]")
    protected WebElement imgSelenium;
}
