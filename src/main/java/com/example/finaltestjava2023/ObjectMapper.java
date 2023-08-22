package com.example.finaltestjava2023;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class ObjectMapper {
    public ApiResponse readValue(File file, Class<ApiResponse> apiResponseClass) throws IOException {
        ApiResponse apiResponse = null;
        try (FileReader reader = new FileReader(file)) {
            JsonReader jsonReader = new JsonReader(reader);
            Gson gson = new Gson();
            apiResponse = gson.fromJson( jsonReader,ApiResponse.class);
            return  apiResponse;
              } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
