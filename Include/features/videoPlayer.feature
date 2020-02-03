@live
Feature: Video Palyer on Mola TV

  @live
  Scenario: Play movie on home page
    Given user want to video player page
    When scroll until movie
    And select one video
    Then user direct video player page

  Scenario: Play video player
    When user click play
    Then video can be play