package com.main.Game;

import javafx.concurrent.Task;

public class TimeThread extends Task<String> {
    private long start, end, tim, min, sec;
    private String result;
    private boolean isRunning;
    public TimeThread(){
        this.isRunning = true;
    }

    public void setIsRunning(boolean isRunning){
        this.isRunning = isRunning;
    }
    //public String getResult(){
    //    return this.result;
    //}
    public int getTime(){
        return (int) this.tim;
    }

    @Override
    protected String call() {
        start=System.currentTimeMillis();
        while(isRunning) {
            end = System.currentTimeMillis();
            tim = (end - start) / 1000;
            sec = tim % 60;
            min = (tim / 60);
            result = String.format("%02d", min) + ":" + String.format("%02d", sec);
            //System.out.println(result);
            updateMessage(result);
        }
        return result;
    }
}
