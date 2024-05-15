@US001
Feature: Default
#@B33G8-140
	Background:
		 Given the user is on the login page
		

	@B33G8-156
	Scenario: US01AC01TC01 - Verify that Store managers see 8 module names
		Given the user logged in as "store manager"
		Then the user on the Dashboard page can see 8 module names:

			| Dashboards         |
			| Fleet              |
			| Customers          |
			| Sales              |
			| Activities         |
			| Marketing          |
			| Reports & Segments |
			| System             |

	@B33G8-157
	Scenario: US01AC02TC01 - Verify that Drivers see 4 module names.
		Given the user logged in as "driver"
		Then the user on the Dashboard page can see 4 module names:
		      | Fleet      |
		      | Customers  |
		      | Activities |
		      | System     |

	@B33G8-158
	Scenario: US01AC01TC02 - Verify that  Sales managers see 8 module names
		Given the user logged in as "sales manager"
		Then the user on the Dashboard page can see 8 module names:
			| Dashboards         |
			| Fleet              |
			| Customers          |
			| Sales              |
			| Activities         |
			| Marketing          |
			| Reports & Segments |
			| System             |