Feature: Place Order

Scenario: Search Single Item
Given User is on Home Page
When User Search an Item "Parry Hotter"
Then User Should be on Search Result Page

Scenario: Add item to cart
Given User Should Be On Search Result Page
When Add Items to Cart
#Then Item Must Be Added

Scenario: Checkout order
Given User is on shopping cart page
When User do checkout
Then Should Navigate to checkout page