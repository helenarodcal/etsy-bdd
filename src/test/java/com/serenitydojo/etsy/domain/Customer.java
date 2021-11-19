package com.serenitydojo.etsy.domain;

public class Customer {
    private String country;
    private String name;
    private String customerType;
    private String gender;

    public Customer(String name, String country, String customerType, String gender) {
        this.country = country;
        this.name = name;
        this.customerType = customerType;
        this.gender = gender;
    }
    public Customer(){

    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public String getCustomerType() {
        return customerType;
    }

    public String getGender() {
        return gender;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
}
