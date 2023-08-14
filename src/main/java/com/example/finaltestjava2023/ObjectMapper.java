package com.example.finaltestjava2023;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ObjectMapper {
    public ApiResponse readValue(File file, Class<ApiResponse> apiResponseClass) throws IOException {
        ApiResponse apiResponse = null;
        try (FileReader reader = new FileReader(file)) {

              } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
        return apiResponse;
    }
}
