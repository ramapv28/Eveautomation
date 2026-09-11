Feature: Verify the login functionality

@smoke
Scenario Outline:
Given the user is on the login page
When the user enters "<username>" and "<password>"
And Clicks on the login button
Then the application should see "<message>"


Examples:
|username| password  |message|
|student |Password123|Logged In Successfully|
|ramapv  |Password123|Your username is invalid!|
|student |test123    |Your password is invalid!|