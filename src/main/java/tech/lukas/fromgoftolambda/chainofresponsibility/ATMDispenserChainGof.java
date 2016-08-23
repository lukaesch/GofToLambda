package tech.lukas.fromgoftolambda.chainofresponsibility;

import java.util.Scanner;

/**
 * Created by lukas on 12.04.16.
 */
public class ATMDispenserChainGof {

    public class Euro10Dispenser extends DispenseChain {

        DispenseChain chain;

        @Override
        public void setNextChain(DispenseChain nextChain) {
            this.chain = nextChain;
        }

        @Override
        public void dispense(Currency currency) {
            if(currency.getAmount() >= 10){
                int num = currency.getAmount() / 10;
                int remainder = currency.getAmount() % 10;
                System.out.println("Dispensing " + num + " 10€ note");
                if(remainder != 0) this.chain.dispense(new Currency(remainder));
            } else {
                this.chain.dispense(currency);
            }
        }
    }

    public class Euro20Dispenser extends DispenseChain {

        DispenseChain chain;

        @Override
        public void setNextChain(DispenseChain nextChain) {
            this.chain = nextChain;
        }

        @Override
        public void dispense(Currency currency) {
            if(currency.getAmount() >= 20){
                int num = currency.getAmount() / 20;
                int remainder = currency.getAmount() % 20;
                System.out.println("Dispensing " + num + " 20€ note");
                if(remainder != 0) this.chain.dispense(new Currency(remainder));
            } else {
                this.chain.dispense(currency);
            }
        }
    }

    public class Euro50Dispenser extends DispenseChain {

        DispenseChain chain;

        @Override
        public void setNextChain(DispenseChain nextChain) {
            this.chain = nextChain;
        }

        @Override
        public void dispense(Currency currency) {
            if(currency.getAmount() >= 50){
                int num = currency.getAmount() / 50;
                int remainder = currency.getAmount() % 50;
                System.out.println("Dispensing " + num + " 50€ note");
                if(remainder != 0) this.chain.dispense(new Currency(remainder));
            } else {
                this.chain.dispense(currency);
            }
        }
    }

    private DispenseChain c1;

    public ATMDispenserChainGof() {
        this.c1 = new Euro50Dispenser();
        DispenseChain c2 = new Euro20Dispenser();
        DispenseChain c3 = new Euro10Dispenser();

        //set chain of responsiblity
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String... args){
        ATMDispenserChainGof atmDispenser = new ATMDispenserChainGof();
        while(true){
            int amount = 0;
            System.out.println("Enter amout to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if(amount % 10 != 0) {
                System.out.println("Amount should be multiple of 10s");
                return;
            }
            atmDispenser.c1.dispense(new Currency(amount));
        }
    }
}
