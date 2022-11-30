
  Feature: Amazon title, URL logo and login functionality verification

    Background:
      Given user is on the Amazon page

      Scenario: Page title and URL verification
        And user is able to see "Amazon.com. Spend less. Smile more." in the title
        And user is able to see "amazon.com" in the YRL

        Scenario: Logo verification
          And user is able to see logo Amazon on the page

          Scenario: Login verification
            When user navigates to the navigate icon
            And user is able to click on the sign in button
            Then user enters username and password and user should be able to login