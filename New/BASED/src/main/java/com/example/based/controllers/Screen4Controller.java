package com.example.based.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Screen4Controller extends MainAppControllers{

    @FXML
    private TextArea piArea;
    @FXML
    private TextArea eArea;
    @FXML
    private TextArea sqrt2Area;

    public void setValues(long eTime, long piTime, long sqrt2Time) {
        piArea.setText(Long.toString(piTime));
        eArea.setText(Long.toString(eTime));
        sqrt2Area.setText(Long.toString(sqrt2Time));
    }

    @FXML
    private void handleClose(){
        System.exit(0);
    }
}
