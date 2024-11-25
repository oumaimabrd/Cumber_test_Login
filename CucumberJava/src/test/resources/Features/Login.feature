@SmokeFeature
Feature: Feature to test login functionality

  @Smoketest
  Scenario Outline: Check login is successful with valid credentials
    Given The browser is open
    And user is on Netflix page
    When user in on Netflix login page
    And user enters <username> and <password>
    And clicks on login button
    Then user is redirected to the home page
    
   Examples:
  | username | password |
  |obouraada4@gmail.com|Aa0611282752.| 
   
   

    
