package ru.imbabot.java2.lesson5;

import java.util.Arrays;

public class Main {

    private static final int SIZE = 10000000;
    private static final int H = SIZE/2;
    private static final float[] arr = new float[SIZE];

    private static float[] first = new float[H];
    private static float[] second = new float[H];


    private static void method1(){

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }


        long a = System.currentTimeMillis();

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }




        System.out.println(System.currentTimeMillis() - a);

        float result = 0;

        for (int i = 0; i < arr.length ; i++) {
            result +=  arr[i];
        }

        System.out.println(result);

    }

    private static void method2(){

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();


        System.arraycopy(arr, 0, first, 0, H);
        System.arraycopy(arr, H, second, 0, H);

        Thread t = new Thread(new ArrThread(first,0));
        Thread t2 = new Thread(new ArrThread(second, H));
        t.start();
        t2.start();
        try {
            t.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        System.arraycopy(first, 0, arr, 0, H);
        System.arraycopy(second, 0, arr, H, H);


        System.out.println(System.currentTimeMillis() - a);

        float result = 0;

        for (int i = 0; i <arr.length ; i++) {
            result += arr[i];
        }

        System.out.println(result);

    }


    public static void main(String[] args) {
        method1();
       method2();
    }
}
