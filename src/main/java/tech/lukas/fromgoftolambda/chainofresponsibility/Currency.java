package tech.lukas.fromgoftolambda.chainofresponsibility;

/**
 * Created by lukas on 12.04.16.
 */
public class Currency {

    private int amount;

    public Currency(int amount){
        this.amount = amount;
    }

    public int getAmount(){
        return this.amount;
    }
}
