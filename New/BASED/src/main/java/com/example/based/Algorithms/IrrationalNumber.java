package com.example.based.Algorithms;

import javafx.beans.property.*;

public class IrrationalNumber {

    private StringProperty name;
    private LongProperty time;
    private DoubleProperty score;

    public IrrationalNumber(){
        this(null, 0, 0.0);
    }

    public IrrationalNumber(String name, long time, double score){
        this.name= new SimpleStringProperty(name);
        this.time= new SimpleLongProperty(time);
        this.score= new SimpleDoubleProperty(score);
    }

    public String getName(){
        return name.get();
    }
    public StringProperty getNameProperty(){
        return name;
    }

    public Long getTime(){
        return time.get();
    }
    public LongProperty getTimeProperty(){
        return time;
    }

    public Double getScore(){
        return score.get();
    }
    public DoubleProperty getScoreProperty(){
        return score;
    }
}
