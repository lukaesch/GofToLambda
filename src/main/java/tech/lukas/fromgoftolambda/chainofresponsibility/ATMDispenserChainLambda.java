package tech.lukas.fromgoftolambda.chainofresponsibility;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lukas on 12.04.16.
 */
public class ATMDispenserChainLambda {

    public static int dispend(int denom, int val){

        int num = val / denom;
        if(num!=0)
            System.out.println("Dispensing  " + num);
        return val % denom;
    }

    public static void main(String ... arg){
        System.out.println("NUTTE");
        int input = 210;
        List<Integer> out = Arrays.asList(input).stream()
                .map(n -> dispend(50, n))
                .map(n -> dispend(20, n))
                .map(n -> dispend(10, n))
                .collect(Collectors.toList());
        out.stream().forEach(x -> System.out.println("xx: " + x));
    }
}
