package com.B33_GR08_MyProject.step_definitions;

import com.B33_GR08_MyProject.pages.US001_DashboardPage;
import com.B33_GR08_MyProject.utilities.BrowserUtils;
import com.B33_GR08_MyProject.utilities.Driver;
import io.cucumber.java.en.Then;

public class US002_OroincDocumentationStepDefs {

    US001_DashboardPage dashboardPage = new US001_DashboardPage();

    @Then("user click on the question mark icon")
    public void user_click_on_the_question_mark_icon() {

        dashboardPage.questionMarkIcon.click();

    }

    @Then("user should access to the Oroinc Documentation page")
    public void user_should_access_to_the_oroinc_documentation_page() {

        String expectedTitle = "Welcome to Oro Documentation";
        BrowserUtils.switchWindowAndVerify("https://doc.oroinc.com/",expectedTitle);


    }
}
