import bench.CPUDigitsOfPi;

public class Main {
    public static void main(String[] args){
        CPUDigitsOfPi bench =new CPUDigitsOfPi();
        bench.initialize(1000);
        bench.run();
        bench.pi.getPi();
    }
}
