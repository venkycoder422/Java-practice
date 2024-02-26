package JavaMapInterface;

import java.util.*;

public class StoreDuplicatesInMap {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Orange");
        // duplicates not allowing even we put date twice
        map.put("S1", "Venky");
        map.put("S1", "Hari");
        System.out.println(map);

        HashMap<String, List<String>> fruits = new HashMap();
        List<String> fruitNames = new ArrayList<>();
        fruits.put("Fruits", fruitNames);
        System.out.println("Fruits Map without values:" + fruits);
        fruits.get("Fruits").add("Mango");
        fruits.get("Fruits").add("Orange");
        fruits.get("Fruits").add("Pinapple");

        System.out.println("Fruits Map with values:" + fruits);

      
    }
}
