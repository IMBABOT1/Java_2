package ru.imbabot.java2.lesson3.PhoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private Map<String, List<Person>> map;

    public PhoneBook(){
        map = new HashMap<>();
    }

    void add(Person p){
        List<Person> list = map.get(p.getLastname());
        if (list == null){
            list = new ArrayList<>();
            map.put(p.getLastname(), list);
        }
        list.add(p);
    }

    List<Person> get(String lastname){
        List<Person> list = new ArrayList<>();
        for (Map.Entry<String, List<Person>> m : map.entrySet()){
            if (m.getKey().equals(lastname)){
                list = m.getValue();
            }
        }
        return list;
    }
}
