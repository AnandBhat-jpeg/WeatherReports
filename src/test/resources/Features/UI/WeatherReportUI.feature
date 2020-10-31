@RunWith(SerenityRunner.class)
Feature: Weather details retrieval for given location using UI

Background:
Given url to open

@weatherUI	
Scenario Outline: Get weather details for "<location>" 
	
	When navigate to weather tab
	Then search "<location>" 
	And validate weather details are available for "<location>"
	
 
Examples:
|location|
|madurai|
|Bengaluru|
