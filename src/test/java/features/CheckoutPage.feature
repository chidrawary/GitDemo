Feature: Checkout and place the order for products 
@PlaceOrder
Scenario: Search experience for product search in both home and offers page 
Given user is landed on greencart page   
When user searched with shortname <Name> & extracted actual product name   
And user increases the quantity till "3" and added to the cart
Then User proceeds to checkout and validate the <Name> items in the checkout page
And validate that the user can apply promocode and place the order

Examples:
|Name|
|Tom|