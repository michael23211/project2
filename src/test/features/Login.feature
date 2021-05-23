Feature: As a user

  Scenario: Login with valid credential
       Given I'm on login page
       When  I enter username and password
       And   I click on login
       Then  I should be able to login successfully