package com.example.based.timing;

public class Timer implements ITimer{
    public long start,elapsed,totalTime;
    TimerState state;
        public Timer()
        {
            state=TimerState.stoped;
        }
    public void start()
    {
        this.totalTime=0;
        this.elapsed=0;
        this.start=System.nanoTime();
        state=TimerState.running;
    }

    public long stop()
    {
        if(state.equals(TimerState.running)) {
            this.elapsed = System.nanoTime() - this.start;
            this.totalTime = this.totalTime + this.elapsed;
            state=TimerState.stoped;
        }
        return this.totalTime;
    }

    public void resume() {
            this.start = System.nanoTime();
            state=TimerState.running;

    }

    public long pause()
    {
        if(state.equals(TimerState.running)) {
            this.elapsed = System.nanoTime() - this.start;
            this.totalTime = this.totalTime + this.elapsed;
            state=TimerState.paused;
        }
        return this.elapsed;
    }

}
