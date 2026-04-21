package functional_programming.functionalInterface;

import functional_programming.functionalInterface.interfaces.Camera;
import functional_programming.functionalInterface.interfaces.SumCalculator;

public class functionalInterfaceMain {


    public static void main(String[] args) {
        Camera camer1=new Camera() {
            @Override
            public void captureImage() {
                System.out.println("Image captured");
            };
        };

        Camera camera2=()->{
            System.out.println("Image Captured Lambda");
        };

        Camera camera3=()->System.out.println("Image Captured single line lambda");
//        int n1=10,n2=12;

        SumCalculator sc1=(int n1,int n2)-> (n1*n2)+(n2*n2);

        System.out.println( sc1.add2Number(1,2));
       ;
    }



}
