Feature: Test add item to and edit basket at https://www.amazon.co.uk/

  As a non-registered user
  I want to search items on Amazon
  So that I can add items to basket and edit basket

  Scenario Outline: Search from search bar
    Given web browser is at web page "<Web page>"
    And user chooses section from dropdown "<Dropdown section>"
    When user enters item in search field "<Item title>"
    Then results for item are shown "<Item title>"
    And first item that appears in search result has type "<Item type>"
    And first item that appears in search result has price "<Item price>"

    Examples:
      | Web page                                                                | Dropdown section | Item title                                          | Item type | Item price |
      | Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more | Books            | Harry Potter and the Cursed Child - Parts One & Two | Paperback | £3.99      |

