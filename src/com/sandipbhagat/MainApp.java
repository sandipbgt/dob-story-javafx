package com.sandipbhagat;

import com.sandipbhagat.view.AppController;
import com.sandipbhagat.view.ViewStoryController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    private Stage primaryStage;
    private GridPane rootLayout;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Date Of Birth");

        initRootLayout();
    }

    // initializes root layout
    public void initRootLayout() {
        try {

            // load root layout from fxml file
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/App.fxml"));
            rootLayout = loader.load();

            // show the scene containing the root layout
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);

            // give the controller access to the main app
            AppController controller = loader.getController();
            controller.setMainApp(this);

            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // returns the main stage
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void showViewStoryDialog(String name, String story) {
        try {

            // load the fxml file and create a new stage for the popup dialog
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/ViewStory.fxml"));
            VBox page = loader.load();

            // create the dialog Stage
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Your Story");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);

            // set the story into the controller
            ViewStoryController controller = loader.getController();
            controller.setViewStoryStage(dialogStage);
            controller.setNameLabel(name);
            controller.setStoryLabel(story);

            dialogStage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
