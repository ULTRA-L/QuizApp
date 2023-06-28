package com.main.Game;

import javafx.concurrent.Task;

public class TimeThread extends Task<String> {
    private long start, end, tim, min, sec;
    private boolean isRunning;
    public TimeThread(){
        this.isRunning = true;
    }

    public void setIsRunning(boolean isRunning){
        this.isRunning = isRunning;
    }
    public long[] getProperTime(){
        long[] result = new long[3];
        result[0] = tim;
        result[1] = sec;
        result[2] = min;

        return result;
    }

    //public void run() {
    //    boolean print = false;
    //    start=System.currentTimeMillis();
    //    while(isRunning){
    //        end=System.currentTimeMillis();
    //        tim= (end-start)/1000;
    //        sec= tim % 60;
    //        min= (tim / 60);
    //        timeLabel.setText((int)min + ":" + (int)sec);
    //        //if(sec%2 == 1 && print == true){
    //        //    System.out.printf("%02d:%02d:%02d",hour,min,sec);
    //        //    System.out.println();
    //        //    print = false;
    //        //} else if (sec%2 == 0 && print == false) {
    //        //    System.out.printf("%02d:%02d:%02d",hour,min,sec);
    //        //    System.out.println();
    //        //    print = true;
    //        //}
    //    }
    //}

    @Override
    protected String call() throws Exception {
        String result = new String();
        start=System.currentTimeMillis();
        while(isRunning) {
            end = System.currentTimeMillis();
            tim = (end - start) / 1000;
            sec = tim % 60;
            min = (tim / 60);
            result = String.format("%02d", min) + ":" + String.format("%02d", sec);
            System.out.println(result);
            updateMessage(result);
        }
        return result;
    }
}
