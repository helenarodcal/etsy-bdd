package com.serenitydojo.etsy.domain;

public class TheCustomer {

    private static final String DEFAULT_COUNTRY = "UK";
    private static final String DEFAULT_CUSTOMER_TYPE = "Standard";

    public static Customer called(String name) {
        Customer newCustomer = new Customer();
        newCustomer.setName(name);
        newCustomer.setCountry(DEFAULT_COUNTRY);
        newCustomer.setCustomerType(DEFAULT_CUSTOMER_TYPE);
        return newCustomer;
    }
}
