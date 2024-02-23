package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
// import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayListEx {
    public static void main(String[] args) {
        Collection<Integer> numbers = IntStream.range(0, 10)
        .boxed()  // Converting primitive int to Integer
        .collect(Collectors.toCollection(ArrayList::new));

        // Converting the Collection ArrayList to an ArrayList
        ArrayList<Integer> list = new ArrayList<>(numbers);

        // System.out.println(numbers);

 // Using ListIterator to iterate over the list in reverse order
 ListIterator<Integer> it = list.listIterator(list.size());

 // Creating a new list to store elements in reverse order
 List<Integer> result = new ArrayList<>(list.size());
 List<Integer> res2 = new ArrayList<>(list.size());

  // Iterating in reverse order and adding elements to the result list
  while (it.hasPrevious()) {
    result.add(it.previous());
    }

    ListIterator<Integer> resvered = result.listIterator(res2.size());

    while (resvered.hasPrevious()) {
        res2.add(resvered.previous());
    }

    System.out.println(result);
    System.out.println(res2);


 //Search
 if(result.indexOf(11)>0){
    System.out.println(result.lastIndexOf(3));
    System.out.println("Found an element");
 }else{
    System.out.println("Not Found given element");
 }

 ArrayList<String> students = new ArrayList<>();
//  students.addAll("Venky", "Amar","Rajesh","Bala Reddy");

 students.addAll(Arrays.asList("Venky", "Amar","Rajesh","Bala Reddy"));

 // using contains method 
 if(students.contains("Venky")){
    System.out.println("Found");
 }

 //  search using Collection STreams API

 String match = "Venky";
 Collection <String> res4 = students.stream().filter(match::contains).collect(Collectors.toCollection(ArrayList::new));

 System.out.println("Seearch using Stream API"+res4);

 // Search sorted array using binary search

//  List <Integer> intCopy = new ArrayList<>(res2);
// Collections.sort(intCopy);
// int index = Collections.binarySearch(copy, "f");
// index will get positive number if found otherwise negetive number;

// Removing an element in lsit
students.remove("Venky");
System.out.println("Removed List"+students);

students.set(0,"CHiini");
System.out.println("Updated List"+students);

} 
}
