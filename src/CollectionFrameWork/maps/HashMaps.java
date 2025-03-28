package CollectionFrameWork.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps {

    Map<String, String> studentData;


    HashMaps() {
        this.studentData = new HashMap<>();
    }

    public static void main(String[] args) {
        HashMaps m1 = new HashMaps();

        m1.insertIntoMap("1", "Gaurav");
        m1.insertIntoMap("2", "Tarun");
        m1.insertIntoMap("3", "Sachin");
        m1.insertIntoMap("4", "Priya");
        m1.insertIntoMap("5", "Sanjana");
        m1.insertIntoMap("6", "Ayushi");
        m1.insertIntoMap("7", "Gaurav");
        m1.insertIntoMap("8", "Sanjay");

        System.out.println(m1.isMapContainsKey("22"));

        System.out.println(m1.getValueFromKey("2"));
    }

    public void iterateMap() {
        Set<Map.Entry<String, String>> set = studentData.entrySet();

        for(Map.Entry<String, String> i : set) {
            System.out.println(i.getKey() + ":" + i.getValue());
        }

    }

    public void insertIntoMap(String key, String value) {
        studentData.put(key, value);
    }

    public boolean isMapContainsKey(String key) {
        return studentData.containsKey(key);
    }

    public String getValueFromKey(String key) {
        Set<Map.Entry<String, String>> value = studentData.entrySet();

        for(Map.Entry<String, String> i : value) {
            System.out.println(i.getValue());
        }

        return studentData.get(key);
    }
}