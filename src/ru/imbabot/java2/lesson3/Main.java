package ru.imbabot.java2.lesson3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static String[] arr = {"a","b","c","a","c","f","d","f","z","x","f","l","l","y","z"};

    private static Set findUniqueWords(){
        Set<String> set = new HashSet<>();
        for (String s : arr){
            set.add(s);
        }
        return set;
    }

    private static Map countWords(){
        Map<String, Integer> map = new HashMap<>();
        for (String s :arr){
            if (!map.containsKey(s)){
                map.put(s, 1);
            }else if (map.containsKey(s)){
                map.put(s, map.get(s) + 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println( findUniqueWords());
        System.out.println(countWords());
    }
}
