package com.example.based.controllers;

import com.example.based.MainApp;
import javafx.fxml.FXML;

public class ExitScreenController extends MainAppControllers{
    @FXML
    private void handleClose(){
        System.exit(0);
    }
}
