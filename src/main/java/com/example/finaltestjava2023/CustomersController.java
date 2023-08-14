package com.example.finaltestjava2023;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
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

    @FXML
    protected void onAllCustomersButtonClick() {
        rowsInTableLabel.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onDomesticCustomersButtonClick() {
        rowsInTableLabel.setText("Domestic Customers to be found.");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
