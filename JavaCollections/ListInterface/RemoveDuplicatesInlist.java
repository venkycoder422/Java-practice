package JavaCollections.ListInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesInlist {
    public static void main(String[] args) {
    List<Integer> anotherList = Arrays.asList(5, 12, 9, 3, 15, 88,5,12,9);

    // Remove dupliacates using disticnt method
      List<Integer> listWithoutDuplicates = anotherList.stream()
     .distinct()
     .collect(Collectors.toList());

     // Remove duplicates using HashSet or LinkedHashSet
      List<Integer> list2WithoutDuplicates = new ArrayList<>(
      new HashSet<>(anotherList));

     System.out.println("Remove null using distinct method:"+listWithoutDuplicates);
     System.out.println("Remove null using HasSetmethod:"+list2WithoutDuplicates);

    }
}
