package com.sayem.login;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginTest {

    @Given("^I go to \"([^\"]*)\" on \"([^\"]*)\"$")
    public void goToSalesforce(String url, String browser){
        System.out.println("I am going to "+url+"on " + browser);
    }

    @And("^I enter \"([^\"]*)\" as \"([^\"]*)\"$")
    public void userName(String object, String text){
        System.out.println("Entering " +object+ "value "+text);
    }

    @And("^I click on \"([^\"]*)\"$")
    public void loginButton(String object){
        System.out.println("clicking on "+object);
    }

    @Then("login should be \"([^\"]*)\"")
    public void loginShouldBeSuccess(String expectedResult){
        System.out.println("Login - "+ expectedResult);
    }

}
