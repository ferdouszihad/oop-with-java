package collection.project.db;

import collection.project.entity.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDB {
    List<User> userDb= new ArrayList<>();
//    private static int id=0;

    public  UserDB() {
        System.out.println("Database Created Succesfully");
    }

    public void  showAllUser(){
        System.out.println("Showing All User");
        System.out.println("id\t\tname\t\t\tisOnline\t\trole");
        for(User user : userDb) user.print();
        System.out.println("----------------------");
    }
    public void addUser( int id, String name , boolean isActive){
        User newUser=new User(id,name,isActive);
        userDb.add(newUser);
        System.out.println("User add with id "+newUser.getId());
    }
    public void addRoleToUser(int id , String role){
        for(User user: userDb) if(user.getId()==id) {
            user.addRole(role);
            System.out.println( user.getName()+" is a  "+role+" now");
            return;
        }
        System.out.println( "user not found");

    }
    public void showActiveUser(){
        System.out.println("Showing  Active Users");
        System.out.println("id\t\tname\t\t\tisOnline\t\trole");
        for(User user : userDb) if(user.isActive()) user.print();
        System.out.println("----------------------");
    }

    public void removeInactiveUser(){
        userDb.removeIf(user -> !user.isActive());
//        for(User user : userDb) if(!user.isActive()) userDb.remove(user);
        System.out.println("Remove Operation Run successfully ");
        showAllUser();
    }
    public void countUserWithRole(String role){
        int count=0;
        for(User user: userDb){
           if(user.getRoles().contains(role)) {
               count++;
           }
        }
        System.out.println(count + " user found with role "+role);
        printUserWithRole(role);
    }
    public void printUserWithRole(String role){
        System.out.println("Showing  User with Role " + role);
        System.out.println("id\t\tname\t\t\tisOnline\t\trole");
        for(User user:userDb) if(user.getRoles().contains(role)) user.print();

    }
}
