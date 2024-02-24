package JavaCollections.SetInterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String[] args) {
// It stores unique elements and permits nulls
// It’s backed by a HashMap
// It doesn’t maintain insertion order
// It’s not thread-safe

        HashSet<String> rollNo = new HashSet<>();

        rollNo.add("SVDC001");
        rollNo.add("SVDC002");
        rollNo.add(null);
        rollNo.add("SVDC004"); // If the set have value already it ignores to add value;
        rollNo.add("SVDC004");

        System.out.println(rollNo); //It doesn’t maintain insertion order

        if(rollNo.contains("SVDC001")){
            System.out.println("The Student ID-1 Has attended class");
        }else{
            System.out.println("Student with given ID-1 not attended class");
        }

        rollNo.remove("SVDC004"); // The student id-4 dropped

        System.out.println(rollNo.size());

       

        Iterator<String> itr = rollNo.iterator();

        while(itr.hasNext()){
            System.out.println("Student ID-"+itr.next());
        }

        rollNo.clear();

        if(rollNo.isEmpty()){
            System.out.println("Please add elements into Set");
        }

    }
}
