package com.example.based.controllers;

import com.example.based.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import com.example.based.Algorithms.IrrationalNumber;

public class Screen4Controller extends MainAppControllers{

    @FXML
    private TableView<IrrationalNumber> scoreTable;
    @FXML
    private TableColumn<IrrationalNumber, String> nameColumn;
    @FXML
    private TableColumn<IrrationalNumber, String> timeColumn;
    @FXML
    private TableColumn<IrrationalNumber, String> scoreColumn;

    public void setMainApp(MainApp mainApp){
        this.mainApp=mainApp;
        scoreTable.setItems(mainApp.getNumberData());
    }
    @FXML
    private void initialize(){


        nameColumn.setCellValueFactory(cellData->cellData.getValue().getNameProperty());
        timeColumn.setCellValueFactory(cellData->cellData.getValue().getTimeProperty());
        scoreColumn.setCellValueFactory(cellData->cellData.getValue().getScoreProperty());
    }


    public void setValues(long eTime, long piTime, long sqrt2Time) {
        /*piArea.setText(Long.toString(piTime));
        eArea.setText(Long.toString(eTime));
        sqrt2Area.setText(Long.toString(sqrt2Time));*/
    }

    @FXML
    private void handleClose(){
        System.exit(0);
    }
}
