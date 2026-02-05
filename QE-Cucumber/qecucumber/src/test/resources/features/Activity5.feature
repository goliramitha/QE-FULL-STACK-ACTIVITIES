@activity5
Feature: Login Test
Scenario Outline: Testing Login with Example
Given user on the login page
When user enters "<Usernames>" and "<Passwords>"
And click the submit button
Then get confirmation text and verify message as "Invalid credentials"