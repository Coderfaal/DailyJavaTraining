package Login;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserService {
 private User[] user =new User[10];
     int count=0;

    public void register(String userName,String password){
       // user.add(new User(userName,password));
        if(!isValidPassword(password)){
            System.out.println("Password is doesnt contain uppercase,lowercase,special characters");
            return;
        }if (count>user.length) {
            System.out.println("user limit reached :");
            return;
            }
        user[count++]=new User(userName, password);
        System.out.println("user registered");

    }

    public void login(String userName,String password){

        for(int i = 0; i<count; i++) {
            if(user[i].getUserName().equals(userName)&&user[i].getPassword().equals(password)){
                System.out.println("success login");
            }else {
                System.out.println("invalid username password");
            }



        }

    }



    public boolean isValidPassword(String password){
        if(password.length()<8)return false;
        if(!password.matches(".*[A-Z]*."))return false;
        if (!password.matches(".*[a-z]*."))return false;
        return true;
    }
    public boolean isValidUser(String userName){
        if(userName.length()<10)return false;
        if(!userName.matches(".*[A-Z]*.")) return false;
        if(!userName.matches(".*[a-b]*."))return false;
        return true;
    }

}
