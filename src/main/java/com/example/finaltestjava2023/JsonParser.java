package com.example.finaltestjava2023;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonParser {
    public static List<Customer> parseCustomersFromFile(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Customer> customers = new ArrayList<>();

        try {
            ApiResponse apiResponse = objectMapper.readValue(new File(filePath), ApiResponse.class);
            customers = apiResponse.getCustomers();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }

        return customers;
    }
}
