Feature: Login Action
 
Scenario: Successful Login with Valid Credentials
#Background: User is Logged In
 Given User is on Home Page
 When User Navigate to LogIn Page
 #And User enters UserName and Password
 #And User enters "ersurabhi.jain01@gmail.com" and "SJ@pune1"
 #And User enters "<username>" and "<password>"
 And User enters Credentials to LogIn
  | Username   | Password |
 | ersurabhi.jain01@gmail.com | SJ@pune1 |
 |shikhar.tech@gmail.com| SK@pune1 |
 Then Message displayed Login Successfully
 #Examples:
 #|username|password|
 #|ersurabhi.jain01@gmail.com|SJ@pune1|
 #|shikhar.tech@gmail.com|SK@pune1|
 #|testuser1|password1|
 
#Scenario: Successful LogOut
 #When User LogOut from the Application
#Then Message displayed LogOut Successfully