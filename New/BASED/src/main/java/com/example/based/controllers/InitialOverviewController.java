package com.example.based.controllers;

import com.example.based.MainApp;
import javafx.fxml.FXML;

public class InitialOverviewController extends MainAppControllers{

    @FXML
    private void handleYes(){
        mainApp.showScreen2();
    }

    @FXML
    private void handleNo(){
        mainApp.showExitScreen();
    }
}
