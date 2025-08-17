Feature: Search and place the order for products 
@search
Scenario Outline: Search experience for product search in both home and offers page 
Given user is landed on greencart page   
When user searched with shortname <Name> & extracted actual product name   
Then user searched for <Name> shortname in offers page
And validate that the product name matches with greencart page and offers page

Examples:

|Name|
|Tom|
|Beet|