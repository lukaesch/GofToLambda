package tech.lukas.fromgoftolambda.iterator;

import java.util.Iterator;

import static java.util.Arrays.asList;

/**
 * Created by lukas on 11.04.16.
 */
public class IteratorGof {
    static final java.util.List<Integer> list = asList(1,2,3,4,5,6,7,8,9);

    public static void main(String... args){
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
