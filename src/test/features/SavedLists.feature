Feature: As a user
         I should save products for future purchase


  Scenario: Validate SavedList redirection from home page header

     Given I'm on Homepage
     When  I click SavedList Icon
    Then  I should redirected to the saved lists with text as "You have no Saved Items"

    Scenario Outline: Add more item to bag

      Given I'm on Homepage
      When  I search using "searchTerm"
      And   I choose a product "<productName>"
      And   I select size "<size>"
      And   I click add to bag
      Then  the product "<productName>" should be in the bag

      Examples:
      |searchTerm|productName    |size |
      | T-Shirt  |White T-Shirt  |  S  |
      | Jeans    |Black          |  S  |
      |Joggers  |Printed Joggers |  M  |
