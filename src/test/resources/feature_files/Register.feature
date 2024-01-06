@TutorialsNinjaRegister
Feature: Register functionality of TutorialsNinja

  @MandatoryFields
  Scenario: Register with mandatory fields
  Given User navigates to RegisterPage
    When User enters below mandatory fields
    |firstname 			| shajahan			|
    |lastname				| hoque 				|
    |telephone			| 9876543210 		|
    |password				| testing@12345 	|
    |confirmpassword| testing@12345	|
   
    And User selects PrivacyPolicy checkbox
    When User clicks on Continue button
    Then User account gets created successfully


 @AllFields
  Scenario: Register with all fields
  Given User navigates to RegisterPage
    When User enters below all fields
    |firstname 			| shajahan			|
    |lastname				| hoque				|
    |telephone			| 9876543210 		|
    |password				| testing@1234 	|
    |confirmpassword| testing@1234 	|
    And User selects Yes for newsletter
    And User selects PrivacyPolicy checkbox
    When User clicks on Continue button
    Then User account gets created successfully
    
 
 
  @DuplicateEmail
  Scenario: Register with existing email
  Given User navigates to RegisterPage
    When User enters below all fields with existing email
    |firstname 			| shajahan 							|
    |lastname				| hoque 								|
    |email 					|testingid1980@gmail.com|
    |telephone			| 9876543210 						|
    |password				| testing@1980 					|
    |confirmpassword| testing@1980 					|
    And User selects Yes for newsletter
    And User selects PrivacyPolicy checkbox
    When User clicks on Continue button
    Then User gets warning message of duplicate email  
 
 
  @NoFields
  Scenario: Register with no fields
  Given User navigates to RegisterPage
    When User clicks on Continue button
    Then User gets warning message for mandatory fields
    
