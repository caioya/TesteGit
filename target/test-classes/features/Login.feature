	Feature: Application Login
	
	Background:
	Given Validate the browser
	When Browser is triggered
	Then Check if browser has started

	@MobileTest
	Scenario: Homepage default login
	Given User is on NetBanking landing page
	When User logins into application with "jin" and password "1234"
	Then Homepage is populated
	And Cards are displayed
	
	@MobileTest
	Scenario: Homepage default login
	Given User is on NetBanking landing page
	When User logins into application with "john" and password "4321"
	Then Homepage is populated
	And Cards are not displayed
	
	@MobileTest
	Scenario: Homepage default login
	Given User is on NetBanking landing page
	When User sings up with following details
	| jenny | abcd | jenny@gmail.com | Brazil | 34564586 |
	Then Homepage is populated
	And Cards are not displayed
	
	@SmokeTest
	Scenario Outline: Homepage default login
	Given User is on NetBanking landing page
	When User logins in to application with <username> and password <password>
	Then Homepage is populated
	And Cards are displayed
	
	Examples:
	| username | password |
	| user1    | pass1    |
	| user2    | pass2    |
	| user3    | pass3    |
	| user4    | pass4    |