package JavaMapInterface;

import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.RowFilter.Entry;

public class HashTableEx {
    public static void main(String[] args) {
        //Creation of Map
        Map<Integer,String> studentData = new Hashtable<>();
        // Add elements into data
        studentData.put(1,"Venkat");
        studentData.put(2,"Hari");
        studentData.put(3,"Amar");
        studentData.put(4,"Chandu");
        studentData.put(5,"Venu");

        // Retrive keys
       Set<Integer> intList = studentData.keySet(); 

        for(Integer key:intList){
            // System.out.println(key);
        }

        // Retrive values from Map
        Collection<String> studentValues = studentData.values();

        studentValues.forEach((data)->System.out.println(data));

        // get by key 
        System.out.println(studentData.get(2));

        // delete values

        System.out.println(studentData.remove(2));

        System.out.println(studentData.containsKey(1));

        System.out.println(studentData.containsValue("Venkat"));
        System.out.println(studentData);
        studentData.put(1,"Ramesh"); // replace() - update value;
        System.out.println(studentData);
        studentData.putIfAbsent(7,"absent");
        System.out.println(studentData);

        System.out.println(studentData.size());

        // studentData.clear();

        System.out.println(studentData);

        // get Entries

        Set<java.util.Map.Entry<Integer, String>> entries = studentData.entrySet();
        for (java.util.Map.Entry<Integer, String> iterable_element : entries) {
            
            System.out.println(iterable_element.getKey());
            System.err.println(iterable_element.getValue());
        }
        

        // The ramaing classes usuage is same as above but the implimentation of it depends upon the use case
        // Thread ENV , FIFO, Sort, Nodes 

    }
}
