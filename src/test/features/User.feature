Feature: As a user

  Background:
    Given I'm on login page
    When  I enter username and password
    And   I click on login
    Then  I should be able to login successfully
    When  I click on product
    When  I click on productList
    Then  I should be  redirected to product page


  Scenario: I should be able to search
    When  I enter into search field "DomProduct"
    When  I click on filter button
    Then  i should be seeing only product 3 in the home page


    Scenario: I should be able to update
      When  I click on edit in "Product 1"
      Then  I should be  redirected to edit "product 1" page
      When  I enter new data "one year" in Product Warranty Details field
      Then  I should be able to update it successfully