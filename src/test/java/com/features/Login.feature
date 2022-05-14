@regression
  Feature: Varifying OSA Consulting Tech Corp Login features

   Background: 
    Given I Open the Browser 
    And I click on Forum button
    
  @first  
  Scenario: As a registed user
     And I enter the username "mhossain@gmail.com"
    And I enter the password "Mhossain@7979"
    When I click on Login button
    Then I verify the student page title
    And 	I close the browser
    
  @second
   Scenario: As a registed user
    And I enter the username "mhossain89"
    And I enter the password "Mhossain"
    When I click on Login button
    Then I verify the student page title
    And 	I close the browser