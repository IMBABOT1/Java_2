package ru.imbabot.java2.lesson5;

import java.util.Arrays;

public class Main {







    private static void method1(){
        int size = 10000000;
        final float[] arr = new float[size];
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

    private static String method2(){
        int size = 10000000;
        final float[] arr = new float[size];
        int h = size / 2;

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();
        float[] first = new float[h];
        float[] second = new float[h];
        System.arraycopy(arr, 0, first, 0, h);
        System.arraycopy(arr, h, second, 0, h);


        Thread t = new Thread(new ArrThread(first, 0));
        Thread t2 = new Thread(new ArrThread(second, h));
        t.start();
        t2.start();

        try {
            t.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        System.arraycopy(first, 0, arr, 0, h);
        System.arraycopy(second, 0, arr, h, h);

        long time = System.currentTimeMillis() - a;

        float temp = 0;
        for (int i = 0; i <arr.length ; i++) {
            temp += arr[i];
        }


        System.out.println(temp);

        return time + " " + second;
    }



    public static void main(String[] args) {
        method1();
       method2();
    }
}
