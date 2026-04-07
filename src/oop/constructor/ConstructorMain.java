package oop.constructor;


import oop.constructor.classes.Account;
import oop.record.TransactionRecord;

import java.time.LocalDateTime;

public class ConstructorMain {
    public static void main(String[] args) {

        Account acc1=new Account(2287,"AYESHA");
        Account acc2=new Account(2288,"NILU",56000);

        acc1.info();
        acc2.info();
        boolean isSuccess=acc2.transferMoney(acc1,1200);
        if(isSuccess){
            TransactionRecord tr=new TransactionRecord(
                    1200,
                    "send_money",
                    acc2.accNo,
                    acc1.accNo,
                    LocalDateTime.now());

            System.out.println(tr.toString());
        }
        acc1.info();
        acc2.info();




    }

}
