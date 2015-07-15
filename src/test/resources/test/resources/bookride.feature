Feature: Book a ride
Scenario Outline: Regression test
Given User enter <src> as source and <dest> as Destination
When user clicks "Search"
Then user should get <msg> message 
Examples:
|src|dest|msg|
|"kondapur"|"Gachibowli"|"Successful"|
|"kondapur"|"kondapur"|"Invalid"|
|""|"Gachibowli"|"Invalid"|
|"kondapur"|""|"Invalid"|
