package com.serenitydojo.etsy.stepdefinitions;

import com.serenitydojo.etsy.domain.ACustomer;
import com.serenitydojo.etsy.domain.Customer;
import com.serenitydojo.etsy.domain.TheCustomer;
import com.serenitydojo.etsy.domain.UltimateCustomer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerStepDefinitions {

    Customer customer;
    Customer anotherCustomer;
    Customer theUltimateCustomer;
    @Given("{word} is a {word} {word} customer who lives in {word}")
    public void customerOfCustomerTypeLivesInCountry(String name, String gender, String customerType, String country) {
//        customer = new Customer();
//        customer.setCountry(country);
//        customer.setCustomerType(customerType);
//        customer.setName(name);

        customer = TheCustomer.called(name);
        customer.setCustomerType(customerType);
        customer.setCountry(country);

        assertThat(customer.getName()).isEqualTo("Fabian");
        assertThat(customer.getCountry()).isEqualTo("France");
        assertThat(customer.getCustomerType()).isEqualTo("priority");

        anotherCustomer = ACustomer.called(name)
                .ofType(customerType)
                .whoLivesIn(country).build();
        assertThat(anotherCustomer.getName()).isEqualTo("Fabian");
        assertThat(anotherCustomer.getCountry()).isEqualTo("France");
        assertThat(anotherCustomer.getCustomerType()).isEqualTo("priority");
        assertThat(anotherCustomer.getGender()).isEqualTo("female");//default value

        theUltimateCustomer = UltimateCustomer.called(name)
                .ofGender(gender)
                .ofType(customerType)
                .whoLivesIn(country);
        assertThat(theUltimateCustomer.getName()).isEqualTo("Fabian");
        assertThat(theUltimateCustomer.getCountry()).isEqualTo("France");
        assertThat(theUltimateCustomer.getCustomerType()).isEqualTo("priority");
        assertThat(theUltimateCustomer.getGender()).isEqualTo("male");
    }

    @Given("{word} is a {word} customer")
    public void customerIsACustomerType(String name, String customerType) {

        customer = TheCustomer.called(name);
        customer.setCustomerType(customerType);
        assertThat(customer.getName()).isEqualTo("Fabian");
        assertThat(customer.getCountry()).isEqualTo("UK");
        assertThat(customer.getCustomerType()).isEqualTo("priority");

        anotherCustomer = ACustomer.called(name).ofType(customerType).build();
        assertThat(anotherCustomer.getName()).isEqualTo("Fabian");
        assertThat(anotherCustomer.getCountry()).isEqualTo("UK");
        assertThat(anotherCustomer.getCustomerType()).isEqualTo("priority");
    }

    @Given("{word} lives in {word}")
    public void customerLivesInCountry(String name, String country) {

        customer = TheCustomer.called(name);
        customer.setCountry(country);
        assertThat(customer.getName()).isEqualTo("Fabian");
        assertThat(customer.getCountry()).isEqualTo("France");
        assertThat(customer.getCustomerType()).isEqualTo("Standard");

        anotherCustomer = ACustomer.called(name).whoLivesIn(country).build();
        assertThat(anotherCustomer.getName()).isEqualTo("Fabian");
        assertThat(anotherCustomer.getCountry()).isEqualTo("France");
        assertThat(anotherCustomer.getCustomerType()).isEqualTo("Standard");
    }

    @Given("{word} is a customer")
    public void customer(String name, String country) {

        customer = TheCustomer.called(name);
        assertThat(customer.getName()).isEqualTo("Fabian");
        assertThat(customer.getCountry()).isEqualTo("UK");
        assertThat(customer.getCustomerType()).isEqualTo("Standard");
    }


//
//    @And("Fabian wants to purchase the following items")
//    public void fabianWantsToPurchaseTheFollowingItems() {
//    }
//
//    @When("he checks out the shopping cart")
//    public void heChecksOutTheShoppingCart() {
//    }
//
//    @Then("the total price should be:")
//    public void theTotalPriceShouldBe() {
//    }
}
