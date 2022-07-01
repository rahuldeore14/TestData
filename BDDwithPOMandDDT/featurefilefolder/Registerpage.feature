Feature: Test Syssuite Application

  Scenario Outline: Test Register Functionality
    Given User On Register Page
    When User Enter "<compay_name>", "<emailId>", "<password>", and "<confirm_password>"
    Then User On HomePage

    Examples: 
      | compay_name | emailId          | password  | confirm_password |
      | amdocs      | amdocs@gmail.com | amdocs123 | amdocs123        |
      | wipro       | Wipro@gmail.com  | wipro123  | wipro123         |
      | paytm       | paytm@gmail.com  | paytm123  | paytm123         |
      
