package br.com.webjump.elementsPage;

import br.com.webjump.elementsBase.BaseElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeElements extends BaseElements {

    @FindBy(id = "iframe_panel_body")
    protected WebElement iframeButton;
    @FindBy(id = "iframe_panel_body_two")
    protected WebElement iframeFields;
    @FindBy(id = "panel_body_one")
    protected WebElement boxButton;
    public HomeElements(WebDriver driver) {
        super(driver);
    }

}
