package constructor;


import constructor.classes.Account;

public class ConstructorMain {
    public static void main(String[] args) {

        Account acc1=new Account(2287,"AYESHA");
        Account acc2=new Account(2288,"NILU",56000);

        acc1.info();
        acc2.info();
        acc2.transferMoney(acc1,1200);
        acc1.info();
        acc2.info();




    }

}
