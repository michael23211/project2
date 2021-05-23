Feature: As a Receptionist

  Scenario:validate Receptionist user  is able to modify any user except admin user and update it
    Given I am in login page
    When  I enter userName and password
    When  I click on Login button
    Then  I should login and get redirected to account page
    When  I click on user
    When  I click on userList
    Then  I should be able to modify "Installer1"  user
