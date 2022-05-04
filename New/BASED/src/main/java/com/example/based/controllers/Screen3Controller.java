package com.example.based.controllers;

import javafx.fxml.FXML;

public class Screen3Controller extends MainAppControllers{

    @FXML
    private void handleNo(){
        mainApp.showScreen4();
    }
    @FXML
    private void handleYes(){
        mainApp.showScreen2();
    }
}
