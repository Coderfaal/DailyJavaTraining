package Login;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        UserRegristration us = new UserRegristration();
        User user= us.registerUser();

        Login l = new Login();

        l.login(user);


    }



}
