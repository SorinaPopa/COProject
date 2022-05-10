package com.example.based.controllers;

import com.example.based.MainApp;
import javafx.fxml.FXML;

public class Screen2Controller extends MainAppControllers{

    private int digit;
    private int irr_number;

    @FXML
    private void handleBet(){
        mainApp.showScreen3();
    }
    @FXML
    private void handleZero(){
        digit=0;
    }
    @FXML
    private void handleOne(){
        digit=1;
    }
    @FXML
    private void handleTwo(){
        digit=2;
    }
    @FXML
    private void handleThree(){
        digit=3;
    }
    @FXML
    private void handleFour(){
        digit=4;
    }
    @FXML
    private void handleFive(){
        digit=5;
    }
    @FXML
    private void handleSix(){
        digit=6;
    }
    @FXML
    private void handleSeven(){
        digit=7;
    }
    @FXML
    private void handleEight(){
        digit=8;
    }
    @FXML
    private void handleNine(){
        digit=9;
    }
    @FXML
    private void handleE(){
        irr_number=1;
    }
    @FXML
    private void handlePi(){
        irr_number=2;
    }
    @FXML
    private void handleSqrt(){
        irr_number=3;
    }

}
