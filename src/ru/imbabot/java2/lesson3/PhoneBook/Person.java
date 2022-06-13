package ru.imbabot.java2.lesson3.PhoneBook;

public class Person {

    private String lastname;
    private int phone;

    public String getLastname(){
        return lastname;
    }

    public Person(String lastname, int phone){
        this.lastname = lastname;
        this.phone = phone;
    }

    @Override
    public int hashCode() {
        return lastname.hashCode() + phone * 31;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)){
            return false;
        }
        Person p = (Person) obj;

        return this.lastname.equals(p.lastname) && this.phone == p.phone;
    }

    @Override
    public String toString() {
        return "Lastname: " + lastname + " " + "Phone: " + phone;
    }
}
