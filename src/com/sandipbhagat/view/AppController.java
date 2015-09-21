package com.sandipbhagat.view;

import com.sandipbhagat.MainApp;
import com.sandipbhagat.model.Story;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

/**
 * Created by sandip on 8/10/15.
 */
public class AppController implements Initializable{

    @FXML private TextField nameTextField;
    @FXML private DatePicker birthDate;
    @FXML private Button submitButton;

    // reference to the main application
    private MainApp mainApp;

    public AppController(){

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        submitButton.setOnAction(event -> handleSubmitButton());

    }

    private void handleSubmitButton() {
        String name = nameTextField.getText();
        int birthDay = 0;

        if (name.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.initOwner(mainApp.getPrimaryStage());
            alert.setTitle("Empty name");
            alert.setHeaderText("No name entered");
            alert.setContentText("Please enter your name.");

            alert.showAndWait();
        } else if (birthDate.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.initOwner(mainApp.getPrimaryStage());
            alert.setTitle("Empty date of birth");
            alert.setHeaderText("No date of birth entered");
            alert.setContentText("Please enter your date of birth.");

            alert.showAndWait();
        } else {
            try {
                birthDay = Integer.parseInt(DateTimeFormatter.ofPattern("dd").format(birthDate.getValue()));
            } catch (NumberFormatException ne) {
                ne.printStackTrace();
            }

            mainApp.showViewStoryDialog(nameTextField.getText() + ", your birth date story is:\n" , Story.fromBirthDate(birthDay));
        }
    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
}
