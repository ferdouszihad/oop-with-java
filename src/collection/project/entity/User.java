package collection.project.entity;

import java.util.HashSet;
import java.util.Set;

public class User {
    private final int id;
    private String name;
    private Set<String> roles;
    private boolean isActive;

    //    methods
    public void sayHi() {
        System.out.println("Hello !! I am  " + name.split(" ")[0]);
    }

    public void print() {

        System.out.println(id + "\t\t" + name + "\t\t\t" + isActive + "\t\t" + roles);
    }
    public void addRole(String role){
        this.roles.add(role);

    }
    public void removeRole(String role){
        this.roles.remove(role);
    }
    public void printRoles(){
        for(String role:roles) System.out.print(role+" | ");
        System.out.println();
    }




    public User(int id, String name, boolean isActive) {
        this.id = id;
        this.name = name;
        this.isActive = isActive;
        this.roles=new HashSet<>();
    }

    // Getter Setter
    public int getId() {
        return id;
    }

    public Set<String> getRoles() {return roles;}

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
