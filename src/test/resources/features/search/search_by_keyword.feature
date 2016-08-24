Feature: Searching by keyword

  In order to find items that I would like to purchase
  As a potential buyer
  I want to be able to search for items containing certain words

  Scenario: Should list items related to a specified keyword
    Given I want to buy a wool scarf
    When I search for items containing 'wool'
    Then I should only see items related to 'wool'

  Scenario Outline: Filter by different item types
    Given I have searched for items containing '<material>'
    When I filter results by type '<type>'
    Then I should only see items containing '<material>' of type '<type>'
    Examples:
      | material | type           |
      | silk     | Handmade       |
      | bronze   | Vintage        |
      | wool     | Craft Supplies |
