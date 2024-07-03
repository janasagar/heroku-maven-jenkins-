
@tag
Feature: Automation Contact Us

  #@tag1
  #Scenario: Connect with Sparsh Hospital
  #	Given User is vist Sparsh Hospital
#		When User Navigate to Contact Us Page
#		And User enters FirstName, LastName, Phone Number, Email, Enquiry, Select Hospital, Message And click on the send button
#		Then Message displayed Thank You Our support representative will be in touch with you as soon as possible
    

  @tag2
  Scenario Outline: Connect with Sparsh Hospital
    Given User is vist Sparsh Hospital
    When User Navigate to Contact Us Page
    And User enters "<FirstName>", "<LastName>", "<Phone_Number>", "<Email>", "<Message>"
    And User Select Enquiry, Select Hospital
    And User Click send button
    Then Message displayed Thank You Our support representative will be in touch with you as soon as possible

    Examples: 
      | FirstName  | LastName | Phone_Number  | Email           | Message          |
      | Sagar      | Jana     | 7098510151    | Jana@gmail.com  | Hello World!     |
      | Raju       | Koley    | 7098510153    | koley@gmail.com | Hack The Planet  |
