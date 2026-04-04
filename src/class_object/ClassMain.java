package class_object;

import class_object.classes.Account;

public class ClassMain {
    public static void main(String[] args) {

        Account acc1=new Account();
        acc1.accNo=22581;
        acc1.accName="F M ZAHIDUL ISLAM";
        acc1.balance=0;
        acc1.info();
        acc1.deposit(-900);
        acc1.deposit(100);
        acc1.withdraw(45);
        acc1.withdraw(56);






    }
}
