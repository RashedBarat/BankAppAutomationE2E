Feature: AppTest

  @test
  Scenario Outline: user login
    Given app apk is there
    When user enters '<username>'and '<pass>'
    Then user will navigate to home screen

    Examples:
      | username | pass    |
      | company  | company |