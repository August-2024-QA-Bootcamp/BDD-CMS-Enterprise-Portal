# Author: tofaelkabir@gmail.com
# Date: 02/02/2025
@login
Feature: Log In
  As an user
  I want to login with my valid credentials to CMS Enterprise Portal
  In order to get access of the Application

  Background: User navigate to Application URL
    Given User is on the CMS Enterprise Portal Homepage URL

  @regression
  Scenario: Login with valid credentials
    When User enter UserId in the UserId field
    And User enter Password in the Password field
    And User click the check box of I agree to the Terms and Conditions
    And User finally click on Login Button
    Then User will navigate to multi factor authentication modal

  # This is imperative BDD, line by line description
  @sanity
  Scenario: Login with fixed Valid Credential
    When User enter UserId as 'Ayshaurmi26'
    And User enter Password as 'Ayesha2026#@$%&'
    And User click the check box of I agree to the Terms and Conditions
    And User finally click on Login Button
    Then User will navigate to multi factor authentication modal

	@smoke
  Scenario Outline: Login with sets of Valid Credential
    When User enter UserId as <User Id>
    And User enter Password as <Password>
    And User click the check box of I agree to the Terms and Conditions
    And User finally click on Login Button
    Then User will navigate to multi factor authentication modal

    Examples: 
      | User Id                   							  | Password            				 |
      | 'shampa.afroz82@gmail.com' | 'ShumuLove$2024&'    |
      | 'S_1999'                   							| 'Silia19??abcsilia'         |
      | 'Narima.tushty@gmail.com'    | 'Login@123456789'     |
      | 'Tasnim609'                            | 'Tt6092332201@123'   |
      | 'rubuait525@gmail.com'         | 'Password$123456'      |
      | 'mariabegum2121'                  | 'saimun388556Bd@'    |
      | 'Shamash1'                            | 'Ronglaal12345!@#$%'|
      | 'Mirza12'                                | 'Johnsleeping11$'        |
      | 'showva31.'                            | 'Wrong Data'          |
      | 'shahnazm2252'                      | 'Allah@123456789'      |
