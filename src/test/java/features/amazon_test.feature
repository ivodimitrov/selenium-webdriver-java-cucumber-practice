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
      | Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more | Books            | Harry Potter and the Cursed Child - Parts One & Two | Paperback | £5.99      |

  Scenario Outline: Navigate to item details
    Given web browser is at web page "<Web page>"
    And user chooses section from dropdown "<Dropdown section>"
    And user enters item in search field "<Item title>"
    When user clicks on first item that appears in search result
    Then new web page is loaded with item details "<Item title>"
    And item has title "<Item title>"
    And item has type "<Item type>"
    And item has price "<Item price>"

    Examples:
      | Web page                                                                | Dropdown section | Item title                        | Item type | Item price |
      | Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more | Books            | Harry Potter and the Cursed Child | Paperback | £5.99      |

  Scenario Outline: Add item to basket
    Given web browser is at web page "<Web page>"
    And user chooses section from dropdown "<Dropdown section>"
    And user enters item in search field "<Item title>"
    And user clicks on first item that appears in search result
    When user clicks on add button
    Then notification is shown "<Notification>"
    And item has quantity "<Quantity>"

    Examples:
      | Web page                                                                | Dropdown section | Item title                                          | Notification    | Quantity |
      | Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more | Books            | Harry Potter and the Cursed Child - Parts One & Two | Added to Basket | 1        |

  Scenario Outline: Edit basket
    Given web browser is at web page "<Web page>"
    And user chooses section from dropdown "<Dropdown section>"
    And user enters item in search field "<Item title>"
    And user clicks on first item that appears in search result
    And user clicks on add button
    When user clicks on edit button
    Then new page "<Basket web page>" is loaded with basket details "<Basket details>"
    And item in basket has title "<Item title>"
    And item in basket has type "<Item type>"
    And item in basket has price "<Item price>"
    And item in basket has quantity "<Quantity>"
    And basket has total price "<Total price>"

    Examples:
      | Web page                                                                | Dropdown section | Item title                        | Basket web page              | Basket details  | Item type | Item price | Quantity | Total price |
      | Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more | Books            | Harry Potter and the Cursed Child | Amazon.co.uk Shopping Basket | Shopping Basket | Paperback | £5.99      | 1        | £5.99       |