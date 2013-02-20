package com.sayem.login;

import cucumber.api.java.en.*;

public class LoginTest {
    @Given("^I am a [a-zA-Z]{1,} tester$")
    public void I_am_a_bad_tester(){
        System.out.println("********************************");
        System.out.println("@Given - I_am_a_bad_tester()");
    }

    @When("^I go to work$")
    public void I_go_to_work(){
        System.out.println("@When - I_go_to_work()");
    }

    @Then("^I [a-zA-Z]{1,} it$")
    public void I_mess_with_it(){
        System.out.println("@Then - I_mess_with_it()");
    }

    @And("^My boss [a-zA-Z]{1,} me$")
    public void My_boss_fires_me(){
        System.out.println("@And - My_boss_fires_me()");
    }

    @But("^The developer [a-zA-Z]{1,} me$")
    public void The_developer_likes_me(){
        System.out.println("@But - The_developer_likes_me()");
    }
}
