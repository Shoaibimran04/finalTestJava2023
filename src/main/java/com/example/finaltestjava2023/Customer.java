package com.example.finaltestjava2023;

public class Customer {
    private String id;
    private String firstName;
    private String lastName;
    private String company;
    private String createdAt;
    private String country;

    public Customer(String id, String firstName, String lastName, String company, String createdAt, String country) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.createdAt = createdAt;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getCountry() {
        return country;
    }
}
