package functional_programming.methodReferencing;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferencingDemo {
    public static void main(String[] args) {
        List<String> friends= Arrays.asList("emu","brishti","sabikon","madhuri");
       //printing Friends - 01
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        for(String friend : friends) {
            System.out.println(friend);
        }

        //printing Friends - 02
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        for(int i=0;i<friends.size();i++){
            System.out.println(friends.get(i));
        }

        //printing Friends - 03
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        friends.forEach(new Consumer<String>() {
            @Override
            public void accept(String friend) {
                System.out.println(friend);
            }
        });

        //printing Friends - 03
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        friends.forEach(friend->{
            System.out.println(friend);
        });

        //printing Friends - 03
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        friends.forEach(System.out::println);


        System.out.println("~~~~~~~~~~~~~~~~~~~~~\n\n");
    }
}
