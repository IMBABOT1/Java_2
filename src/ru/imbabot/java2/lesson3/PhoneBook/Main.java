package ru.imbabot.java2.lesson3.PhoneBook;

public class Main {

    public static void main(String[] args) {

        PhoneBook book = new PhoneBook();
        book.add(new Person("first", 880000000));
        book.add(new Person("second", 880000001));
        book.add(new Person("second", 880000004));
        book.add(new Person("four", 880000002));
        book.add(new Person("five", 880000002));
        book.add(new Person("six", 880000003));


        System.out.println(book.get("second"));


    }
}
