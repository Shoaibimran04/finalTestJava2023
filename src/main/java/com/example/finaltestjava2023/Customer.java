//shoaib imran 200528971

package com.example.finaltestjava2023;

import com.google.gson.annotations.SerializedName;

public class Customer {
    private String id;
    private String firstName;
    @SerializedName("last")
    private String lastName;
    private String company;
    private String createdAt;
    private String country;

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
