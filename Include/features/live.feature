@live
Feature: Video player

  @player
  Scenario: Live button can be click
    Given User want to button live
    When User click button live
    Then User direct to live page
    
  Scenario: Type live can be click
    Given User want to click button type live
    When User click button type live
    Then User can be click type live