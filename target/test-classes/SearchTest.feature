Feature: Search doctor

Background:
Given Set Property for Chrome driver and initialized the Webdriver
When Get the property and launch the URL
Then Validate Title of the Website

@SmokeTest
Scenario: Find Pregnacy doctor and navigate to Sign In Page
Given User is on Kaiser Login landing Page,clicked on the Doctor & Location Page link and selected region as California_Northern
When User is on Find Doctors and Locations Page and entered below ZIPCODE and clicked on the Search button
| 94588 |
Then User is on Doctor Search results page and Search for GYN doctor
And User is on Your Pregnancy Page and selected seven week from 1stTrimetser Option and naviagted Sign In Page