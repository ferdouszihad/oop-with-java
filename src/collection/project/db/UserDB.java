package collection.project.db;

import collection.project.entity.User;

import java.util.*;

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

    public void countUsersByRoles()
    {
        Map<String,Integer> countRoles=new HashMap<>();
        for(User user : userDb){
            for(String role : user.getRoles()){
                countRoles.put(role, countRoles.getOrDefault(role,0)+1);
            }

        }
        showRolesDetail(countRoles);

    }
    public void showRolesDetail(Map<String,Integer> roles){
        System.out.println("Showing Roles and Users");
        System.out.println("roles\t\t\tuserCount");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//        Iterator<Map<String,Integer>> It= new Map<String,Integer>;
        for(String key:roles.keySet()){
            System.out.println(key+"\t\t\t"+roles.get(key));
        }

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
