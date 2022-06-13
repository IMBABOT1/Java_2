package ru.imbabot.java2.lesson2;

public class MyArrayDataException extends Exception{

    public MyArrayDataException(int first, int second){
        super(String.format("Invalid data format in [%d][%d]", first, second));
    }

}
