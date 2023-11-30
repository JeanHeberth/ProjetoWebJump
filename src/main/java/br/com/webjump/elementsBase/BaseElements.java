package br.com.webjump.elementsBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BaseElements {
    protected WebDriver driver;

    public BaseElements(WebDriver driver) {
        this.driver = driver;
    }


    @FindBy(id = "btn_one")
    protected WebElement btnOne;
    @FindBy(id = "btn_two")
    protected WebElement btnTwo;
    @FindBy(id = "btn_link")
    protected WebElement linkFour;
    @FindBy(id = "first_name")
    protected WebElement txtNome;
    @FindBy(id = "opt_three")
    protected WebElement checkOption;

    @FindBy(id = "select_box")
    protected WebElement dropDownExample;



}
