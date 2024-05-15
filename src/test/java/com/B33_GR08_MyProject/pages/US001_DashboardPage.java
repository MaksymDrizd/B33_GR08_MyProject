package com.B33_GR08_MyProject.pages;

import com.B33_GR08_MyProject.utilities.BrowserUtils;
import com.B33_GR08_MyProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class US001_DashboardPage extends BasePage{

    public US001_DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a/span[@class='title title-level-1'])[1]")
    public WebElement firstMenuOption;

    @FindBy(xpath = "//a[@href='http://www.oroinc.com/doc']")
    public WebElement questionMarkIcon;

    @FindBy(linkText = "Learn how to use this space")
    public WebElement learnHowToUseThisSpace;
    public List<String> actualMainModules(){
        List<String> actualMainModules = new ArrayList<>();
        BrowserUtils.waitForVisibility(firstMenuOption,120);
        for (WebElement each : menuOptions) {
            actualMainModules.add(each.getText());
        }
        return actualMainModules;
    }
}
