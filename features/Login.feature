Feature: Login 

Scenario: Successful Login with valid Credentials 
	Given User launch chrome browser 
	When User opens URL "https://www.cardinaltalent.ai/users/sign_in" 
	And User enter Email as "sadanandkothari9@gmail.com" and Password as "Pass@123" 
	And User click on signIn button 
	Then User varify page title should be "Welcome | CardinalTalent" 
	When User click on logOut link 
	Then User varify page title should be "Sessions | CardinalTalent" 
	And User close the browser 

	