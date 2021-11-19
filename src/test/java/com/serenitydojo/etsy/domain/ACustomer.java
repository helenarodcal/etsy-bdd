package com.serenitydojo.etsy.domain;

public class ACustomer {

    private static final String DEFAULT_COUNTRY = "UK";
    private static final String DEFAULT_CUSTOMER_TYPE = "Standard";
    private static final String DEFAULT_GENDER = "female";

    String name;
    String country = DEFAULT_COUNTRY;
    String customerType = DEFAULT_CUSTOMER_TYPE;
    String gender = DEFAULT_GENDER;

    public ACustomer(String name) {
        this.name = name;
    }

    public static ACustomer called(String name) {
        return new ACustomer(name);
    }

    public ACustomer ofType(String customerType) {
        this.customerType = customerType;
        return this;
    }

    public ACustomer whoLivesIn(String country) {
        this.country = country;
        return this;
    }

    public Customer build() {
        return new Customer(name, country, customerType, gender);
    }
}
