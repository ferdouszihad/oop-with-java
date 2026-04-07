package oop.class_object.classes;

import java.time.LocalDateTime;

public class Account {
    public int accNo;
    public String accName;
    public int balance;

    public void deposit(int money){
        if( money <= 0){
            System.out.println("Deposit unsuccessful");
            return;
        }
        this.balance= balance+money;
        System.out.println(money +" TK Added to Acc_No "+accNo+" ( "+ accName+ " ) at "+ LocalDateTime.now().toLocalDate());
        getCurrentBalance();
    }
    public void withdraw(int money){

        if(balance < money){
            System.out.println("Insufficient Balance");
            return;
        }

        this.balance= balance-money;


        System.out.println(money +" TK withdrawn from Acc_No "+accNo+" ( "+ accName+ " ) at "+ LocalDateTime.now().toLocalDate());
        getCurrentBalance();
    }

    public void getCurrentBalance(){
        System.out.println("Your Current Balance : "+balance+" BDT");

    }

    public void info(){
        System.out.println("- Account Info ----------------");
        System.out.println("- Name : "+accName);
        System.out.println("- Account No : "+accNo);
        System.out.println("- Available Balance : "+balance);
        System.out.println("-------------------------------");

    }


}
