package com.krafttech.step_definitions;

import com.krafttech.pages.LoginPages;
import com.krafttech.pages.ProfilePage;
import com.krafttech.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class task_stepDefs {
    LoginPages loginPages=new LoginPages();
    ProfilePage profilePage=new ProfilePage();
    @Then("User should see profile options and user name")
    public void user_should_see_profile_options_and_user_name(List<String> profileOptionsAndUserName) {
        List<String> actualOptionsAndUserName= BrowserUtils.getElementsText(profilePage.profileOptionsAndUserName_loc);
        System.out.println("actualOptionsAndUserName.size() = " + actualOptionsAndUserName.size());
        System.out.println("actualOptionsAndUserName = " + actualOptionsAndUserName);
        System.out.println("profileOptionsAndUserName = " + profileOptionsAndUserName);

        Assert.assertEquals(profileOptionsAndUserName, actualOptionsAndUserName);



    }


    @When("User should input  information click Add Experience")
    public void user_should_input_information_click_add_experience() {
profilePage.jobTitle.sendKeys("QA TESTER");
profilePage.companyexperience.sendKeys("Amazon");
profilePage.locationExperience.sendKeys("Los Angeles");
profilePage.startYear.sendKeys("10.10.2020");
profilePage.endYear.sendKeys("10.10.2022");
profilePage.jobDescription.sendKeys("TestNG,Postman,Cucumber,Selenium");
profilePage.addExperienceBtn.click();
    }
    @Then("User should see Overview module")
    public void user_should_see_overview_module() {
String expectedTitle="Profile Details";
String actualTitle=profilePage.profileDetails.getText();
Assert.assertEquals(expectedTitle,actualTitle);
    }


    @And("User should go to {string} module")
    public void userShouldGoToModule(String tabName) {
        profilePage.profileTabs(tabName);
    }
}
