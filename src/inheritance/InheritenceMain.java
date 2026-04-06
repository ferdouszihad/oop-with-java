package inheritance;


import inheritance.classes.Account;
import inheritance.classes.DepositAccount;
import inheritance.classes.HajjAccount;
import inheritance.classes.SavingsAccount;

public class InheritenceMain {
    public static void main(String[] args) {

        HajjAccount acc1=new HajjAccount(101,"DHJ",5000,5,"premium");

        SavingsAccount acc2=new SavingsAccount(102,"SA1","Mudaraba");

        acc1.withDrawMoney(1000,1234);
        acc2.withDrawMoney(1000,1234);


    }
}
