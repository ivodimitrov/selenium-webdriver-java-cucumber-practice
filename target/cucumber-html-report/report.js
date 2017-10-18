$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("amazon_test.feature");
formatter.feature({
  "line": 1,
  "name": "Test add item to and edit basket at https://www.amazon.co.uk/",
  "description": "\r\nAs a non-registered user\r\nI want to search items on Amazon\r\nSo that I can add items to basket and edit basket",
  "id": "test-add-item-to-and-edit-basket-at-https://www.amazon.co.uk/",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Search from search bar",
  "description": "",
  "id": "test-add-item-to-and-edit-basket-at-https://www.amazon.co.uk/;search-from-search-bar",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "web browser is at web page \"\u003cWeb page\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user chooses section from dropdown \"\u003cDropdown section\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user enters item in search field \"\u003cItem title\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "results for item are shown \"\u003cItem title\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "first item that appears in search result has type \"\u003cItem type\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "first item that appears in search result has price \"\u003cItem price\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "test-add-item-to-and-edit-basket-at-https://www.amazon.co.uk/;search-from-search-bar;",
  "rows": [
    {
      "cells": [
        "Web page",
        "Dropdown section",
        "Item title",
        "Item type",
        "Item price"
      ],
      "line": 16,
      "id": "test-add-item-to-and-edit-basket-at-https://www.amazon.co.uk/;search-from-search-bar;;1"
    },
    {
      "cells": [
        "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment \u0026 more",
        "Books",
        "Harry Potter and the Cursed Child - Parts One \u0026 Two",
        "Paperback",
        "£3.99"
      ],
      "line": 17,
      "id": "test-add-item-to-and-edit-basket-at-https://www.amazon.co.uk/;search-from-search-bar;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4781983911,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Search from search bar",
  "description": "",
  "id": "test-add-item-to-and-edit-basket-at-https://www.amazon.co.uk/;search-from-search-bar;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "web browser is at web page \"Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment \u0026 more\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user chooses section from dropdown \"Books\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user enters item in search field \"Harry Potter and the Cursed Child - Parts One \u0026 Two\"",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "results for item are shown \"Harry Potter and the Cursed Child - Parts One \u0026 Two\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "first item that appears in search result has type \"Paperback\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "first item that appears in search result has price \"£3.99\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment \u0026 more",
      "offset": 28
    }
  ],
  "location": "SearchFromSearchBar.webBrowserIsAtWebPage(String)"
});
formatter.result({
  "duration": 171656656,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Books",
      "offset": 36
    }
  ],
  "location": "SearchFromSearchBar.userChoosesSectionFromDropdown(String)"
});
formatter.result({
  "duration": 1569803190,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Harry Potter and the Cursed Child - Parts One \u0026 Two",
      "offset": 34
    }
  ],
  "location": "SearchFromSearchBar.userEntersItemInSearchField(String)"
});
formatter.result({
  "duration": 1849775067,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Harry Potter and the Cursed Child - Parts One \u0026 Two",
      "offset": 28
    }
  ],
  "location": "SearchFromSearchBar.resultsForItemAreShown(String)"
});
formatter.result({
  "duration": 138593463,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Paperback",
      "offset": 51
    }
  ],
  "location": "SearchFromSearchBar.firstItemThatAppearsInSearchResultHasType(String)"
});
formatter.result({
  "duration": 64443978,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "£3.99",
      "offset": 52
    }
  ],
  "location": "SearchFromSearchBar.firstItemThatAppearsInSearchResultHasPrice(String)"
});
formatter.result({
  "duration": 66307347,
  "status": "passed"
});
formatter.after({
  "duration": 765774399,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 19,
  "name": "Navigate to item details",
  "description": "",
  "id": "test-add-item-to-and-edit-basket-at-https://www.amazon.co.uk/;navigate-to-item-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 20,
  "name": "web browser is at web page \"\u003cWeb page\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "user chooses section from dropdown \"\u003cDropdown section\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user enters item in search field \"\u003cItem title\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user clicks on first item that appears in search result",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "new web page is loaded with item details \"\u003cItem title\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "item has title \"\u003cItem title\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "item has type \"\u003cItem type\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "item has price \"\u003cItem price\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "test-add-item-to-and-edit-basket-at-https://www.amazon.co.uk/;navigate-to-item-details;",
  "rows": [
    {
      "cells": [
        "Web page",
        "Dropdown section",
        "Item title",
        "Item type",
        "Item price"
      ],
      "line": 30,
      "id": "test-add-item-to-and-edit-basket-at-https://www.amazon.co.uk/;navigate-to-item-details;;1"
    },
    {
      "cells": [
        "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment \u0026 more",
        "Books",
        "Harry Potter and the Cursed Child",
        "Paperback",
        "£3.99"
      ],
      "line": 31,
      "id": "test-add-item-to-and-edit-basket-at-https://www.amazon.co.uk/;navigate-to-item-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4261459118,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Navigate to item details",
  "description": "",
  "id": "test-add-item-to-and-edit-basket-at-https://www.amazon.co.uk/;navigate-to-item-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 20,
  "name": "web browser is at web page \"Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment \u0026 more\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "user chooses section from dropdown \"Books\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user enters item in search field \"Harry Potter and the Cursed Child\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user clicks on first item that appears in search result",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "new web page is loaded with item details \"Harry Potter and the Cursed Child\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "item has title \"Harry Potter and the Cursed Child\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "item has type \"Paperback\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "item has price \"£3.99\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment \u0026 more",
      "offset": 28
    }
  ],
  "location": "SearchFromSearchBar.webBrowserIsAtWebPage(String)"
});
formatter.result({
  "duration": 91523281,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Books",
      "offset": 36
    }
  ],
  "location": "SearchFromSearchBar.userChoosesSectionFromDropdown(String)"
});
formatter.result({
  "duration": 1594895071,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Harry Potter and the Cursed Child",
      "offset": 34
    }
  ],
  "location": "SearchFromSearchBar.userEntersItemInSearchField(String)"
});
formatter.result({
  "duration": 2231918939,
  "status": "passed"
});
formatter.match({
  "location": "NavigateToItemDetails.userClicksOnFirstItemThatAppearsInSearchResult()"
});
formatter.result({
  "duration": 3233210978,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Harry Potter and the Cursed Child",
      "offset": 42
    }
  ],
  "location": "NavigateToItemDetails.newWebPageIsLoadedWithItemDetails(String)"
});
formatter.result({
  "duration": 73028163,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Harry Potter and the Cursed Child",
      "offset": 16
    }
  ],
  "location": "NavigateToItemDetails.itemHasTitle(String)"
});
formatter.result({
  "duration": 74109081,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Paperback",
      "offset": 15
    }
  ],
  "location": "NavigateToItemDetails.itemHasType(String)"
});
formatter.result({
  "duration": 65956241,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "£3.99",
      "offset": 16
    }
  ],
  "location": "NavigateToItemDetails.itemHasPrice(String)"
});
formatter.result({
  "duration": 60907306,
  "status": "passed"
});
formatter.after({
  "duration": 707187127,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 33,
  "name": "Add item to basket",
  "description": "",
  "id": "test-add-item-to-and-edit-basket-at-https://www.amazon.co.uk/;add-item-to-basket",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 34,
  "name": "web browser is at web page \"\u003cWeb page\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "user chooses section from dropdown \"\u003cDropdown section\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user enters item in search field \"\u003cItem title\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user clicks on first item that appears in search result",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user clicks on add button",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "notification is shown \"\u003cNotification\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "item has quantity \"\u003cQuantity\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 42,
  "name": "",
  "description": "",
  "id": "test-add-item-to-and-edit-basket-at-https://www.amazon.co.uk/;add-item-to-basket;",
  "rows": [
    {
      "cells": [
        "Web page",
        "Dropdown section",
        "Item title",
        "Notification",
        "Quantity"
      ],
      "line": 43,
      "id": "test-add-item-to-and-edit-basket-at-https://www.amazon.co.uk/;add-item-to-basket;;1"
    },
    {
      "cells": [
        "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment \u0026 more",
        "Books",
        "Harry Potter and the Cursed Child - Parts One \u0026 Two",
        "Added to Basket",
        "1"
      ],
      "line": 44,
      "id": "test-add-item-to-and-edit-basket-at-https://www.amazon.co.uk/;add-item-to-basket;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4207745513,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "Add item to basket",
  "description": "",
  "id": "test-add-item-to-and-edit-basket-at-https://www.amazon.co.uk/;add-item-to-basket;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 34,
  "name": "web browser is at web page \"Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment \u0026 more\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "user chooses section from dropdown \"Books\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user enters item in search field \"Harry Potter and the Cursed Child - Parts One \u0026 Two\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user clicks on first item that appears in search result",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user clicks on add button",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "notification is shown \"Added to Basket\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "item has quantity \"1\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment \u0026 more",
      "offset": 28
    }
  ],
  "location": "SearchFromSearchBar.webBrowserIsAtWebPage(String)"
});
formatter.result({
  "duration": 68064586,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Books",
      "offset": 36
    }
  ],
  "location": "SearchFromSearchBar.userChoosesSectionFromDropdown(String)"
});
formatter.result({
  "duration": 1645157362,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Harry Potter and the Cursed Child - Parts One \u0026 Two",
      "offset": 34
    }
  ],
  "location": "SearchFromSearchBar.userEntersItemInSearchField(String)"
});
formatter.result({
  "duration": 2046948689,
  "status": "passed"
});
formatter.match({
  "location": "NavigateToItemDetails.userClicksOnFirstItemThatAppearsInSearchResult()"
});
formatter.result({
  "duration": 2279564435,
  "status": "passed"
});
formatter.match({
  "location": "AddItemToBasket.userClicksOnAddButton()"
});
formatter.result({
  "duration": 950678355,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Added to Basket",
      "offset": 23
    }
  ],
  "location": "AddItemToBasket.notificationIsShown(String)"
});
formatter.result({
  "duration": 72716605,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 19
    }
  ],
  "location": "AddItemToBasket.itemHasQuantity(String)"
});
formatter.result({
  "duration": 66566551,
  "status": "passed"
});
formatter.after({
  "duration": 716210337,
  "status": "passed"
});
});