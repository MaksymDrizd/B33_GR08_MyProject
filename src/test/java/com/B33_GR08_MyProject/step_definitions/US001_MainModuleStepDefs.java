package com.B33_GR08_MyProject.step_definitions;

import com.B33_GR08_MyProject.pages.US001_DashboardPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class US001_MainModuleStepDefs {
    US001_DashboardPage dashboardPage = new US001_DashboardPage();

    @Then("the user on the Dashboard page can see {int} module names:")
    public void the_user_on_the_dashboard_page_can_see_module_names(int moduleCount, List<String> expectedMainModules) {

        Assert.assertEquals(expectedMainModules,dashboardPage.actualMainModules());

    }

}
