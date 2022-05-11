package com.example.based.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import com.example.based.Algorithms.DigitsOfPi;
import com.example.based.Algorithms.EMain;
import com.example.based.Algorithms.Sqrt2;
import javafx.stage.Stage;

public class Screen2Controller extends MainAppControllers{

    private int digit;
    private int irr_number;
    private Stage stage;


    private DigitsOfPi piNumber;
    private EMain eNumber;
    private Sqrt2 sqrt2Number;

    @FXML
    private TextField positionField;


    public void setStage(Stage stage){
        this.stage=stage;
    }

    private boolean isInputValid(){
        String errorMessage="";
        if(positionField.getText()==null || positionField.getText().length()==0)
            errorMessage+= "No valid position!\n";
        else{
            try {
                if(Integer.parseInt(positionField.getText())==0){
                    errorMessage+="Position 0 can't be used, use position 1 instead!\n";
                }
            }catch (NumberFormatException e){
                errorMessage+= "No valid position(must be an integer)!\n";
            }
        }

        if(errorMessage.length()==0)
            return true;
        else{
            errorMessage+= "Position values: 1-100";
            Alert alert= new Alert(Alert.AlertType.ERROR);
            alert.initOwner(stage);
            alert.setTitle("Invalid position Field");
            alert.setHeaderText("Please correct invalid position field");
            alert.setContentText(errorMessage);

            alert.showAndWait();

            return false;
        }
    }
    @FXML
    private void handleBet(){
        if(isInputValid())
            mainApp.showScreen3(irr_number, digit, Integer.parseInt(positionField.getText()));
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
