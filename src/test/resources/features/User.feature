Feature:PostUser
  Test POST operation using REST-assured library

  @wip
  Scenario: Verify that User creation with Post request should be successfully
    Given the user sets Url "user/createWithList" and method "POST"
    And the user sets body
      | id         | 121       |
      | username   | Boxer     |
      | firstname  | Mike      |
      | lastname   | Tyson     |
      | email      | a@a.com   |
      | password   | 123       |
      | phone      | 123456789 |
      | userStatus | 0         |
    Then the user sees status code 200
    Then the user sees the value "unknown" in response body
    Then the user sees the value "ok" in response body

  @wip
  Scenario: Verify GET operation for User
    Given the user sets Url "user/{username}" and method "GET"
    And the user sends the request with path param "Boxer"
    Then the user sees status code 200
    Then the user sees the value "Mike" in response body

  @wip
  Scenario: Verify PUT operation for User
    Given the user sets Url "user/{username}" and method "PUT"
    And the user sends the request with path param "Boxer"
    And the user sets body
      | id         | 121       |
      | username   | Boxer     |
      | firstname  | Muhammed  |
      | lastname   | Ali       |
      | email      | a@a.com   |
      | password   | 1789      |
      | phone      | 123456789 |
      | userStatus | 0         |
    Then the user sees status code 200
    Then the user sees the value "unknown" in response body


  @wip
  Scenario: Verify DELETE operation for User
    Given the user sets Url "user/{username}" and method "DELETE"
    And the user sends the request with path param "Boxer"
    Then the user sees status code 200
    Then the user sees the value "unknown" in response body



  Scenario: Verify the deleted user not found
    Given the user sets Url "user/{username}" and method "GET"
    And the user sends the request with path param "Boxer"
    Then the user sees status code 404













