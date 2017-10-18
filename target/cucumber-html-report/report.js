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
  "duration": 4747571774,
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
  "duration": 184470906,
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
  "duration": 1566624167,
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
  "duration": 1864527516,
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
  "duration": 143600856,
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
  "duration": 66062369,
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
  "duration": 67348716,
  "status": "passed"
});
formatter.after({
  "duration": 759251045,
  "status": "passed"
});
});