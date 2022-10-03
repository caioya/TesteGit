	Feature: Application Login
	
	@SmokeTest
	Scenario: Homepage default login
	Given User is on NetBanking landing page
	When User logins into application with "jin" and password "1234"
	Then Homepage is populated
	And Cards are displayed
