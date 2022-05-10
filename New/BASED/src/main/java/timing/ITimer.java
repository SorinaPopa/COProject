package timing;

public interface ITimer {
    /**
     * Starts a new timer. <br>
     * If called without prior <b>stop</b>,it resets the current time loosing all
     * time information
     */
    void start();
    /**
     * Stop and reset current timer.
     * @return Elapsed <b>nanoseconds</b> since <b>start</b> was invoked.
     */
    long stop();
    void resume();
    long pause();
}
