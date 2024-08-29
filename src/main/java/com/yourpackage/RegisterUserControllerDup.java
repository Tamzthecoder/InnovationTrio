package com.example.trioinnovation_app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class RegisterUserController {
    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField addressField;
    @FXML
    private TextField phoneNumberField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField idNumberField;

    @FXML
    private void handleNext() {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String address = addressField.getText();
        String phoneNumber = phoneNumberField.getText();
        String email = emailField.getText();
        String idNumber = idNumberField.getText();

        if (validateInput(firstName, lastName, address, phoneNumber, email, idNumber)) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirm Your Information");
            alert.setHeaderText(null);
            alert.setContentText("First Name: " + firstName + "\n"
                    + "Last Name: " + lastName + "\n"
                    + "Address: " + address + "\n"
                    + "Phone Number: " + phoneNumber + "\n"
                    + "Email: " + email + "\n"
                    + "ID Number: " + idNumber + "\n\n"
                    + "Is this information correct?");

            alert.showAndWait().ifPresent(response -> {
                if (response == ButtonType.OK) {
                    // Proceed to password creation
                    showPasswordCreationForm();
                }
            });
        }
    }

    private boolean validateInput(String firstName, String lastName, String address, String phoneNumber, String email, String idNumber) {
        // Add input validation logic here
        // For example, check if fields are not empty, valid email format, etc.
        return true;
    }

    private void showPasswordCreationForm() {
        // Show a new form or dialog to create a password
        // After password creation, validate and create the user account
    }
    public void handleNext(ActionEvent actionEvent) {
    }
}
