
Feature: Application Login

@Regression
  Scenario: Home page default Login
    Given User is on landing page
    When user login into application with Username and Password
   	|Username	| Jagriti.spmit@gmail.com|
		|Password	|	7200$inNH							 |
    Then Home page is populated
    And Cards are displayed
		|Username| Password|
		|Jagriti.spmit@gmail.com|7200$inNH|