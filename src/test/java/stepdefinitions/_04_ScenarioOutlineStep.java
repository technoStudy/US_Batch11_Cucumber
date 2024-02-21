package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _04_ScenarioOutlineStep {
    @Given("a user with name {string} and surname {string}")
    public void a_user_with_name_and_surname(String name, String surname) {
        System.out.println("Name is :"+name);
        System.out.println("Surname is :"+surname);
    }
    @When("the user is assigned and ID {int}")
    public void the_user_is_assigned_and_id(int id) {
        System.out.println("ID :"+id);
    }

        @When("the user makes a purchase wirth {double} dollars")
    public void the_user_makes_a_purchase_wirth_dollars(double price) {
        System.out.println("The Price :"+price);
    }
    @Then("the system should save the user details with User ID {int}")
    public void the_system_should_save_the_user_details_with_user_id(int user_id) {
        System.out.println("The User ID :"+user_id);
    }
    @Then("the purchase record should reflect a price of {int} dollars")
    public void the_purchase_record_should_reflect_a_price_of_dollars(int salary) {
        System.out.println("Salary is :"+salary);
    }


}
