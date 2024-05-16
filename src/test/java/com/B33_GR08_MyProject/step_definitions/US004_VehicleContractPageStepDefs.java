package com.B33_GR08_MyProject.step_definitions;

import com.B33_GR08_MyProject.pages.VehicleContractsPage;
import com.B33_GR08_MyProject.utilities.BrowserUtils;
import com.B33_GR08_MyProject.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US004_VehicleContractPageStepDefs {

    VehicleContractsPage vehicleContractsPage = new VehicleContractsPage();

    @When("the user hovers over to {string} module and selects {string} page")
    public void the_user_hovers_over_to_module_and_selects_page(String tab, String module) {
        vehicleContractsPage.navigateToModule(tab,module);
    }
    @Then("the user sees url {string}")
    public void the_user_sees_url(String expectedURL) {
        BrowserUtils.waitForVisibility(vehicleContractsPage.createVehicleContractButton,120);
        System.out.println(Driver.getDriver().getCurrentUrl());
        BrowserUtils.verifyURLContains(expectedURL);
    }
    @Then("the user sees title {string}")
    public void the_user_sees_title(String expectedTitle) {
        BrowserUtils.waitForVisibility(vehicleContractsPage.createVehicleContractButton,120);
        System.out.println(Driver.getDriver().getTitle());
        BrowserUtils.verifyTitleContains(expectedTitle);
    }
    @Then("the user sees the message {string}")
    public void the_user_sees_the_message(String expectedMessage) {
        WebElement errorMessage = Driver.getDriver().findElement(By.xpath("//div[@class='message' and contains(.,'" + expectedMessage + "')]"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }


}
