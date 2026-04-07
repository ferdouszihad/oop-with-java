package oop.constructor.classes;

import java.time.LocalDateTime;

public class Account {
    public int accNo;
    public String accName;
    public int balance;

    public Account(int accNo, String accName, int balance) {
        this.accNo = accNo;
        this.accName = accName;
        this.balance = balance;
        if(this.balance < 0) this.balance=0;
    }
    public Account(int accNo, String accName) {
        this.accNo = accNo;
        this.accName = accName;
        this.balance = 0;

    }

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

    public boolean transferMoney(Account account, int amount){
        if(this.balance<amount){
            System.out.println("Insufficient Amount for transfer");
            return false;
        }
        this.balance-=amount;
        account.balance+=amount;
        System.out.println(amount +" TK tranfer from Acc_No "+accNo+" ( "+ accName+ " ) to "+ account.accNo+ "( "+ account.accName+ " )+ at "+ LocalDateTime.now().toLocalDate());

        return true;



    }

    public void info(){
        System.out.println("- Account Info ----------------");
        System.out.println("- Name : "+accName);
        System.out.println("- Account No : "+accNo);
        System.out.println("- Available Balance : "+balance);
        System.out.println("-------------------------------");

    }


}
