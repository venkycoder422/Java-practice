package JavaMapInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortHashMap {
    public static void main(String[] args) {
        // More specifically, we’ll look at sorting HashMap entries by their key or
        // value using:
        // TreeMap
        // ArrayList and Collections.sort()
        // TreeSet
        // Using the Stream API
        // Using the Guava library

        HashMap<String, String> student = new HashMap();

        student.put("ANT202301", "Venkatesulu D");
        student.put("ANT202309", "Amarendra E");
        student.put("ANT202307", "Varshita D");
        student.put("ANT202322", "Hema D");
        student.put("ANT202306", "Chinni E");

        System.out.println(student);

        // Sort Using Tree Map
        TreeMap<String, String> sortedStudentData = new TreeMap<>(student);

        Set<Entry<String, String>> entries = sortedStudentData.entrySet();

        System.out.println("Sort USING TREESET:");
        for (Entry<String, String> ele : entries) {
            System.out.println(ele.getKey() + ":" + ele.getValue());
        }

        // Sort Using ArrayList
        System.out.println("Sort Hash Map using ArrayList :");

        List<String> studentskey = new ArrayList<>(student.keySet());
        Collections.sort(studentskey);

        System.out.println(studentskey);

        // Using TreeSet
        System.out.println("Sort Hash Map using TreeSet and SortedSet :");
        SortedSet<String> keySet = new TreeSet<>(student.keySet());
        System.out.println(keySet);
        SortedSet<String> values = new TreeSet<>(student.values());
        System.out.println(values);

        // Sort using Stream API
        System.out.println("Sort Using Stream API");
        student.entrySet()
                .stream()
                .sorted(Map.Entry.<String, String>comparingByKey())
                .forEach(System.out::println);

     LinkedHashMap<String,String> sortedData = student.entrySet()
                .stream()
                .sorted(Map.Entry.<String, String>comparingByValue()).collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
                        
        System.out.println(sortedData);
    }

}
