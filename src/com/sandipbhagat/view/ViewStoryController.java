package com.sandipbhagat.view;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;


/**
 * Created by sandip on 8/10/15.
 */
public class ViewStoryController implements Initializable{

    @FXML private Label nameLabel;
    @FXML private Label storyLabel;
    @FXML private TextField storyTextField;
    @FXML private Button copyButton;

    @FXML private Stage viewStoryStage;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        copyButton.setOnAction(event -> {
            copyStoryToClipboard();
        });
    }

    public void setViewStoryStage(Stage viewStoryStage) {
        this.viewStoryStage = viewStoryStage;
    }

    public void setNameLabel(String name) {
        this.nameLabel.setText(name);
    }

    public void setStoryLabel(String story) {
        this.storyLabel.setText(story);
    }

    public void setStoryTextField() {
        this.storyTextField.setText(storyLabel.getText());
    }

    public void copyStoryToClipboard() {
        this.setStoryTextField();
        this.storyTextField.selectAll();
        this.storyTextField.copy();
    }
}
