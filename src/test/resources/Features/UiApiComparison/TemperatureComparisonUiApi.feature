@RunWith(SerenityRunner.class)
Feature: Temperature comparison for given location using UI and API

Background:
Given url to open

@tempCompare	
Scenario Outline: Get weather details for "<location>" 
	
	When navigate to weather tab
	Then search "<location>" 
	And validate weather details are available for "<location>"
	Then get Temperature from UI
	When request is made for "<location>" through API
	Then validate the response
	And get Temperature from API
	Then validate temperature matches for both UI and API
	
 
Examples:
|location|
|madurai|
|Bengaluru|

