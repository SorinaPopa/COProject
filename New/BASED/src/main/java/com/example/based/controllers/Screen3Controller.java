package com.example.based.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;

import com.example.based.Algorithms.*;
import com.example.based.timing.*;

import java.math.BigDecimal;


public class Screen3Controller extends MainAppControllers{

    private DigitsOfPi PI_obj;
    private EMain E_obj;
    private Sqrt2 SQRT2_obj;
    private long piTime;
    private long eTime;
    private long sqrt2Time;

    @FXML
    private TextArea piArea;
    @FXML
    private TextArea eArea;
    @FXML
    private TextArea sqrt2Area;
    @FXML
    private Label resultLabel;

    public void setValues(int number, int digit, int position){
        PI_obj= new DigitsOfPi(position);
        E_obj= new EMain(position);
        SQRT2_obj= new Sqrt2(position);

        Timer timer= new Timer();

        timer.start();
        BigDecimal piNumber=PI_obj.CalculateDigitsOfPi(position);
        piTime=timer.stop();

        timer.start();
        BigDecimal eNumber=E_obj.calculateE();
        eTime=timer.stop();

        timer.start();
        BigDecimal sqrt2Number=SQRT2_obj.calculateSqrt();
        sqrt2Time=timer.stop();

        //char[] piArray= piNumber.toString().toCharArray();

        int pi_digit= piNumber.toString().toCharArray()[position];
        int e_digit= eNumber.toString().toCharArray()[position];
        int sqrt2_digit= sqrt2Number.toString().toCharArray()[position];

        eArea.setText(Character.toString(e_digit));
        piArea.setText(Character.toString(pi_digit));
        sqrt2Area.setText(Character.toString(sqrt2_digit));

        if((number==1 && (digit+'0')==e_digit) || (number==2 && (digit+'0')==pi_digit) || (number==3 && (digit+'0')==sqrt2_digit))
            resultLabel.setText("You Won!");
        else
            resultLabel.setText("You Lost!");

        //to seconds implementation
        /*eTime/=1000000000;
        piTime/=1000000000;
        sqrt2Time/=1000000000;*/
    }

    @FXML
    private void handleNo(){
        mainApp.showScreen4(eTime, piTime, sqrt2Time);
    }
    @FXML
    private void handleYes(){
        mainApp.showScreen2();
    }
}
