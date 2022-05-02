package bench;

import java.math.BigDecimal;


public class CPUDigitsOfPi implements IBenchmark {
    int start;
    public DigitsOfPi pi;
    @Override
    public void run() {
        pi.CalculateDigitsOfPi(start);

    }

    public String getPi()
    {
        return pi.getPi();
    }

    @Override
    public void run(Object... param) {
    }


    @Override
    public void initialize(Object... param) {
        start=(Integer)param[0];
        pi=new DigitsOfPi(start);
    }

    @Override
    public void clean() {

    }

    @Override
    public void cancel() {

    }

    @Override
    public void warmUp() {
        DigitsOfPi piWarm=new DigitsOfPi(1000);piWarm.CalculateDigitsOfPi(100);
        System.out.println("warm up done");
    }
}
