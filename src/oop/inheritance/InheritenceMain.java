package oop.inheritance;


import oop.inheritance.classes.HajjAccount;
import oop.inheritance.classes.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class InheritenceMain {
    public static void main(String[] args) {

        HajjAccount acc1=new HajjAccount(101,"DHJ",5000,5,"premium");

        SavingsAccount acc2=new SavingsAccount(102,"SA1","Mudaraba");

        acc1.withDrawMoney(1000,1234);
        acc2.withDrawMoney(1000,1234);

        List<Integer> numbers= new ArrayList<>();
        numbers.add(10);
        numbers.add(6);
        numbers.add(16);
        numbers.add(2);

            System.out.println("Numbers ===");
            
        for(int num : numbers){
            System.out.println(num);
        }


    }
}
