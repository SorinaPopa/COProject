package com.example.based.controllers;

import com.example.based.MainApp;
import javafx.fxml.FXML;

public class Screen2Controller extends MainAppControllers{

    @FXML
    private void handleBet(){
        mainApp.showScreen3();
    }
}
