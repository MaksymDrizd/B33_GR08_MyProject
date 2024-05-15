@US002
Feature: Default
#@B33G8-140
	Background:
		 Given the user is on the login page
		


	@B33G8-146
	Scenario Outline: US2AC01 Verify  that user, should access to the Oroinc Documentation page.
		Given the user logged in as "<userType>"
				Then user click on the question mark icon
				And user should access to the Oroinc Documentation page

				Examples:
				|userType|
				|driver|
				|sales manager|
				|store manager|