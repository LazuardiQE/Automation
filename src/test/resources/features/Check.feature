@Login-Purchase
Feature: Login - Purchase
  As user , lazu want purchase one of the product

  Scenario: :Login, Filter Low to High ,Adding 2 items to cart , and than remove 1 product from cart , finish , and checkout process
    Given User open the web sauce demo
    When User input "visual_user" as userName and "secret_sauce" as password and click login
    Then User already on dashboard page
    And User sort product by "Price (low to high)"
    And User click add to cart item "Sauce Labs Onesie"
    And User click add to cart item "Sauce Labs Bike Light"
    And user clicks on the cart icon in the top right corner
    And user removes the Sauce Labs Bike Light from the shopping list
    And user clicks the checkout button
    Then user redirected to checkone step
    And user inputs "Jodi" as the first name, "Sagala" as the last name, and "1234567" as the Zip Code
    And The user clicks the continue button
    Then user proceeds to the checkout overview page
    And user can see the summary total
    And user clicks the finish button
    And The user is redirected to the complete page