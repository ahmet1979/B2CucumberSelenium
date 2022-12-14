package com.krafttech.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenu_stepDefs {
    @Given("Get the text of dashboard")
    public void get_the_text_of_dashboard() {
        System.out.println("Get the text of dashboard");
    }



    @When("Go to Developers menu")
    public void goToDevelopersMenu() {
        System.out.println("Go to Developers menu");
    }

    @Then("Get the text of Developer")
    public void getTheTextOfDeveloper() {
        System.out.println("Get the text of Developer");
    }

    @When("Go to Edit Profile menu")
    public void goToEditProfileMenu() {
        System.out.println("Go to Edit Profile menu");
    }

    @Then("Get the text of Edit User Profile")
    public void getTheTextOfEditUserProfile() {
        System.out.println("Get the text of Edit User Profile");
    }

    @When("Go to My Profile menu")
    public void goToMyProfileMenu() {
        System.out.println("Go to My Profile menu");
    }

    @Then("Get the text of User Profile")
    public void getTheTextOfUserProfile() {
        System.out.println("Get the text of User Profile");
    }
}
