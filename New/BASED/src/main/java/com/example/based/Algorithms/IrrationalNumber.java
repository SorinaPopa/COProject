package com.example.based.Algorithms;

import javafx.beans.property.*;

import java.text.DecimalFormat;

public class IrrationalNumber {

    private StringProperty name;
    private StringProperty time;
    private StringProperty score;

    public IrrationalNumber(){
        this(null, 0, 0.0);
    }

    public IrrationalNumber(String name, long time, double score){
        this.name= new SimpleStringProperty(name);
        this.time= new SimpleStringProperty(Long.toString(time));
        this.score= new SimpleStringProperty(Double.toString(score).substring(0, 10));
    }

    public String getName(){
        return name.get();
    }
    public StringProperty getNameProperty(){
        return name;
    }

    /*public Long getTime(){
        return time.get();
    }*/
    public StringProperty getTimeProperty(){
        return time;
    }

    /*public Double getScore(){
        return score.get();
    }*/
    public StringProperty getScoreProperty(){
        return score;
    }
}
