#Author: your.email@your.domain.com
Feature: Mobile purchase
  I want to use this template for my feature file
   Scenario: Mobile
    Given user will launch the FliKart website
    And User will login
    When User will Search the mobile
    And User will select the moblie
    Then User will make payments and recivie the cofirmation messsage.

    
     Scenario: Mobile
    Given user will launch the FliKart website
    And User will login
    When User will Search the mobile by one dim list 
    |Redmi mobile|
    And User will select the moblie
    Then User will make payments and recivie the cofirmation messsage.
    
     Scenario: Mobile
    Given user will launch the FliKart website
    And User will login
    When User will Search the mobile by one dim Map
    |Phone1|Redmi Moblie|
    |Phone2|Iphone|
    |Phone3|Samsung|
    And User will select the moblie
    Then User will make payments and recivie the cofirmation messsage.
    

  Scenario Outline: Mobile
    Given user will launch the FliKart website
    And User will login
    When User will Search the mobile "<Phones>"
    And User will select the moblie
    Then User will make payments and recivie the cofirmation messsage.

    Examples: 
      | Phones  |
      | Iphone  |
      | Redmi   |
      | Samsung |
