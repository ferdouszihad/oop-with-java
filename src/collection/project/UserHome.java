package collection.project;

import collection.project.db.UserDB;
import collection.project.entity.User;

public class UserHome {
    public static void main(String[] args) {
        // DB
        UserDB userDB = new UserDB();

        userDB.addUser(1,"eemu",true);
        userDB.addUser(2,"zihad",false);
        userDB.addUser(3,"saoda",true);
        userDB.addUser(4,"pushpo",false);
        userDB.addUser(5,"brishti",true);

        userDB.addRoleToUser(1,"wife");
        userDB.addRoleToUser(1,"friend");
        userDB.addRoleToUser(1,"love");
        userDB.addRoleToUser(1,"love");
        userDB.addRoleToUser(1,"love");
        userDB.addRoleToUser(1,"family");



        userDB.addRoleToUser(3,"love");
        userDB.addRoleToUser(3,"family");

        userDB.addRoleToUser(4,"family");

        userDB.addRoleToUser(5,"friend");

        userDB.showAllUser();
        userDB.showActiveUser();
        userDB.countUsersByRoles();
        userDB.countUserWithRole("love");
        userDB.countUserWithRole("friend");
        userDB.countUserWithRole("wife");

//        userDB.removeInactiveUser();






    }
}
