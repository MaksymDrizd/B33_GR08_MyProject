@US003
Feature: As a user, I want to learn how to use the pinbar.

    #@B33G8-140
  Background:
    Given the user is on the login page

  Scenario Outline: Verify that when users click the “Learn how to use this space” link on the homepage
    Given the user logged in as "<userType>"
    When the user clicks the “Learn how to use this space” link
    Then the user sees “How To Use Pinbar”
    And the user sees “Use the pin icon on the right top corner of page to create  fast access link in the pinbar.”

    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |

  Scenario Outline: Verify that when users click the “Learn how to use this space” link on the homepage
    Given the user logged in as "<userType>"
    When the user clicks the “Learn how to use this space” link
    Then the user sees an image on the page.

    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |