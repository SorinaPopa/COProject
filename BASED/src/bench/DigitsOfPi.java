package bench;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;


public class DigitsOfPi{

    static int precision;
    private BigDecimal pi;
    public DigitsOfPi(int no)
    {
        this.precision=no+1;
    }

    public BigDecimal CalculateDigitsOfPi(int no) {
        BigDecimal finalResult=BigDecimal.ZERO;
        for (int i = 0; i < no; i++) {

            BigDecimal m1 = factorial(6 * i).setScale(precision,RoundingMode.HALF_EVEN);
            BigDecimal m2=factorial(3*i).multiply(pow(factorial(i),3)).setScale(precision,RoundingMode.HALF_EVEN);
            BigDecimal m=m1.divide(m2,precision,BigDecimal.ROUND_HALF_EVEN).setScale(precision,RoundingMode.HALF_EVEN);

            BigDecimal l=new BigDecimal(545140134*i).setScale(precision,RoundingMode.HALF_EVEN);
            l=l.add(new BigDecimal(13591409)).setScale(precision,RoundingMode.HALF_EVEN);


            BigDecimal x=new BigDecimal("-262537412640768000").setScale(precision,RoundingMode.HALF_EVEN);
            x=x.pow(i).setScale(precision,RoundingMode.HALF_EVEN);

            BigDecimal result = BigDecimal.ZERO;
            result = result.setScale(precision, BigDecimal.ROUND_HALF_EVEN);
            result=m.multiply(l).setScale(precision,RoundingMode.HALF_EVEN);
            result=result.divide(x,precision,RoundingMode.HALF_EVEN).setScale(precision,RoundingMode.HALF_EVEN);

            finalResult=finalResult.add(result).setScale(precision,RoundingMode.HALF_EVEN);


        }
        pi=BigDecimal.valueOf(1).setScale(precision,RoundingMode.HALF_EVEN);
        pi=pi.divide(finalResult,precision,BigDecimal.ROUND_HALF_EVEN);


        BigDecimal c=new BigDecimal(426880).setScale(precision,RoundingMode.HALF_EVEN);
        BigDecimal csqrt=new BigDecimal(10005).setScale(precision,RoundingMode.HALF_EVEN);;
        c=c.multiply(csqrt.sqrt(new MathContext(precision)).setScale(precision,RoundingMode.HALF_EVEN)).setScale(precision,RoundingMode.HALF_EVEN);
        pi=c.multiply(pi).setScale(precision,RoundingMode.HALF_EVEN);

        return pi;
    }
    public static BigDecimal pow(double val, int power){     return pow(new BigDecimal(val), power);  }
    public static BigDecimal pow(BigDecimal val, int power){     BigDecimal value = BigDecimal.valueOf(1).setScale(precision,RoundingMode.HALF_EVEN);
        for(int i = 1; i <= power; i ++){
            value = value.multiply(val).setScale(precision,RoundingMode.HALF_EVEN);
        }
        return value;
    }


    public static BigDecimal factorial(int n){
        BigDecimal value = BigDecimal.valueOf(1);
        for(int i = 1; i <=n; i++){
            value = value.multiply(BigDecimal.valueOf(i)).setScale(precision,RoundingMode.HALF_EVEN);
        }
        return value;
    }
    public String getPi()
    {
        System.out.println(pi);
        pi=pi.setScale(100,RoundingMode.HALF_UP);
        return pi.toString();
    }
}
