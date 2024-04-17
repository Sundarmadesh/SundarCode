Feature: Navigate and Purchase Ticket on BlazeDemo Website

Background:
Given To launch the chrome application

Scenario: Verify Home Page Title

When To navigate "https://blazedemo.com/index.php"

Then To verify the page title as "Welcome to the Simple Travel Agency!"

Scenario: Open Destination of the Week in a New Tab

When Navigate "https://blazedemo.com/index.php"

And To click on the hyperlink "destination of the week! The Beach!"

And Then a new tab should open in the browser

And URL should contain the string "vacation"

And To navigate back to the home page tab

Scenario: Purchase a Ticket

When Navigate to "https://blazedemo.com/index.php"

And Select "Mexico City" as the departure city

And Select "London" as the destination city

And To click on the button "Find Flights"

And To choose the flight with the lowest price

And Should be navigated to the purchase page

And To check the price format as "xxx.xx"

And Click on the "Purchase Flight" button

And To navigated to the Purchase Confirmation page

And The "Id" should be stored in the console or test report for future reference

Then To close the chrome browser


