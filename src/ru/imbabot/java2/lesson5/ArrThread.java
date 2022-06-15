package ru.imbabot.java2.lesson5;

public class ArrThread implements Runnable{

    private float[] arr;
    private int offset;

    public ArrThread(float[] arr, int offset){
        this.arr = arr;
        this.offset = offset;
    }

    @Override
    public void run() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + (i +offset) / 5) * Math.cos(0.2f + (i + offset) / 5) * Math.cos(0.4f + (i + offset) / 2));
        }
    }
}
