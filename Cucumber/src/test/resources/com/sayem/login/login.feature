Feature: Logging into Saleforce

  In order to work
  As a sales person
  I want to login


Scenario: Logging in salesforce

  Given I go to "loginURL" on "Mozilla"
  And I enter "loginusername" as "sayem4@gmail.com"
  And I enter "lognpassword" as "sami3092"
  And I click on "loginbutton"
  Then Login should be "success"


