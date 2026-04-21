package functional_programming.functionalInterface;

import functional_programming.functionalInterface.interfaces.Camera;

import functional_programming.functionalInterface.interfaces.SumCalculator;

import java.util.Scanner;
import java.util.function.Function;

public class functionalInterfaceMain {

       public static Function<Double,Double> cashoutBkash=(Double money)-> money*.0175;
       public static Function<Double,Double> cashoutNagad=(Double money)-> money*.0135;
       public static Function<Double,Double> cashoutIcash=cashoutBkash.andThen(cashoutNagad);
    public static void main(String[] args) {

//        CashoutCharge bkashCashOutCharge=(double money)-> money * .0175;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Money for Cashout");
        Double money=scan.nextDouble();
        System.out.printf("Bkash Cashout Charge is %.3f BDT\n",cashoutBkash.apply(money));
        System.out.printf("Nagad Cashout Charge is %.3f BDT\n",cashoutNagad.apply(money));
        System.out.printf("ICASH Cashout Charge is %.3f BDT\n",cashoutIcash.apply(money));

        new Thread(()->System.out.println("Thread Running")).start();


    }



}

//Camera camer1=new Camera() {
//    @Override
//    public void captureImage() {
//        System.out.println("Image captured");
//    };
//};
//
//Camera camera2=()->{
//    System.out.println("Image Captured Lambda");
//};
//
//Camera camera3=()->System.out.println("Image Captured single line lambda");
////        int n1=10,n2=12;
//
//SumCalculator sc1=(int n1,int n2)-> (n1*n2)+(n2*n2);
//
//        System.out.println( sc1.add2Number(1,2));
