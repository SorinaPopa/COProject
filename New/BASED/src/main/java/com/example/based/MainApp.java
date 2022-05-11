package com.example.based;

import com.example.based.controllers.*;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    private Stage primaryStage;

    private BorderPane rootLayout;

    public MainApp(){

    }

    public void start(Stage primaryStage){
        this.primaryStage= primaryStage;
        this.primaryStage.setTitle("Based Gambling");
        Image icon = new Image(getClass().getResourceAsStream("trifoi.png"));
        primaryStage.getIcons().add(icon);
        initRootLayout();

        showInitialOverview();
    }

    public void initRootLayout(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("RootLayout.fxml"));
            rootLayout = loader.load();

            Scene scene= new Scene(rootLayout);
            primaryStage.setScene(scene);

            RootLayoutController controller= loader.getController();
            controller.setMainApp(this);

            primaryStage.show();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public void showInitialOverview(){
        try {
            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("hello-view.fxml"));
            Pane initialOverview= loader.load();

            rootLayout.setCenter(initialOverview);

            InitialOverviewController controller= loader.getController();
            controller.setMainApp(this);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void showScreen2(){
        try {
            FXMLLoader loader=new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("screen2.fxml"));
            Pane pane= loader.load();

            rootLayout.setCenter(pane);

            Screen2Controller controller= loader.getController();
            controller.setMainApp(this);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void showScreen3(int number, int digit, int position){
        try {
            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("screen3.fxml"));
            Pane pane= loader.load();

            rootLayout.setCenter(pane);

            Screen3Controller controller= loader.getController();
            controller.setMainApp(this);
            controller.setValues(number, digit,position);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void showScreen4(long eTime, long piTime, long sqrt2Time){
        try {
            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("screen4.fxml"));
            Pane pane= loader.load();

            rootLayout.setCenter(pane);

            Screen4Controller controller= loader.getController();
            controller.setMainApp(this);
            controller.setValues(eTime, piTime, sqrt2Time);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void showExitScreen(){
        try {
            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("exitScreen.fxml"));
            Pane pane= loader.load();

            rootLayout.setCenter(pane);

            ExitScreenController controller= loader.getController();

            controller.setMainApp(this);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public Stage getPrimaryStage(){
        return primaryStage;
    }

    public static void main(String[] args) {
        launch();
    }
}
