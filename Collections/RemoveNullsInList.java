package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveNullsInList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = Arrays.asList(null, null, 1, null);
        list.addAll(list2);
        // using remove method
        // while (list.remove(null));
        System.out.println("Using remove method:"+list);

        // removing null using Lamba Streams
    List<Integer> listWithoutNullsParallelStream = list.parallelStream()
      .filter(Objects::nonNull)
      .collect(Collectors.toList());

      List<Integer> listWithoutNullsStream = list.stream()
      .filter(Objects::nonNull)
      .collect(Collectors.toList());

      System.out.println("Remove null using Parallel Stream:"+listWithoutNullsParallelStream);
      System.out.println("Remove null using Stream:"+listWithoutNullsStream);

     

    }
}
