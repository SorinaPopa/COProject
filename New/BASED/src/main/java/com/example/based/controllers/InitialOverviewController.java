package com.example.based.controllers;

import com.example.based.MainApp;
import javafx.fxml.FXML;

public class InitialOverviewController {
    private MainApp mainApp;

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    private void handleYes(){
        mainApp.showScreen2();
    }

    @FXML
    private void handleNo(){
        System.exit(0);
    }
}
