package ru.imbabot.java2.lesson2;

public class MyArraySizeException extends Exception{

    public MyArraySizeException(String[][] arr, int firstD, int secondD){
        super(String.format("arr must be 4x4, but [%d][%d]", arr.length, arr[0].length));
    }
}
