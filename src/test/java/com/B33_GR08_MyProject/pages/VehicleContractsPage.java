package com.B33_GR08_MyProject.pages;

import com.B33_GR08_MyProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleContractsPage extends BasePage{

    public VehicleContractsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@title='Create Vehicle Contract']")
    public WebElement createVehicleContractButton;

}
