package com.example.based.Algorithms;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Sqrt2 {
    private int precision;
    public Sqrt2(int no)
    {
        precision=no+1;
    }

    public BigDecimal calculateSqrt(){
        BigDecimal x=new BigDecimal(2).setScale( precision, RoundingMode.HALF_EVEN);
        BigDecimal y=new BigDecimal(1).setScale(precision, RoundingMode.HALF_EVEN);

        for(int i=0;i<precision;i++)
        {
            y=(x.divide(y,precision, RoundingMode.HALF_EVEN).add(y).setScale(precision, RoundingMode.HALF_EVEN));
            y=y.divide(x,precision, RoundingMode.HALF_EVEN);
        }
        return y;
    }
}
