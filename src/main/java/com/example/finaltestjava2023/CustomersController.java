package com.example.finaltestjava2023;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class CustomersController implements Initializable {
    @FXML
    private Button allCustomersButton;

    @FXML
    private TableColumn<Customer, String> colCompany;

    @FXML
    private TableColumn<Customer, String> colCountry;

    @FXML
    private TableColumn<Customer, String> colCreatedAt;

    @FXML
    private TableColumn<Customer, String> colEmail;

    @FXML
    private TableColumn<Customer, String> colFirst;

    @FXML
    private TableColumn<Customer, String> colId;

    @FXML
    private TableColumn<Customer, String> colLast;

    @FXML
    private Button domesticCustomersButton;

    @FXML
    private Label rowsInTableLabel;

    @FXML
    private TableView<Customer> tableViewCustomers;

    @FXML
    private Label titleLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    // ... (previous code)

    @FXML
    protected void onAllCustomersButtonClick() {
        try {
            List<Customer> allCustomers = JsonParser.parseCustomersFromFile("path/to/your/json/file.json");
            tableViewCustomers.getItems().setAll(allCustomers);
            rowsInTableLabel.setText("Rows returned: " + allCustomers.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onDomesticCustomersButtonClick() {
        try {
            List<Customer> allCustomers = JsonParser.parseCustomersFromFile("path/to/your/json/file.json");
            List<Customer> domesticCustomers = new ArrayList<>();
            for (Customer customer : allCustomers) {
                if ("Canada".equals(customer.getCountry())) {
                    domesticCustomers.add(customer);
                }
            }
            tableViewCustomers.getItems().setAll(domesticCustomers);
            rowsInTableLabel.setText("Rows returned: " + domesticCustomers.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
