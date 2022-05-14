@regression
 Feature: Varifying OSA Consulting Tech Corp Login features
 
  @five 
  Scenario Outline: As a registed user
    Given I Open the Browser 
    And I click on Forum button
    And I enter the username <username>
    And I enter the password <password>
    When I click on Login button
    Then I verify the student page title
    And 	I close the browser
    
Examples:
|username|password|
|"mhossainchem89@gmail.com"|"Mhossain@7979"|
|"mhossainchem89"|"Mhossain"|
|"mhossain"|"Mh"|
