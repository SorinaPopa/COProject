package bench;

public interface IBenchmark {
    void run();
    void run(Object... param);
    void initialize(Object... param);
    void clean();
    void cancel();
    void warmUp();
    String getPi();
}
