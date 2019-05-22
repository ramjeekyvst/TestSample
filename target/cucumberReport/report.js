$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchTest.feature");
formatter.feature({
  "line": 1,
  "name": "Search doctor",
  "description": "",
  "id": "search-doctor",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Set Property for Chrome driver and initialized the Webdriver",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Get the property and launch the URL",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Validate Title of the Website",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.ChromeDriver()"
});
formatter.result({
  "duration": 9997600396,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.ReadPropertyFromPropertiesFile()"
});
formatter.result({
  "duration": 11753100740,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.VerifyTitle()"
});
formatter.result({
  "duration": 6398813,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Find Pregnacy doctor and navigate to Sign In Page",
  "description": "",
  "id": "search-doctor;find-pregnacy-doctor-and-navigate-to-sign-in-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@all"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User is on Kaiser Login landing Page,clicked on the Doctor \u0026 Location Page link and selected region as California_Northern",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User is on Find Doctors and Locations Page and entered below ZIPCODE and clicked on the Search button",
  "rows": [
    {
      "cells": [
        "94588"
      ],
      "line": 12
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User is on Doctor Search results page and Search for GYN doctor",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User is on Your Pregnancy Page and selected seven week from 1stTrimetser Option and naviagted Sign In Page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.selectRegion()"
});
formatter.result({
  "duration": 8466749050,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.searchDoctorByZipCode(DataTable)"
});
formatter.result({
  "duration": 18725554282,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.searchForGynDoctorAndclikedOurPregnancyLink()"
});
formatter.result({
  "duration": 7305436719,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.selectSevenWeekFromTrimesterAndNavigatedToSignInPage()"
});
formatter.result({
  "duration": 56352407959,
  "status": "passed"
});
});