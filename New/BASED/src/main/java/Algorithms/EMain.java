package Algorithms;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class EMain {
    static int precision;

    public EMain(int no)
    {
        precision=no+1;
    }

    public BigDecimal calculateE()
    {
        BigDecimal E=new BigDecimal(0).setScale(precision,RoundingMode.HALF_EVEN);
        BigDecimal factorialStep=new BigDecimal(0).setScale(precision,RoundingMode.HALF_EVEN);;
        BigDecimal one=new BigDecimal(1).setScale(precision,RoundingMode.HALF_EVEN);
        for(int i=0;i<precision-1;i++)
        {
            factorialStep=one.divide(factorial(i),precision,RoundingMode.HALF_EVEN).setScale(precision,RoundingMode.HALF_EVEN);
            E=E.add(factorialStep).setScale(precision,RoundingMode.HALF_EVEN);
        }
        return E;
    }
    public static BigDecimal factorial(int n){
        BigDecimal value = BigDecimal.valueOf(1).setScale(precision, RoundingMode.HALF_EVEN);;
        for(int i = 1; i <=n; i++){
            value = value.multiply(BigDecimal.valueOf(i)).setScale(precision,RoundingMode.HALF_EVEN);
        }
        return value;
    }
}
