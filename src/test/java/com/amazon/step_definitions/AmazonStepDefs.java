package com.amazon.step_definitions;

import com.amazon.pages.AmazonPage;
import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.gl.Logo;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class AmazonStepDefs {

    AmazonPage amazonPage = new AmazonPage();

    @Given("user is on the Amazon page")
    public void user_is_on_the_amazon_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.app.url"));

    }
    @Given("user is able to see {string} in the title")
    public void user_is_able_to_see_in_the_title(String title) {
        BrowserUtils.verifyTitle(title);

    }
    @Given("user is able to see {string} in the YRL")
    public void user_is_able_to_see_in_the_yrl(String URL) {
        BrowserUtils.verifyUrlContains(URL);

    }

    @Given("user is able to see logo Amazon on the page")
    public void user_is_able_to_see_logo_amazon_on_the_page() {

        Boolean logoPresented = amazonPage.logo.isDisplayed();
        Assert.assertTrue("Amazon", logoPresented);

    }

    @When("user navigates to the navigate icon")
    public void user_navigates_to_the_navigate_icon() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(amazonPage.navigateIcon).perform();

    }
    @When("user is able to click on the sign in button")
    public void user_is_able_to_click_on_the_sign_in_button() {
        amazonPage.signBtn.click();

    }
    @Then("user enters username and password and user should be able to login")
    public void user_enters_username_and_password_and_user_should_be_able_to_login() {
        String username = ConfigurationReader.getProperty("web.app.username");
        String password = ConfigurationReader.getProperty("web.app.password");

        amazonPage.login(username,password);

    }

}
