Feature: Coding Challenge

  Scenario: Successful Login with Valid Credentials
    Given User Launch Chrome browser
    When User opens URL "https://staging.zageno.com/"
    And Clicks on Login
    And User enters Email as "debug+sel11@zageno.com"
    And User clicks on Next
    And user enters Password as "X5mDN/)smb/,vF:w"
    And Click on Login
    Then close browser
    
#	Scenario Outline: Successful Login with Valid Credentials 
#	Given User Launch Chrome browser 
#	When User opens URL "https://staging.zageno.com/" 
#	And Clicks on Login
#	And User enters Email as "<email>" 
#	And User clicks on Next
#	And user enters Password as "<password>" 
#	And Click on Login
#	Then close browser
#Examples:
#|email|password|
#|ranjith@gmail.com|abcd1234|
#|yogesh@gmail.com|abcd2345|
