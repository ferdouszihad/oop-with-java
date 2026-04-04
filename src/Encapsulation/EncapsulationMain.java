package Encapsulation;

import Encapsulation.classes.Account;

public class EncapsulationMain {
    public static void main(String[] args) {

        Account acc1=new Account(101,"Zihad",50000);
        acc1.info();
        Account acc2=new Account(102,"EMu",597);
        acc2.info();
        acc1.setBalance(-999);
        acc1.info();
        acc1.transferMoney(acc2,5600);



    }
}
