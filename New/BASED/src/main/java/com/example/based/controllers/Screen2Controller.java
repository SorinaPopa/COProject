package com.example.based.controllers;

import com.example.based.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import com.example.based.Algorithms.DigitsOfPi;
import com.example.based.Algorithms.EMain;
import com.example.based.Algorithms.Sqrt2;

public class Screen2Controller extends MainAppControllers{

    private int digit;
    private int irr_number;

    private DigitsOfPi piNumber;
    private EMain eNumber;
    private Sqrt2 sqrt2Number;

    @FXML
    private TextField digitField;

    @FXML
    private void handleBet(){
        mainApp.showScreen3(irr_number, digit, Integer.parseInt(digitField.getText()));
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
