Feature: Logging into Saleforce

  In order to work
  As a sales person
  I want to login


Scenario: Logging in salesforce

  Given I go to "http://salesforce.com" on "Mozilla"
  And I enter "username" as "sayem4@gmail.com"
  And I enter "password" as "sami3092"
  And I click on "loginButton"
  Then login should be "success"


