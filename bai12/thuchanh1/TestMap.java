package bai12.thuchanh1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Smith",30);
        hashMap.put("Anderson",31);
        hashMap.put("Lewis",29);
        hashMap.put("Cook",29);
        System.out.println("hien thi hashmap");
        System.out.println(hashMap);

        Map<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Smith",30);
        linkedHashMap.put("Anderson",31);
        linkedHashMap.put("Lewis",29);
        linkedHashMap.put("Cook",29);
        System.out.println("hien thi linkedHashMap");
        System.out.println(linkedHashMap);

        Map<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("Smith",30);
        treeMap.put("Anderson",31);
        treeMap.put("Lewis",29);
        treeMap.put("Cook",29);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
    }

}
