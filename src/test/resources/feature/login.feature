Feature: Validation

  Scenario: Validation
    Given Login to the LinkedIn
    When User click the Sign in Button User should able to navigate Home Page
    And Click the Jobs Icon
    And Click the job which present Easy Apply option
    And Click the Easy Apply Button for Job Apply
    And Enter the First name , Last name, Mobile Number , Email address , Click the next button
    Then Enter the City and Click Next Button
    And Select the Resume and Click Next Button
    Then Select the work experince and Click Next Button
    And given the Education Details
    Then Enter the Screening questions URI
    Then Click the Agree Condition Box
    And Click the review button and Submit Application Button
