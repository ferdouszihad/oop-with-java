package collection.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<String> users=new ArrayList<>();

        users.add("mukesh");
        users.add("rakesh");
        users.add("takesh");
        users.add("pakesh");
        users.add("sexa");

        for(String user:users) System.out.println(user);




    }
}
