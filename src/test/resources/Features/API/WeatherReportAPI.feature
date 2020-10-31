@RunWith(SerenityRunner.class)
Feature: Weather details retrieval for given location using API request

@weatherAPI	
Scenario Outline: Get weather details for "<location>" 
	
	When request is made for "<location>" through API
	Then validate the response
	
 
Examples:
|location|
|madurai|
|Bengaluru|