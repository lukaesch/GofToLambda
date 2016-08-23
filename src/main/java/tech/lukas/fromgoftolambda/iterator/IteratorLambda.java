package tech.lukas.fromgoftolambda.iterator;

import static java.util.Arrays.asList;

/**
 * Created by lukas on 11.04.16.
 */
public class IteratorLambda {
    static final java.util.List<Integer> list = asList(1,2,3,4,5,6,7,8,9);

    public static void main(String... args){
       list.forEach(System.out::println);
    }
}
