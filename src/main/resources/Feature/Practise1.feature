Feature: Test Registration

Description: with all parameters

Scenario Outline: Test Registration with valid data

Given user launches IE And navigate to application url http://newtours.demoaut.com/
When user enter username as "<username>" in username field
And user enter Password as "<password >" in password field
And user click on signIn button
Then user validate Login successss

Examples:
|username|password|
|mercury|mercury|
|abc|mercury|
|mercury|vdegm|
|sfesrteg|csdfgdrgv|
