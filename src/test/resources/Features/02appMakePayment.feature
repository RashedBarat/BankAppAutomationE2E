Feature: AppTestPayment

  @smoke
  Scenario Outline: user makes payment
    Given user click make payment button
    When user enters '<phone>'and '<name>' and '<amount>'
    And user click select button
    And user will navigate to home
    Then accept alert

    Examples:
      | phone       | name | amount |
      | 01300000000 | abc  | 2      |