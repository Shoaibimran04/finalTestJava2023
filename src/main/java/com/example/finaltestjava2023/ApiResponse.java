package com.example.finaltestjava2023;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ApiResponse {
    @SerializedName("Company")
    private String company;

    @SerializedName("Customers")
    private List<Customer> customers;

    public String getCompany() {
        return company;
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}
