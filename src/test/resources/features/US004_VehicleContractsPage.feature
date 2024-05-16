@US004
  Feature:  As a user, I want to access to Vehicle Contracts page
    #@B33G8-140
    Background:
      Given the user is on the login page

      Scenario Outline: Verify that Store managers and Sales managers can access the Vehicle   Contracts page.
        Given the user logged in as "<userType>"
        When the user hovers over to "Fleet" module and selects "Vehicle Contracts" page
        Then the user sees url "https://qa1.vytrack.com/entity/Extend_Entity_VehicleContract"
        And the user sees title "All - Vehicle Contract - Entities - System - Car - Entities - System"

        Examples:
          | userType      |
          | sales manager |
          | store manager |

        Scenario: Verify that Drivers can NOT access the Vehicle Contracts page
          Given the user logged in as "driver"
          When the user hovers over to "Fleet" module and selects "Vehicle Contracts" page
          Then the user sees the message "You do not have permission to perform this action."
