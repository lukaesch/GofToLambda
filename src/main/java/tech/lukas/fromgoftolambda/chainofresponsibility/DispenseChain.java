package tech.lukas.fromgoftolambda.chainofresponsibility;

/**
 * Created by lukas on 12.04.16.
 */
public abstract class DispenseChain {
    abstract void setNextChain(DispenseChain chain);
    abstract void dispense(Currency currency);

}
