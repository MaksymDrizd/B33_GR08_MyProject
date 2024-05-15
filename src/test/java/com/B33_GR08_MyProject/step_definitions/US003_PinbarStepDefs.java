package com.B33_GR08_MyProject.step_definitions;

import com.B33_GR08_MyProject.pages.US001_DashboardPage;
import com.B33_GR08_MyProject.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US003_PinbarStepDefs {

    US001_DashboardPage dashboardPage = new US001_DashboardPage();

    @When("the user clicks the “Learn how to use this space” link")
    public void the_user_clicks_the_learn_how_to_use_this_space_link() {

        dashboardPage.learnHowToUseThisSpace.click();

    }

    @Then("the user sees “How To Use Pinbar”")
    public void the_user_sees_how_to_use_pinbar() {

        String actualHeader = Driver.getDriver().findElement(By.xpath("//div/h3[.='How To Use Pinbar']")).getText();
        String expectedHeader = "How To Use Pinbar";
        Assert.assertEquals(expectedHeader,actualHeader);

    }

    @Then("the user sees “Use the pin icon on the right top corner of page to create  fast access link in the pinbar.”")
    public void the_user_sees_use_the_pin_icon_on_the_right_top_corner_of_page_to_create_fast_access_link_in_the_pinbar() {

        String actualText = Driver.getDriver().findElement(By.xpath("//p[contains(.,' Use pin icon on the right top corner of page to create fast access link in the pinbar.')]")).getText();
        String expectedText = "Use pin icon on the right top corner of page to create fast access link in the pinbar.";
        Assert.assertEquals(expectedText,actualText);

    }

    @Then("the user sees an image on the page.")
    public void the_user_sees_an_image_on_the_page() {

        String expectedSource = "/bundles/oronavigation/images/pinbar-location.jpg";
        WebElement image = Driver.getDriver().findElement(By.xpath("//p/img"));
        Assert.assertTrue(image.getAttribute("src").contains(expectedSource));

    }


}
