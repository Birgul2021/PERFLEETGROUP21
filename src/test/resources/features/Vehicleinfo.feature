Feature: Perfleet Feature

    @PERF-1003
    Scenario: General Vehicle Information for Driver
    Given the user is on the login page
    When driver enters "username" and "password"
    Then user clicks "Fleet" and "Vehicles"
    When user clicks on any vehicle
    Then user should see "General Information" page under fleet vehicle module

    @PERF-1009
    Scenario: General Vehicle Information for Store Manager
        Given the user is on the login page
        When store manager enters "username" and "password"
        Then user clicks "Fleet" and "Vehicles"
        When user clicks on any vehicle
        Then user should see "General Information" page under fleet vehicle module

    @PERF-1010
    Scenario: General Vehicle Information for Sales Manager
        Given the user is on the login page
        When sales manager enters "username" and "password"
        Then user clicks "Fleet" and "Vehicles"
        When user clicks on any vehicle
        Then user should see "General Information" page under fleet vehicle module

    @PERF-1005
    Scenario Outline : Sales Manager should see Edit, Delete and Add Event button
        Given the user is on the login page
        When sales manager enters "username" and "password"
        Then user clicks "Fleet" and "Vehicles"
        When user clicks on any vehicle
        Then user should see "General Information" page under fleet vehicle module
        And Sales manager should see "<button>" buttons
        Examples:
            | button |
            | Edit   |
            | Delete   |
            | Add Event|
