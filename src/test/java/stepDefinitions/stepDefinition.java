package stepDefinitions;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
public class stepDefinition {

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() {
    	System.out.println("yesssss1");
    }

    @When("^User logins into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_logins_into_application_with_something_and_password_something(String strArg1, String strArg2) {
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    }

    @When("^User sings up with following details$")
    public void user_sings_up_with_following_details(DataTable data)  {
    	List<List<String>> obj = data.asLists();
    	System.out.println(obj.get(0).get(0));
    	System.out.println(obj.get(0).get(1));
    	System.out.println(obj.get(0).get(2));
    	System.out.println(obj.get(0).get(3));
    	System.out.println(obj.get(0).get(4));
    //1º get linha e 2º get coluna	
    }
    
    @When("^User logins in to application with (.+) and password (.+)$")
    public void user_logins_into_application_with_and_password(String username, String password) throws Throwable {
    	System.out.println(username);
    	System.out.println(password);
    }
    
    @Then("^Homepage is populated$")
    public void homepage_is_populated() {
    	System.out.println("yesssss3");
    }

    @And("^Cards are( not)? displayed$")
    public void cards_are_displayed(String tipo) {
    	System.out.println("yesssss4");
    }
    
    @Given("Validate the browser")
    public void validate_the_browser() {
    }
    
    @When("Browser is triggered")
    public void browser_is_triggered() {
    }
    
    @Then("Check if browser has started")
    public void check_if_browser_has_started() {
    }

}