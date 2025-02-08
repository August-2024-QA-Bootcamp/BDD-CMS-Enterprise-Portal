# Author: tofaelkabir@gmail.com
# Date: 02/08/2025
@newUserRegistration
Feature: As an user
  I want to enroll as a new user to CMS Enterprise Portal
  In order to get access of the Application features

  Background: User navigates to Application URL
    Given User is on the CMS Enterprise Portal Homepage URL

  # This is declarative BDD, not line by line description
  
  @sanity
  Scenario: User click on Next Button in Step Two by puting value in each field
    When User click on New User Registration Button
    Then User navigate to Step one of the enrollment process
    When User complete Step one process
    Then User navigate to Step two of the enrollment process
    When User complete Step two process
    And click on Next Button of Step two
    Then User navigate to Step three of the enrollment process
    When User complete Step three process
    And click on Next Button of Step three
    Then User navigate to Summary Page of the enrollment process
    When User click on Submit User of Summary Page
    Then User can see the confirmation message
