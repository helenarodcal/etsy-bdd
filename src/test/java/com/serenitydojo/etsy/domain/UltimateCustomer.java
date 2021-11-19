package com.serenitydojo.etsy.domain;

public class UltimateCustomer implements WithType {

    private static final String DEFAULT_COUNTRY = "UK";
    private static final String DEFAULT_CUSTOMER_TYPE = "Standard";

    String name;
    String country = DEFAULT_COUNTRY;
    String customerType = DEFAULT_CUSTOMER_TYPE;
    String gender;

    public UltimateCustomer(String name) {
        this.name = name;
    }

    public static UltimateCustomer called(String name) {
        return new UltimateCustomer(name);
    }
    public WithType ofGender(String gender) {
        this.gender = gender;
        return this;
    }
    public UltimateCustomer ofType(String customerType) {
        this.customerType = customerType;
        return this;
    }

    public Customer whoLivesIn(String country) {
        this.country = country;
        return new Customer(name, country, customerType, gender);
    }

}
