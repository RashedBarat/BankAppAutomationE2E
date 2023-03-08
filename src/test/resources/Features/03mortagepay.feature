Feature: MortageTestPayment

  @feature1
  Scenario Outline: user makes payment
    Given user click mortgage req button
    When user enters '<fname>'and '<lname>' and '<age>' and '<add1>' and '<add2>'
    And user click select country button
    And select country
    And mortgage alert
    Then accept alertt

    Examples:
      | fname       | lname | age | add1 | add2 |
      | 01300000000 | abc   | 2   | abc  | xyz |