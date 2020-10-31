$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/UiApiComparison/TemperatureComparisonUiApi.feature");
formatter.feature({
  "name": "Temperature comparison for given location using UI and API",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@RunWith(SerenityRunner.class)"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Get weather details for \"\u003clocation\u003e\"",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tempCompare"
    }
  ]
});
formatter.step({
  "name": "navigate to weather tab",
  "keyword": "When "
});
formatter.step({
  "name": "search \"\u003clocation\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "validate weather details are available for \"\u003clocation\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "get Temperature from UI",
  "keyword": "Then "
});
formatter.step({
  "name": "request is made for \"\u003clocation\u003e\" through API",
  "keyword": "When "
});
formatter.step({
  "name": "validate the response",
  "keyword": "Then "
});
formatter.step({
  "name": "get Temperature from API",
  "keyword": "And "
});
formatter.step({
  "name": "validate temperature matches for both UI and API",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "location"
      ]
    },
    {
      "cells": [
        "madurai"
      ]
    },
    {
      "cells": [
        "Bengaluru"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "url to open",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionsWeatherUI.url_to_open()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Get weather details for \"madurai\"",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@RunWith(SerenityRunner.class)"
    },
    {
      "name": "@tempCompare"
    }
  ]
});
formatter.step({
  "name": "navigate to weather tab",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionsWeatherUI.navigate_to_weather_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search \"madurai\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsWeatherUI.search(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate weather details are available for \"madurai\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionsWeatherUI.validate_weather_details_are_available_for(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get Temperature from UI",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsWeatherUI.get_Temperature_from_UI()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "request is made for \"madurai\" through API",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionsWeatherAPI.request_is_made_for_through_API(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate the response",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsWeatherAPI.validate_the_response()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get Temperature from API",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionsWeatherAPI.get_Temperature_from_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate temperature matches for both UI and API",
  "keyword": "Then "
});
formatter.match({
  "location": "TemperatureComparsionUiApi.validate_temperature_matches_for_both_UI_and_API()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "url to open",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionsWeatherUI.url_to_open()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Get weather details for \"Bengaluru\"",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@RunWith(SerenityRunner.class)"
    },
    {
      "name": "@tempCompare"
    }
  ]
});
formatter.step({
  "name": "navigate to weather tab",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionsWeatherUI.navigate_to_weather_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search \"Bengaluru\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsWeatherUI.search(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate weather details are available for \"Bengaluru\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionsWeatherUI.validate_weather_details_are_available_for(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get Temperature from UI",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsWeatherUI.get_Temperature_from_UI()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "request is made for \"Bengaluru\" through API",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionsWeatherAPI.request_is_made_for_through_API(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate the response",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsWeatherAPI.validate_the_response()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get Temperature from API",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionsWeatherAPI.get_Temperature_from_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate temperature matches for both UI and API",
  "keyword": "Then "
});
formatter.match({
  "location": "TemperatureComparsionUiApi.validate_temperature_matches_for_both_UI_and_API()"
});
formatter.result({
  "status": "passed"
});
});