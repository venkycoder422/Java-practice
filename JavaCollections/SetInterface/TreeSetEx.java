package JavaCollections.SetInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TreeSetEx {
    public static void main(String[] args) {
        
        Collection<Integer> number = IntStream.range(0, 10)
        .boxed()  // Converting primitive int to Integer
        .collect(Collectors.toCollection(TreeSet::new));
        
        TreeSet<Integer> treeset = new TreeSet<>();
        treeset.addAll(number);

        // treeset.add(null); // Tree set not allow nulls
        treeset.add(4); // duplication not allows

        System.out.println(treeset.first()); // and last() - not have first element throws Nosuchelement

        Set<Integer> subSet = treeset.subSet(2, 6);

        System.out.println(subSet); // return from 2nd index to 5th index toElement is Exclusive 

        Set<Integer> headSet = treeset.headSet(6);
        System.out.println("Head Set :"+headSet);
        Set<Integer> tailSet = treeset.tailSet(6);
        System.out.println("Tail Set:"+tailSet);

        System.out.println(treeset);

        
    }
    
}
