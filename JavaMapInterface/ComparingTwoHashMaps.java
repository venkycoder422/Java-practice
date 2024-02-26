package JavaMapInterface;

import java.util.HashMap;
import java.util.Map;

public class ComparingTwoHashMaps {
    public static void main(String[] args) {

    Map<String, String> asiaCapital1 = new HashMap<String, String>();
    asiaCapital1.put("Japan", "Tokyo");
    asiaCapital1.put("South Korea", "Seoul");

    Map<String, String> asiaCapital2 = new HashMap<String, String>();
    asiaCapital2.put("South Korea", "Seoul");
    asiaCapital2.put("Japan", "Tokyo");

    Map<String, String> asiaCapital3 = new HashMap<String, String>();
    asiaCapital3.put("Japan", "Tokyo");
    asiaCapital3.put("China", "Beijing");

    System.out.println(asiaCapital1.equals(asiaCapital2));

    System.out.println(asiaCapital1.equals(asiaCapital3));
     // Compare two maps using stream API 
    System.out.println(areEqual(asiaCapital1,asiaCapital3));

    // Compare using keys 
    System.out.println(asiaCapital1.keySet().equals(asiaCapital3.keySet()));
    System.out.println(asiaCapital1.values().equals(asiaCapital2.values()));
   
    
    }

    static boolean areEqual(Map<String, String> first, Map<String, String> second) {
        if (first.size() != second.size()) {
            return false;
        }
    
        return first.entrySet().stream()
          .allMatch(e -> e.getValue().equals(second.get(e.getKey())));
    }
    

    
}
