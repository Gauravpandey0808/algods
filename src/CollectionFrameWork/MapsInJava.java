package CollectionFrameWork;

import java.util.HashMap;
import java.util.Map;

public class MapsInJava {

    Map<String , Integer> hashMap;

    public void createHashMap() {
        hashMap = new HashMap<>();
    }

    public void insertValues(String key , int value) {
        hashMap.put(key , value);
    }

    public void printData() {
        System.out.println(hashMap);
    }

    public void getData(String key) {
        System.out.println(hashMap.get(key));
    }

    public static void main(String[] args) {
        MapsInJava maps = new MapsInJava();
        maps.createHashMap();
        maps.insertValues("v1",22);
        maps.insertValues("v2",21);
        maps.getData("v1");
        maps.printData();
    }

}
