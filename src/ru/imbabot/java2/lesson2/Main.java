package ru.imbabot.java2.lesson2;

import java.util.Arrays;
import java.util.Random;
import java.util.zip.DataFormatException;

public class Main {

    private static int method(String[][] arr)throws MyArrayDataException, MyArraySizeException {
        int firstLength = arr.length;
        int secondLength = arr[0].length;

        if (firstLength != 4 || secondLength != 4) {
            throw new MyArraySizeException(arr, firstLength, secondLength);
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
              try {
                  sum += Integer.parseInt(arr[i][j]);
              }catch (NumberFormatException e){
                  throw new MyArrayDataException(i, j);
              }
            }
        }
        return sum;
    }




    public static void main(String[] args) {
       String[][] arr = new String[4][4];
        Random rnd = new Random();

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = String.valueOf(rnd.nextInt(10));
            }
        }
      // arr[1][0] = "s";

        try {
            System.out.println(method(arr));
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }
}
