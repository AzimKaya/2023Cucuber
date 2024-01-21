Feature:US01TestOtamoation_Test3
  @wip
  Scenario:TC3 Verify that page is scrolled

    Given Navigate to go url automationexercise
  When Verify that home page is visible successfully
  Then Click on Signup / Login button
  Then Verify Login to your account  is visible
  Then Enter incorrect email address and password
  Then Click login button
  And  Verify error 'Your email or password is incorrect!' is visible