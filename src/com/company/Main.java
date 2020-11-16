package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String[]> dictionary = new HashMap<>();
        dictionary.put("Planet", new String[]{"Saturn", "Jupiter", "Pluton", "Neptun"});
        dictionary.put("World", new String[]{"Live", "People", "Animal", "Insect", "Birds"});
        dictionary.put("Dogs", new String[]{"Mops", "Corgi", "Poodle", "Rottweiler"});
        dictionary.put("Electrical", new String[]{"Phone", "TV", "Computer", "WI-FI"});


        for (Map.Entry<String, String[]> d : dictionary.entrySet()) {
            System.out.println("Ключ: " + d.getKey() + ", Значение: " + Arrays.toString(d.getValue()));
        }

        System.out.println("_________________");

        HashMap<String, String[]> bigDictionary = new HashMap<>();
        bigDictionary.putAll(dictionary);
        Set<String> keys = dictionary.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            for (int i = 0; i < dictionary.get(key).length; i++) {
                ArrayList<String> v = new ArrayList<>();
                Collections.addAll(v, dictionary.get(key));
                String s = v.get(i);
                v.set(i, key);
                String[] s1 = new String[v.size()];
                for (int j = 0; j < v.size(); j++) {
                    s1[j] = v.get(j);
                }
                bigDictionary.put(s, s1);
            }
        }
        for (Map.Entry<String ,String[]> print : bigDictionary.entrySet()) {
            System.out.println(print.getKey() + " " +Arrays.toString(print.getValue()));
        }
    }
}
