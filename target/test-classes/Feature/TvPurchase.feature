#Author: barath.email@your.domain.com
Feature: TV Purchase
  I want to use this template for my feature file

  Scenario: Title of your scenario
    Given user will launch the FlipKart website
    And User will login
    When User will Search the TV
    And User will select the TV
    Then User will make payments and recivie the cofirmation messsage.

  Scenario: Title of your scenario
    Given user will launch the FlipKart website
    And User will login
    When User will Search the TV by one dim list
      | sony tv |  | samsung tv |
    And User will select the TV
    Then User will make payments and recivie the cofirmation messsage.

  Scenario: Title of your scenario
    Given user will launch the FlipKart website
    And User will login
    When User will Search the TV by one dim Map
      | tv1 |  | sony     |
      | tv2 |  | samsung  |
      | tv3 |  | redmi tv |
    And User will select the TV
    Then User will make payments and recivie the cofirmation messsage.
