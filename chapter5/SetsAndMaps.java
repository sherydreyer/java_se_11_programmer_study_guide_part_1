package chapter5;

import java.util.*;

public class SetsAndMaps {
    public static void main(String[] args) {
        //        Creating Sets and Maps
        //Set is an interface
        //no indexing because it's not ordered
        //no duplicates
        //HashSet and TreeSet implements Set

        Set<Integer> hashset = new HashSet<>();
        System.out.println(hashset.add(66)); // true
        System.out.println(hashset.add(66)); // false
        System.out.println(hashset.add(50)); // true
        System.out.println(hashset);
        System.out.println(hashset.size()); // 1
        hashset.remove(66);
        System.out.println(hashset.isEmpty()); // true

        //TreeSet - sorted
        Set<Integer> treeset = new TreeSet<>();
        System.out.println(treeset.add(66)); // true
        System.out.println(treeset.add(66)); // false
        System.out.println(treeset.add(50)); // true
        System.out.println(treeset.add(40)); // true
        System.out.println(treeset); //sorted

//        Introducing Maps
//        A Map uses a key to identify values
        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        String food = map.get("koala"); // bamboo
        String other = map.getOrDefault("ant", "leaf"); // leaf
        System.out.println(food);
        System.out.println(other);
        for (String key : map.keySet())
            System.out.println(key + " " + map.get(key)); // koala

//        TreeMao sorted
        Map<String, String> treemap = new TreeMap<>();
        treemap.put("koala", "bamboo");
        treemap.put("bear", "snuggly");
        treemap.put("lion", "nala");
        treemap.put("elephant", "bigears");
        System.out.println(treemap);

    }
}
